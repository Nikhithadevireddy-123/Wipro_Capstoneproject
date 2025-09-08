Feature: Favourites management
Scenario: Add item to favourites and open favourites page
Given User opens sign-in page for favourites
When User signs in to manage favourites
And User marks the first product as favourite
And User opens the Favourites page
Then Favourites should display without errors








