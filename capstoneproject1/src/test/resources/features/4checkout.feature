Feature: Checkout Flow
Scenario Outline: Complete checkout flow with different shipping details
Given User opens sign-in page for checkout
When User signs in for checkout
And User searches product "iphone12" for checkout
And User adds the product to cart
And User clicks on checkout
And User provides shipping details "<firstName>", "<lastName>", "<address>", "<province>", "<postCode>"
And User submits the checkout form
Then Order should be placed successfully
Examples:
    | firstName | lastName | address       | province     | postCode |
    | huj       | guh       | 123 Street    | dehbucde     | 90001    |
    | fdtt      | jgi      | 456 gjbhu     | cbuyeed      | 75001    |
    | guhj      | gubh     | 789 igygh     | byuyu        | 33101    |








