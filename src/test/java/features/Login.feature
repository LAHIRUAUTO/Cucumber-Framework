Feature: PSS Admin Login

  Scenario: Admin home page default login
    Given User is on login page
    When User login to the application with valid username and valid password
    | AVSYSLV | pass@LV0922 |
    Then Home page is populated "true"
    And Toggle menu is displayed "true"

