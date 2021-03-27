Feature: Free CRM Login Feature


#without examples keyword
#Scenario: Free CRM Login Test Scenario
#
#  Given user is already is on login page
#  When title of login page is FreeCRM
#  Then user clicks on login button first time
#  Then user enters "lokeshnp77@gmail.com" and "F!rew0rk"
#  Then user clicks on login button
#  Then user is on home page

  #with example keyword
  Scenario Outline: Free CRM Login Test Scenario

    Given user is already is on Login Page
    When title of Login Page is FreeCRM
    Then user clicks on login button first time
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page

    Examples:
      | username              | password |
      | Lokeshnp77@gmail.com  | F!rew0rk |
      | Tomk                  | Test@123 |
