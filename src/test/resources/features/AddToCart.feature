@test1
Feature: Adding item to the cart

  Scenario: Searching and adding item to the cart
    #Given Launch Application2
    Given The user navigates to the nonCommerce portal
    When the user enters item name "HTC One Mini Blue" in the search field
    And the user clicks on the Search button