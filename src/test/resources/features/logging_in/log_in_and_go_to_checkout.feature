Feature: Log in and go to checkout

  A customer should be able to log in and then submit order.

  Scenario: Go to checkout after login using courier deliver

    Given that Sven has a product in the minicart
    When he logs in
    And he goes to the checkout page using courier delivery and transfer
    Then he should see that he is on payment page

