$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Automation/code/Cucumber-Framework/src/main/java/Features/tagging.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login with correct username and correct password",
  "description": "",
  "id": "free-crm-application-testing;login-with-correct-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "This is a valid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.this_is_a_valid_login_test()"
});
formatter.result({
  "duration": 316707300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Create a deal",
  "description": "",
  "id": "free-crm-application-testing;create-a-deal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SmokeTest"
    },
    {
      "line": 16,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "This is a deal test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.this_is_a_deal_test_case()"
});
formatter.result({
  "duration": 95300,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify left panel links",
  "description": "",
  "id": "free-crm-application-testing;verify-left-panel-links",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SmokeTest"
    },
    {
      "line": 28,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "clicking on left panel links",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.clicking_on_left_panel_links()"
});
formatter.result({
  "duration": 141300,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Search a case",
  "description": "",
  "id": "free-crm-application-testing;search-a-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@SmokeTest"
    },
    {
      "line": 40,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "This is a search case test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.this_is_a_search_case_test()"
});
formatter.result({
  "duration": 113500,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Search a task",
  "description": "",
  "id": "free-crm-application-testing;search-a-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@SmokeTest"
    },
    {
      "line": 44,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "This is a search task test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinition.this_is_a_search_task_test()"
});
formatter.result({
  "duration": 132300,
  "status": "passed"
});
});