$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("selenium.feature");
formatter.feature({
  "line": 2,
  "name": "selenium",
  "description": "",
  "id": "selenium",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Test Selenium",
  "description": "",
  "id": "selenium;test-selenium",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@single"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Check Test 1",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Check Test 2",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Check Test 3",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Check Test 4",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Check Test 5",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Check Test 6",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.i_open_chrome_browser()"
});
formatter.result({
  "duration": 6979053400,
  "status": "passed"
});
formatter.match({
  "location": "Test.i_navigate_to_home_page()"
});
formatter.result({
  "duration": 519690000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 337769400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 98427100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 207238000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 72129700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 4623434300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 11
    }
  ],
  "location": "Test.check_Test(int)"
});
formatter.result({
  "duration": 175019900,
  "status": "passed"
});
});