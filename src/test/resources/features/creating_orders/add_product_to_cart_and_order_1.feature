Feature: Add product to cart and order-1

  A customer should be able to add a product to cart and order it.

  Scenario: 1
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he attempts to pay using card
    Then he should be on the payment page

  Scenario: 2
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he attempts to pay using paypal
    Then he should be on the payment page

  Scenario: 3
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he attempts to pay using cashOnDelivery
    Then he should be on the payment page

  Scenario: 4
    Given that Adam adds product to cart
    When he attempts to order it as person using courier delivery
    And he attempts to pay using card
    Then he should be on the payment page

  Scenario: 5
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he attempts to pay using transfer
    Then he should be on the payment page


  Scenario: 6
    Given that Adam adds product to cart
    When he attempts to order it as company using courier delivery
    And he attempts to pay using transfer
    Then he should be on the payment page






