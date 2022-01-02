#Cucumber Expressions or Regular Expressions
#Cucumber Expression is an alternative to Regular expression with more intuitive syntax

@feature1
Feature: Add to cart

  Scenario: Navigate to store, add product to the cart, click view cart link to navigate to the cart and verify
    Given I'm on the home page and I navigate to the Store page by pressing "Store" menu option
    When I click "Add To Cart" button next to the product "Blue Shoes"
    Then the "Add to cart" button changes and a tick mark is shown on it
    Then "View Cart" link is shown
    When I click on the "View Cart" link
    Then I am navigated to cart page
    When I fetch the product name and quantity
    Then the product name is "Blue Shoes"
    And the product quantity is 1