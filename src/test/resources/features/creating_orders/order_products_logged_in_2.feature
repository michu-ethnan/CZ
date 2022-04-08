Feature: Order products logged in-2

  Logged in Customer should be able to order items with delivery as courier or
  in-store pickup if available. Also Customer should be able to order as
  a Company. All order payment options should be available to use.

  Scenario: 5 Login and Order with courier delivery and transfer payment (changes shipping address)

    Given that Oscar is logged in 2
    When he orders "mug" using courier delivery
    And he changes shipping address
    And he selects transfer payment
    Then he should ensure that he is on the payment page


  Scenario: 6 Login and Order with courier delivery and pickup payment (changes billing address, click same shipping address checkbox)

    Given that Oscar is logged in 2
    When he orders "mug" using courier delivery
    And he changes billing address
    And he clicks the same shipping address checkbox
    And he selects paypal payment
    Then he should ensure that he is on the payment page

  Scenario: 7 Login and Order with courier delivery and pickup payment (changes billing address, click same shipping address checkbox)

    Given that Oscar is logged in 2
    When he orders "mug" using courier delivery
    And he changes billing address
    And he clicks the same shipping address checkbox
    And he selects transfer payment
    Then he should ensure that he is on the payment page

  Scenario: 8 Login and Order with courier delivery and paypal payment (changes shipping address)

    Given that Oscar is logged in 2
    When he orders "mug" using courier delivery
    And he changes shipping address
    And he selects card payment
    Then he should ensure that he is on the payment page

  Scenario: 9 Login and Order with courier delivery and transfer payment (changes shipping address, changes billing address)

    Given that Oscar is logged in 2
    When he orders "mug" using courier delivery
    And he changes billing address
    And he changes shipping address
    And he selects transfer payment
    Then he should ensure that he is on the payment page
