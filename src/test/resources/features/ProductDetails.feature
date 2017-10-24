Feature: Product Details

  Background:
    Given The website is displayed to validate the product recipe

  @SomeTag1
  Scenario: Validate that Fleur de Sel recipe is displayed
    When The user has chosen all products
    And The user has chosen the product Fleur de Sel
    Then Validate the product and the ingredients "Soya*;Water;Fleur de sel;Salt;Black pepper*"

  @SomeTag
  Scenario: Validate that Mediterraneo recipe is displayed
    When The user has chosen all products
    And The user has chosen the product Mediterraneo
    Then Validate the product and the ingredients "Soy*;Water;Black olives*;Dried tomatoes*;Salt;Pepper*;Basil*;Garlic powder*;Black pepper*"

  @SomeTag
  Scenario: Validate that Zenzero & Lemone recipe is displayed
    When The user has chosen all products
    And The user has chosen the product Zenzero & Lemone
    Then Validate the product and the ingredients "Soy*;Water;Ginger*;Lemon juice*;Salt;Lemon grass*"
