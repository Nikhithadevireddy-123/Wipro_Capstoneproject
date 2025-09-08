Feature: BStack demo Search
Scenario Outline: Successful product search in BStack demo
  Given User is on BStack demo home page
  When Enter product name "<productName>" in search bar
  Then Search results should be displayed

Examples:
  | productName |
  | iPhone 12   |
  | Samsung Galaxy S20 |
  

