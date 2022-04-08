Feature: Browse categories

  A customer should be able to browse categories.

  Scenario: Select Ogród
    Given that Wiktoria wants to open a category page
    When she selects category Ogród
    Then she should see the "Ogród header"
    And she should ensure that Ogród contents are present

  Scenario: Select Jadalnia
    Given that Wiktoria wants to open a category page
    When she selects category Jadalnia
    Then she should see the "Jadalnia header"
    And she should ensure that Jadalnia contents are present

  Scenario: Select Kuchnia
    Given that Wiktoria wants to open a category page
    When she selects category Kuchnia
    Then she should see the "Kuchnia header"
    And she should ensure that Kuchnia contents are present

  Scenario: Select Łazienka i garderoba
    Given that Wiktoria wants to open a category page
    When she selects category ŁazienkaIgarderoba
    Then she should see the "Łazienka i garderoba header"
    And she should ensure that ŁazienkaIgarderoba contents are present

  Scenario: Select Dekoracje
    Given that Wiktoria wants to open a category page
    When she selects category Dekoracje
    Then she should see the "Dekoracje header"
    And she should ensure that Dekoracje contents are present

  Scenario: Select Świat dziecka
    Given that Wiktoria wants to open a category page
    When she selects category ŚwiatDziecka
    Then she should see the "Świat dziecka header"
    And she should ensure that ŚwiatDziecka contents are present

  Scenario: Select Nowości
    Given that Wiktoria wants to open a category page
    When she selects category Nowości
    Then she should see the "Nowości header"
    And she should ensure that Nowości contents are present

  Scenario: Select Wyprzedaż
    Given that Wiktoria wants to open a category page
    When she selects category Wyprzedaż
    Then she should see the "Wyprzedaż header"
    And she should ensure that Wyprzedaż contents are present

  Scenario: Select Marki
    Given that Wiktoria wants to open a category page
    When she selects category Marki
    Then she should see the "Marki header"


