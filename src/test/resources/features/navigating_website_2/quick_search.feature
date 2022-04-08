Feature: Open PDP from quick search menu
  A customer should be able to open a product from suggested products from
  quick search menu.

  Scenario: Should see search suggestions
    Given that Allen attempts to search for a product
    When he enters the first two keys of the product he is searching for
    Then she should see the quick search list

  Scenario: Should see quick search contains the search keyword
    Given that Allen attempts to search for a product
    When he enters the first two keys of the product he is searching for
    Then she should see the results contain the search keyword

  Scenario: Open pdp from quick search
    Given that Allen attempts to search for a product
    When he enters the first two keys of the product he is searching for
    And he chooses one product from the list
    Then he should be on pdp


