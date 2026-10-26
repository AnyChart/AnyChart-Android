// @ts-check
const { defineConfig, devices } = require('@playwright/test');

module.exports = defineConfig({
  testDir: __dirname,
  testMatch: /.*\.spec\.js/,
  timeout: 30000,
  fullyParallel: false,
  workers: 1,
  retries: 0,
  reporter: [['list'], ['html', { open: 'never', outputFolder: 'playwright-report' }]],
  expect: { toHaveScreenshot: { maxDiffPixelRatio: 0.002 } },
  use: {
    baseURL: 'http://localhost:4173',
    viewport: { width: 412, height: 732 },   // a phone in CSS pixels
    deviceScaleFactor: 1,
    screenshot: 'only-on-failure',
  },
  projects: [{ name: 'chromium', use: { ...devices['Desktop Chrome'], viewport: { width: 412, height: 732 }, deviceScaleFactor: 1 } }],
  webServer: { command: 'node serve.js', port: 4173, reuseExistingServer: true, cwd: __dirname },
});
