// @ts-check
// The runtime page under the host protocol, driven exactly as an Android host would
// drive it: messages in through AnyChartRuntime.receive, messages out through
// AnyChartHost.postMessage. Every conformance config must render; the scenarios
// below cover what broke for 1.x users (several charts, data update, events,
// reading state back, quotes in labels).
const { test, expect } = require('@playwright/test');
const fs = require('fs');
const path = require('path');

const RUNTIME = '/anychart-core/src/main/assets/runtime/index.html';
const CONFIGS = path.resolve(__dirname, '..', 'configs');
const configFiles = fs.readdirSync(CONFIGS).filter(f => f.endsWith('.json')).sort();
const readConfig = f => JSON.parse(fs.readFileSync(path.join(CONFIGS, f), 'utf8'));

/** @param {import('@playwright/test').Page} page */
async function openRuntime(page) {
  await page.addInitScript({ path: path.join(__dirname, 'fake-host.js') });
  await page.goto(RUNTIME);
  await page.waitForFunction(() => window.__acMessages.some(m => m.type === 'ready'));
  return page.evaluate(() => window.__acMessages.find(m => m.type === 'ready'));
}

const send = (page, m) => page.evaluate(m => window.AnyChartRuntime.receive(JSON.stringify(m)), m);
const messages = page => page.evaluate(() => window.__acMessages);
const waitFor = (page, pred) => page.waitForFunction(src => (new Function('m', 'return ' + src))(window.__acMessages), pred);
const rendered = (page, id) => waitFor(page, `m.some(x => x.type === 'rendered' && x.id === '${id}')`);
const errorsOf = async page => (await messages(page)).filter(m => m.type === 'error');
// svg marks, plus DOM cells for charts that render as HTML (the data sheet)
const countShapes = (page, id) => page.locator(`#ac-${id} svg :is(path, rect, circle, ellipse, polygon), #ac-${id} [role="gridcell"], #ac-${id} [role="columnheader"]`).count();
// DSL twins: the documents anychart-dsl's TwinsTest writes from Kotlin for each conformance config
// (committed under conformance/twins, kept in step by that test). Each must render exactly like its
// config, i.e. match the config's reference picture. Where the config is an engine state dump
// (arc diagram, waffle...) this is the twin's only oracle.
const TWINS = path.resolve(__dirname, '..', 'twins');
const twinFiles = fs.existsSync(TWINS) ? fs.readdirSync(TWINS).filter(f => f.endsWith('.json')).sort() : [];
const stripData = cfg => { const c = JSON.parse(JSON.stringify(cfg)); const root = c.chart || c.gauge || c.map || c.gantt; delete root.data; delete root.series; delete root.treeData; return c; };

test.describe('runtime page', () => {
  test('announces itself with the bundled JS version', async ({ page }) => {
    const ready = await openRuntime(page);
    expect(ready.jsVersion).toMatch(/^9\.0\.0/);
    expect(ready.runtimeVersion).toBe('1.0.0');   // protocol 1.0, anychart-core/PROTOCOL.md
    expect(ready.timing).toEqual(expect.objectContaining({ readySent: expect.any(Number) }));
  });

  for (const file of configFiles) {
    const id = file.replace(/\.json$/, '');
    test(`renders ${id}`, async ({ page }) => {
      await openRuntime(page);
      await send(page, { type: 'load', id, config: readConfig(file) });
      await rendered(page, id);
      expect(await errorsOf(page)).toEqual([]);
      // svg for drawn charts, a grid for the data sheet, which renders as HTML
      await expect(page.locator(`#ac-${id} svg, #ac-${id} [role="grid"]`).locator('visible=true').first()).toBeVisible();
      const r = (await messages(page)).find(m => m.type === 'rendered' && m.id === id);
      expect(r.ms).toBeGreaterThanOrEqual(0);
      // An empty chart still fires chartDraw and still has an svg (title, credits, axes). Real data
      // leaves marks. Compare against the same config with its data stripped: the real one must
      // draw strictly more shapes. This is what caught the first tree map config rendering blank.
      const shapes = await countShapes(page, id);
      await send(page, { type: 'load', id: `${id}-empty`, config: stripData(readConfig(file)), rect: { x: 0, y: 0, width: 10, height: 10 } });
      await rendered(page, `${id}-empty`);
      const emptyShapes = await countShapes(page, `${id}-empty`);
      await send(page, { type: 'dispose', id: `${id}-empty` });
      expect(shapes, `${id} drew ${shapes} shapes, the same config without data draws ${emptyShapes}`).toBeGreaterThan(emptyShapes);
      await page.waitForTimeout(200); // let the last animation frame settle before the picture
      await expect(page).toHaveScreenshot(`${id}.png`);
    });
  }

  test('every conformance config has a DSL twin', async () => {
    expect(twinFiles).toEqual(configFiles);
  });

  for (const file of twinFiles) {
    const id = file.replace(/\.json$/, '');
    test(`DSL twin of ${id} renders like its config`, async ({ page }) => {
      await openRuntime(page);
      await send(page, { type: 'load', id, config: JSON.parse(fs.readFileSync(path.join(TWINS, file), 'utf8')) });
      await rendered(page, id);
      expect(await errorsOf(page)).toEqual([]);
      await page.waitForTimeout(200);
      await expect(page).toHaveScreenshot(`${id}.png`);
    });
  }

  test('two charts in one page render independently', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'top', config: readConfig('pie.json'), rect: { x: 0, y: 0, width: 412, height: 366 } });
    await send(page, { type: 'load', id: 'bottom', config: readConfig('column.json'), rect: { x: 0, y: 366, width: 412, height: 366 } });
    await rendered(page, 'top');
    await rendered(page, 'bottom');
    expect(await errorsOf(page)).toEqual([]);
    await expect(page.locator('#ac-top svg').first()).toBeVisible();
    await expect(page.locator('#ac-bottom svg').first()).toBeVisible();
    await page.waitForTimeout(200);
    await expect(page).toHaveScreenshot('scenario-two-charts.png');
  });

  test('update replaces data without a reload', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'u', config: readConfig('pie.json') });
    await rendered(page, 'u');
    const before = await page.locator('#ac-u svg').count();
    await send(page, { type: 'update', id: 'u', data: [{ x: 'Only one', value: 1 }] });
    await page.waitForTimeout(300);
    expect(await errorsOf(page)).toEqual([]);
    // Same stage, same svg element count: the chart was not torn down.
    expect(await page.locator('#ac-u svg').count()).toBe(before);
    const json = await (async () => {
      await send(page, { type: 'query', id: 'u', requestId: 'q1', what: 'json' });
      await waitFor(page, `m.some(x => x.type === 'answer' && x.requestId === 'q1')`);
      return (await messages(page)).find(m => m.type === 'answer' && m.requestId === 'q1').result;
    })();
    expect(JSON.stringify(json)).toContain('Only one');
    expect(JSON.stringify(json)).not.toContain('Apples');
  });

  test('a tap on a point comes back as a typed event, and the selection can be queried', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'ev', config: readConfig('column.json'), events: ['pointClick'] });
    await rendered(page, 'ev');
    // Click the tallest column: last point, near the top of the plot.
    const box = await page.locator('#ac-ev').boundingBox();
    await page.mouse.click(box.x + box.width * 0.9, box.y + box.height * 0.55);
    await waitFor(page, `m.some(x => x.type === 'event' && x.id === 'ev' && x.event === 'pointClick')`);
    const ev = (await messages(page)).find(m => m.type === 'event' && m.id === 'ev');
    expect(ev.data.x).toBe('Eyeliner');
    expect(ev.data.value).toBe(213210);
    expect(ev.data.series).toBe('Revenue');
    await send(page, { type: 'query', id: 'ev', requestId: 'q2', what: 'selectedPoints' });
    await waitFor(page, `m.some(x => x.type === 'answer' && x.requestId === 'q2')`);
    const ans = (await messages(page)).find(m => m.type === 'answer' && m.requestId === 'q2');
    expect(ans.result.map(p => p.x)).toEqual(['Eyeliner']);
  });

  test.describe('callbacks', () => {
    // The three carriers of a function-valued setting: an engine token string, a host callback
    // ({"$fn": name}, answered by the fake host's AnyChartCallbacks.invoke) and verbatim JavaScript
    // ({"$js": body}). The sankey sample from the playground (energy flows) is the subject.
    const withCallbacks = () => {
      const cfg = readConfig('sankey.json');
      cfg.chart.node.normal.labels.format = { $fn: 'nodeLabel' };
      cfg.chart.node.tooltip.format = { $fn: 'nodeTip' };
      cfg.chart.flow.normal = { fill: { $js: "return '#ff0000'" } };
      return cfg;
    };
    const install = page => page.evaluate(() => {
      window.__acCallbackImpl.nodeLabel = ctx => ctx.name.toUpperCase();
      window.__acCallbackImpl.nodeTip = ctx => 'Node ' + ctx.name + ': ' + ctx.income.length + ' in, ' + ctx.outcome.length + ' out, dropoff ' + ctx.dropoff;
    });
    const answer = async (page, id, what, requestId) => {
      await send(page, { type: 'query', id, requestId, what });
      await waitFor(page, `m.some(x => x.type === 'answer' && x.requestId === '${requestId}')`);
      return (await messages(page)).find(m => m.type === 'answer' && m.requestId === requestId).result;
    };

    test('a token string is applied by the engine', async ({ page }) => {
      await openRuntime(page);
      const cfg = readConfig('sankey.json');
      cfg.chart.node.normal.labels.format = '{%name}: {%value}';
      await send(page, { type: 'load', id: 'tok', config: cfg });
      await rendered(page, 'tok');
      expect(await errorsOf(page)).toEqual([]);
      await expect(page.locator('#ac-tok').getByText('Coal: 95', { exact: true })).toBeVisible();
      const r = (await messages(page)).find(m => m.type === 'rendered' && m.id === 'tok');
      expect(r.callbacks).toEqual({ calls: 0, ms: 0 });
    });

    test('a host callback formats labels and tooltips with the context serialised', async ({ page }) => {
      await openRuntime(page);
      await install(page);
      await send(page, { type: 'load', id: 'cb', config: withCallbacks() });
      await rendered(page, 'cb');
      expect(await errorsOf(page)).toEqual([]);
      // labels: the lambda's return value is what the engine drew
      await expect(page.locator('#ac-cb').getByText('COAL', { exact: true })).toBeVisible();
      await expect(page.locator('#ac-cb').getByText('ELECTRICITY GRID', { exact: true })).toBeVisible();
      // context: the public fields, none of the engine's minified internals
      const calls = await page.evaluate(() => window.__acCallbacks);
      const coal = calls.find(c => c.fn === 'nodeLabel' && c.context.name === 'Coal');
      expect(coal.id).toBe('cb');
      expect(coal.context).toMatchObject({ name: 'Coal', value: 95, type: 'node', dropoff: 0, isConflict: false });
      expect(coal.context.income.map(i => i.name).sort()).toEqual(['Coal imports', 'Coal reserves']);
      expect(coal.context.outcome.map(i => i.name)).toEqual(['Solid']);
      for (const c of calls) for (const k of Object.keys(c.context)) expect(k, `minified key ${k} leaked`).toMatch(/^(id|x|y|to|[A-Za-z]{3,})$/);
      // cost: one synchronous round trip per label at first draw
      const r = (await messages(page)).find(m => m.type === 'rendered' && m.id === 'cb');
      expect(r.callbacks.calls).toBeGreaterThanOrEqual(calls.filter(c => c.fn === 'nodeLabel').length);
      expect(r.callbacks.ms).toBeGreaterThan(0);
      console.log(`callback round trip (Chromium, fake host): ${r.callbacks.calls} calls in ${r.callbacks.ms} ms = ${(r.callbacks.ms / r.callbacks.calls * 1000).toFixed(1)} us per call`);
      // tooltip: hover the Coal node (its label sits just above it) and read the tooltip text back
      const label = await page.locator('#ac-cb').getByText('COAL', { exact: true }).boundingBox();
      await page.mouse.move(label.x + label.width / 2, label.y + label.height + 12);
      await page.waitForTimeout(300);
      expect(await answer(page, 'cb', 'tooltipText', 'tt1')).toContain('Node Coal: 2 in, 1 out, dropoff 0');
      const stats = await answer(page, 'cb', 'callbackStats', 'cs1');
      expect(stats.calls).toBeGreaterThan(r.callbacks.calls);
    });

    test('verbatim JavaScript runs in the page', async ({ page }) => {
      await openRuntime(page);
      await install(page);
      await send(page, { type: 'load', id: 'js', config: withCallbacks() });
      await rendered(page, 'js');
      expect(await errorsOf(page)).toEqual([]);
      expect(await page.locator('#ac-js svg path[fill="#ff0000"]').count()).toBeGreaterThan(10);
    });

    test('a callback the host does not know, and a host without the channel, are reported', async ({ page }) => {
      await openRuntime(page);
      const cfg = readConfig('sankey.json');
      cfg.chart.node.normal.labels.format = { $fn: 'ghost' };
      await send(page, { type: 'load', id: 'g1', config: cfg });
      await rendered(page, 'g1');
      await page.evaluate(() => { delete window.AnyChartCallbacks; });
      await send(page, { type: 'load', id: 'g2', config: cfg });
      await rendered(page, 'g2');
      const errs = (await errorsOf(page)).map(e => `${e.id}: ${e.message}`);
      expect(errs.some(e => e.startsWith('g1: callback ghost: no callback ghost'))).toBe(true);
      expect((await errorsOf(page)).every(e => e.code === 'callback')).toBe(true);
      expect(errs.some(e => e.startsWith('g2: callback ghost: the host has no AnyChartCallbacks channel'))).toBe(true);
      // one report per chart, not one per label
      expect(errs.filter(e => e.startsWith('g2:')).length).toBe(1);
    });
  });

  test('resize re-lays out the chart into the new rect', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'rs', config: readConfig('area.json'), rect: { x: 0, y: 0, width: 412, height: 300 } });
    await rendered(page, 'rs');
    await send(page, { type: 'resize', id: 'rs', rect: { x: 0, y: 0, width: 300, height: 500 } });
    await page.waitForTimeout(300);
    expect(await errorsOf(page)).toEqual([]);
    const svgBox = await page.locator('#ac-rs svg').first().boundingBox();
    expect(Math.round(svgBox.width)).toBe(300);
    expect(Math.round(svgBox.height)).toBe(500);
  });

  test('dispose removes the chart and its container', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'd', config: readConfig('bar.json') });
    await rendered(page, 'd');
    await send(page, { type: 'dispose', id: 'd' });
    await expect(page.locator('#ac-d')).toHaveCount(0);
    expect(await errorsOf(page)).toEqual([]);
  });

  test('bad input is reported, never swallowed', async ({ page }) => {
    await openRuntime(page);
    await send(page, { type: 'load', id: 'bad', config: { chart: { type: 'no-such-chart' } } });
    await waitFor(page, `m.some(x => x.type === 'error')`);
    await page.evaluate(() => window.AnyChartRuntime.receive('{not json'));
    await send(page, { type: 'nonsense', id: 'x' });
    await send(page, { type: 'update', id: 'ghost', data: [] });
    const errs = await errorsOf(page);
    expect(errs.length).toBeGreaterThanOrEqual(4);
    expect(errs.map(e => e.message).join('\n')).toMatch(/malformed message/);
    expect(errs.map(e => e.message).join('\n')).toMatch(/unknown message type nonsense/);
    expect(errs.map(e => e.message).join('\n')).toMatch(/no chart with id ghost/);
    // every error names its class, so a host can type it without reading the message
    expect(errs.find(e => e.id === 'bad').code).toBe('bad-config');
    expect(errs.find(e => /malformed message/.test(e.message)).code).toBe('bad-message');
    expect(errs.find(e => /unknown message type/.test(e.message)).code).toBe('bad-message');
    expect(errs.find(e => e.id === 'ghost').code).toBe('unknown-chart');
  });
});
