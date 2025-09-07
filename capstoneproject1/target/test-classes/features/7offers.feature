Feature: Special offers

  Scenario: Browse offers after login
    Given User opens sign-in page to see offers
    When User logs in for offers
    And User opens the Offers page
    Then Offers content should appear

