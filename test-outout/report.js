$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Automation/code/FreeCRMBDDFramework/src/main/java/Features/dealsmap.feature");
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
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "Lokeshnp77@gmail.com",
        "F!rew0rk"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal1",
        "10020",
        "50",
        "10"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal2",
        "10021",
        "55",
        "15"
      ],
      "line": 18
    },
    {
      "cells": [
        "test deal3",
        "10022",
        "56",
        "23"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 24092115700,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 90695400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button_first_time()"
});
formatter.result({
  "duration": 18680433501,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2605164200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 181004500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 6432565500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 8489590200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 26073277299,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 2269538300,
  "status": "passed"
});
});