Feature: Order products logged in-1

  Logged in Customer should be able to order items with delivery as courier or
  in-store pickup if available. Also Customer should be able to order as
  a Company. All order payment options should be available to use.

  Scenario: 1 Login and Order with courier delivery and paypal payment (click same shipping address checkbox)

    Given that Oscar is logged in 1
    When he orders "mug" using courier delivery
    And he clicks the same shipping address checkbox
    And he selects paypal payment
    Then he should ensure that he is on the payment page

  Scenario: 2 Login and Order with courier delivery and transfer payment (click same shipping address checkbox)

    Given that Oscar is logged in 1
    When he orders "mug" using courier delivery
    And he clicks the same shipping address checkbox
    And he selects transfer payment
    Then he should ensure that he is on the payment page


  Scenario: 3 Login and Order with courier delivery and paypal payment

    Given that Oscar is logged in 1
    When he orders "mug" using courier delivery
    And he selects card payment
    Then he should ensure that he is on the payment page

  Scenario: 4 Login and Order with courier delivery and transfer payment

    Given that Oscar is logged in 1
    When he orders "mug" using courier delivery
    And he selects cashOnDelivery payment
    Then he should ensure that he is on the payment page




