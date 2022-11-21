Feature: PSS Admin Login

  Scenario Outline: Admin home page default login
    Given User is on login page
    When User login to the application with valid <username> and valid <password>
    Then Home page is populated "true"
    And Toggle menu is displayed "true"
    Examples:
      | username | password    |
      | AVSYSLV  | pass@LV0922 |

  Scenario: Check multiple scenarios on same browser session
    Given User has this scenario
    When User run this scenario
    Then It should be run on the same browser session



