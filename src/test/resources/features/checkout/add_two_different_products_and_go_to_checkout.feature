Feature: Add two different products and go to checkout

  A customer should be able to add two different products
  and go to checkout

  Scenario: Should be able to add two products from the same category
    Given that Abel happens to be on the first category page
    And he adds the first product to cart
    When he returns to the previous category page
    And he adds another product to the cart and goes to checkout
    Then he should see that he is on the payment page as a person


  Scenario: Should be able to add two products from different categories
    Given that Abel happens to be on the first category page
    And he adds the first product to cart
    When he returns to the previous category page
    And he adds another product to the cart from another category and goes to checkout
    Then he should see that he is on the payment page as a person