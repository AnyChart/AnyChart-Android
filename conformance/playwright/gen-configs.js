// Writes conformance configs for chart types by letting the engine serialise them: each chart is
// built through its JS factory with sample data, chart.toJson() becomes the config file, and the
// file is round-tripped through anychart.fromJson() with the empty-vs-full shape check before it
// is kept. Run with the conformance server up: node gen-configs.js [name ...]
// ponytail: a generator, not a test. Rerun when a type's sample data changes.
'use strict';
const { chromium } = require('@playwright/test');
const fs = require('fs');
const path = require('path');

const OUT = path.resolve(__dirname, '..', 'configs');
const RUNTIME = 'http://localhost:4173/anychart-core/src/main/assets/runtime/index.html';

// name -> JS that returns a configured chart, evaluated inside the runtime page. Data forms are the
// ones the docs articles use (docs.anychart.com, Basic_Charts and Data_Sheet).
const BUILDERS = {
  'arc-diagram': `(() => {
    const chart = anychart.arcDiagram([
      {from: "Sales", to: "Marketing", weight: 9}, {from: "Sales", to: "Finance", weight: 16},
      {from: "Finance", to: "HR", weight: 5}, {from: "Support", to: "Sales", weight: 14},
      {from: "Support", to: "Marketing", weight: 6}, {from: "Marketing", to: "HR", weight: 3}]);
    chart.title("Arc diagram: department traffic"); return chart; })()`,
  'dependency-wheel': `(() => {
    const chart = anychart.dependencyWheel([
      {from: "Paris", to: "Tokyo", weight: 18}, {from: "Paris", to: "NYC", weight: 14},
      {from: "Paris", to: "Dubai", weight: 8}, {from: "Tokyo", to: "NYC", weight: 10},
      {from: "Tokyo", to: "Dubai", weight: 5}, {from: "NYC", to: "Cairo", weight: 6}, {from: "Dubai", to: "Cairo", weight: 4}]);
    chart.title("Dependency wheel: flights"); return chart; })()`,
  'dumbbell': `(() => {
    const chart = anychart.dumbbell();
    chart.dumbbell([{x: "Job A", low: 40000, high: 60000}, {x: "Job B", low: 50000, high: 80000},
      {x: "Job C", low: 35000, high: 55000}, {x: "Job D", low: 42000, high: 71000}]).name("Salary range");
    chart.title("Dumbbell: salary ranges"); return chart; })()`,
  'lollipop': `(() => {
    const chart = anychart.lollipop();
    chart.lollipop([{x: "January", value: 10000}, {x: "February", value: 12000}, {x: "March", value: 18000},
      {x: "April", value: 11000}, {x: "May", value: 9000}]).name("Sales");
    chart.title("Lollipop: monthly sales"); return chart; })()`,
  'org-chart': `(() => {
    const chart = anychart.orgChart([
      {id: "ceo", name: "Sarah Johnson", title: "CEO"},
      {id: "cto", parent: "ceo", name: "Michael Chen", title: "CTO"},
      {id: "cfo", parent: "ceo", name: "Emily Davis", title: "CFO"},
      {id: "coo", parent: "ceo", name: "Robert Wilson", title: "COO"},
      {id: "eng", parent: "cto", name: "David Kim", title: "Head of Engineering"},
      {id: "prod", parent: "cto", name: "Lisa Zhang", title: "Head of Product"},
      {id: "acct", parent: "cfo", name: "Diana Ross", title: "Head of Accounting"},
      {id: "ops", parent: "coo", name: "Peter Jackson", title: "Head of Operations"}], "as-table");
    chart.title("Org chart"); return chart; })()`,
  'stream-graph': `(() => {
    const chart = anychart.streamGraph();
    const rows = [["2019", 12, 7, 4], ["2020", 15, 9, 6], ["2021", 11, 14, 8], ["2022", 18, 12, 10], ["2023", 16, 15, 13], ["2024", 21, 13, 12]];
    const ds = anychart.data.set(rows);
    chart.area(ds.mapAs({x: 0, value: 1})).name("Rock");
    chart.area(ds.mapAs({x: 0, value: 2})).name("Jazz");
    chart.area(ds.mapAs({x: 0, value: 3})).name("Pop");
    chart.title("Stream graph: genres"); return chart; })()`,
  'waffle': `(() => {
    const chart = anychart.waffle([{name: "In-store", value: 43}, {name: "Online", value: 31},
      {name: "Wholesale", value: 17}, {name: "Other", value: 9}]);
    chart.title("Waffle: sales channels"); return chart; })()`,
  // The data sheet's toJson() omits the rows (engine gap), so the builder also returns the rows
  // and the generator writes them into config.chart.data, which host.js hands over through the API.
  'data-sheet': `(() => {
    const rows = [
      {name: "Tech", units: 408, value: 94120, children: [
        {name: "Laptop", units: 34, value: 40800}, {name: "Monitor", units: 58, value: 17400},
        {name: "Keyboard", units: 240, value: 19200}, {name: "Headset", units: 76, value: 16720}]},
      {name: "Office", units: 140, value: 28520, children: [
        {name: "Chair", units: 120, value: 18000}, {name: "Desk", units: 12, value: 5400},
        {name: "Lamp", units: 0, value: 0}, {name: "Cabinet", units: 8, value: 5120}]}];
    const chart = anychart.dataSheet(rows);
    chart.column(0, {field: "name", title: "Product", width: 160});
    chart.column(1, {field: "units", title: "Units", width: 100, dataType: "number"});
    chart.column(2, {field: "value", title: "Value", width: 120, dataType: "number"});
    return { chart, extra: { data: rows } }; })()`,
};

// Shapes drawn: svg marks, plus DOM cells for charts that render as HTML (the data sheet).
const COUNT_SHAPES = `(id) => document.querySelectorAll('#ac-' + id + ' svg :is(path, rect, circle, ellipse, polygon), #ac-' + id + ' [role="gridcell"], #ac-' + id + ' [role="columnheader"]').length`;

(async () => {
  const wanted = process.argv.slice(2);
  const names = wanted.length ? wanted : Object.keys(BUILDERS);
  const browser = await chromium.launch();
  const page = await browser.newPage({ viewport: { width: 412, height: 732 } });
  page.on('pageerror', e => console.log('  pageerror:', e.message.slice(0, 160)));
  await page.addInitScript({ path: path.join(__dirname, 'fake-host.js') });
  await page.goto(RUNTIME);
  await page.waitForFunction(() => window.__acMessages.some(m => m.type === 'ready'));

  let failures = 0;
  for (const name of names) {
    const builder = BUILDERS[name];
    if (!builder) { console.log(name, ': no builder'); failures++; continue; }
    const result = await page.evaluate(async ({ name, builder, counter }) => {
      const count = eval(counter);
      const sleep = ms => new Promise(r => setTimeout(r, ms));
      const sent = () => window.__acMessages;
      try {
        // 1. build through the factory and serialise
        const built = eval(builder);
        const chart = built.chart || built;
        const json = chart.toJson();
        if (built.extra) Object.assign(json.chart || json.gauge || json.map || json.gantt, built.extra);
        chart.dispose();
        // 2. round-trip the serialised form through the protocol
        const before = sent().length;
        window.AnyChartRuntime.receive(JSON.stringify({ type: 'load', id: name, config: json }));
        for (let i = 0; i < 50 && !sent().slice(before).some(m => m.type === 'rendered' || m.type === 'error'); i++) await sleep(100);
        const msgs = sent().slice(before);
        const err = msgs.find(m => m.type === 'error');
        if (err) return { ok: false, reason: 'fromJson: ' + err.message };
        const full = count(name);
        // 3. the same config without its data must draw fewer shapes
        const stripped = JSON.parse(JSON.stringify(json));
        const root = stripped.chart || stripped.gauge || stripped.map || stripped.gantt;
        delete root.data; delete root.series; delete root.treeData;
        window.AnyChartRuntime.receive(JSON.stringify({ type: 'load', id: name + '-empty', config: stripped, rect: { x: 0, y: 0, width: 10, height: 10 } }));
        await sleep(600);
        const empty = count(name + '-empty');
        window.AnyChartRuntime.receive(JSON.stringify({ type: 'dispose', id: name }));
        window.AnyChartRuntime.receive(JSON.stringify({ type: 'dispose', id: name + '-empty' }));
        if (!(full > empty)) return { ok: false, reason: `draws ${full} shapes, ${empty} without data` };
        return { ok: true, json, full, empty, bytes: JSON.stringify(json).length };
      } catch (e) {
        return { ok: false, reason: 'build: ' + (e && e.message || e) };
      }
    }, { name, builder, counter: COUNT_SHAPES });
    if (result.ok) {
      fs.writeFileSync(path.join(OUT, `${name}.json`), JSON.stringify(result.json, null, 2) + '\n');
      console.log(`${name.padEnd(18)} ok   shapes ${result.full} vs ${result.empty} empty, ${result.bytes} bytes -> configs/${name}.json`);
    } else {
      failures++;
      console.log(`${name.padEnd(18)} FAIL ${result.reason}`);
    }
  }
  await browser.close();
  process.exit(failures ? 1 : 0);
})();
