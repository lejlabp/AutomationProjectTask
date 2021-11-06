Feature: Adding item to the cart

  Scenario Outline: Searching and adding item to the cart
    Given The user navigates to the nonCommerce portal
    When the user enters item name "<itemName>" in the search field
    And the user clicks on the Search button
    And the user clicks on the requested item "<itemName>"
    And the user clicks on the ADD TO CART button
    Then the user clicks on Shopping cart on the menu
    And the user validates that the requested item is successfully added to the cart "<itemName>"
    Examples:
      | itemName          |
      | HTC One Mini Blue |