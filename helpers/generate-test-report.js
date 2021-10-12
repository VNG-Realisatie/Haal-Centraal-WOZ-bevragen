const reporter = require('cucumber-html-reporter');

const options = {
    theme: 'bootstrap',
    jsonFile: 'docs/features/test-result.json',
    output: 'docs/features/test-report.html',
    reportSuiteAsScenarios: true,
    scenarioTimestamp: true,
    launchReport: true,
    name:'Haal Centraal WOZ Bevragen API specificaties',
    brandTitle:'Haal Centraal'
};

reporter.generate(options);