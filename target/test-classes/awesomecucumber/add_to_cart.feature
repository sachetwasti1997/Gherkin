Feature: dummy feature for adding items to cart
  Scenario Outline: dummy scenario socasing parameters
    Given I'm on the Store page
    When I add a "<product_name>" in the cart
    Then I see 1.5 "<product_name>" in the cart

    Examples:
    | product_name |
    | Blue Shoes   |