Feature: Order products from different categories

A customer should be able to add products from all categories

  Scenario: Order from Ogród
    Given that Alexa wants to order products from Ogród
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Jadalnia
    Given that Alexa wants to order products from Jadalnia
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Kuchnia
    Given that Alexa wants to order products from Kuchnia
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Łazienka i garderoba
    Given that Alexa wants to order products from ŁazienkaIgarderoba
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Dekoracje
    Given that Alexa wants to order products from Dekoracje
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Świat dziecka
    Given that Alexa wants to order products from ŚwiatDziecka
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Nowości
    Given that Alexa wants to order products from Nowości
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Wyprzedaż
    Given that Alexa wants to order products from Wyprzedaż
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: Order from Marki
    Given that Alexa wants to order products from Marki page
    When she adds a product from category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page



