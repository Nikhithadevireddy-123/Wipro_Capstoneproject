Feature: Checkout functionality

  Scenario: Complete checkout flow
    Given User opens sign-in page for checkout
    When User signs in for checkout
    And User searches a product to buy
    And User adds the product to cart
    And User clicks on checkout
    And User provides shipping details
    And User submits the checkout form
    Then Order should be placed successfully







