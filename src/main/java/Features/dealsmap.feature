Feature: Deal Data Feature

  Scenario: Free CRM Create a new deal scenario

    Given user is already on Login Page
    When title of Login Page is FreeCRM
    Then user clicks on login button first time
    Then user enters username and password
      | username             | password |
      | Lokeshnp77@gmail.com | F!rew0rk |

    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details
      | title      | amount| probability| commission |
      | test deal1 | 10020 | 50         | 10         |
      | test deal2 | 10021 | 55         | 15         |
      | test deal3 | 10022 | 56         | 23         |

    Then Close the browser