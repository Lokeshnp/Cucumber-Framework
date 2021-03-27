$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Automation/code/FreeCRMBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Feature",
  "description": "",
  "id": "deal-data-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-feature;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login Page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button first time",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "Lokeshnp77@gmail.com",
        "F!rew0rk"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal1",
        "100",
        "50",
        "10"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 34689538500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 149732200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button_first_time()"
});
formatter.result({
  "duration": 20392669900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1434677900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 173256300,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 6708470200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 4223765000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 7187639000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 2753718700,
  "status": "passed"
});
});