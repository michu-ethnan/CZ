Feature: Adding Products to cart

  Customer should be able to add items to cart, by using
  add to card button on product page or by increasing
  amount inside the minicart.

  Scenario: Should add product from product page to minicart
    Given that Mindy has opened product page of a mug
    When she tries to add it to cart
    Then she should see popup with added to cart message
    And ensure that the product is in minicart

  Scenario: Should add product from product page to minicart
    Given that Mindy has clicked a product from a certain category
    When she tries to add it to cart
    Then she should see popup with added to cart message
    And ensure that the product is in minicart