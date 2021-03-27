Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given user is already is on Login Page
    When title of Login Page is FreeCRM
    Then user clicks on login button first time
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user moves to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser

    Examples:
              | username              | password | firstname | lastname | position |
              | Lokeshnp77@gmail.com  | F!rew0rk | Tom 	     | Peter    | Manager  |
              | Lokeshnp77@gmail.com  | F!rew0rk | David 	  | Dsouza   | Director |
