Feature: Order products logged in-3

  Logged in Customer should be able to order items with delivery as courier or
  in-store pickup if available. Also Customer should be able to order as
  a Company. All order payment options should be available to use.

  Scenario: 10 Login and Order with courier delivery and transfer payment (changes billing address, click same shipping address checkbox)

    Given that Oscar is logged in 3
    When he orders "mug" using courier delivery
    And he changes billing address
    And he clicks the same shipping address checkbox
    And he selects transfer payment
    Then he should ensure that he is on the payment page

  Scenario: 11 Login and Order with courier delivery and paypal payment (changes billing address)

    Given that Oscar is logged in 3
    When he orders "mug" using courier delivery
    And he changes billing address
    And he selects card payment
    Then he should ensure that he is on the payment page

  Scenario: 12 Login and Order with courier delivery and transfer payment (changes billing address)

    Given that Oscar is logged in 3
    When he orders "mug" using courier delivery
    And he changes billing address
    And he selects transfer payment
    Then he should ensure that he is on the payment page

  Scenario: 13 Login and Order with courier delivery and paypal payment (changes shipping address, changes billing address)

    Given that Oscar is logged in 3
    When he orders "mug" using courier delivery
    And he changes billing address
    And he changes shipping address
    And he selects cashOnDelivery payment
    Then he should ensure that he is on the payment page



