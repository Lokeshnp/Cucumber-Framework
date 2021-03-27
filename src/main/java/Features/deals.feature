Feature: Deal Data Feature

  Scenario: Free CRM Create a new deal scenario

    Given user is already on Login Page
    When title of Login Page is FreeCRM
    Then user clicks on login button first time
    Then user enters username and password
      | Lokeshnp77@gmail.com | F!rew0rk |

    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details
      | test deal1 | 100 | 50 | 10 |

    Then Close the browser