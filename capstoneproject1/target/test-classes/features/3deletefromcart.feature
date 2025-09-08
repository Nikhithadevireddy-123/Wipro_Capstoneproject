Feature: Delete from Cart
Scenario: Successfully delete a product from cart
Given User is on BStack demo home page for delete
When User searches product "iPhone 12" to delete
And Add the product to the cart for delete
And Remove the product from the cart
Then Successfully deleted from cart






