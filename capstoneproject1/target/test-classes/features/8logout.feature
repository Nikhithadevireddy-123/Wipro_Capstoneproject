Feature: Logout

  Scenario: Logout after successful login
    Given User opens sign-in page for logout
    When User signs in to prepare logout
    And User clicks logout action
    Then User should be logged out successfully

