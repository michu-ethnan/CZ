Feature: Apply Filters
  A customer should be able to apply filters and see the products are in accordance with the applied filters.
  A customer should be able to apply filters, refresh page and see the filters are still applied.

Scenario: Apply Marki filter

  Given that Gemma is on a certain category page
  When she applies Marka filter, refreshes the page, goes to next page and hit refresh
  Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Kolekcja filter

    Given that Gemma is on a certain category page
    When she applies Kolekcja filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Cena filter

    Given that Gemma is on a certain category page
    When she applies Cena filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Kolor filter

    Given that Gemma is on a certain category page
    When she applies Kolor filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Material filter

    Given that Gemma is on a certain category page
    When she applies Material filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Shape filter

    Given that Gemma is on a certain category page
    When she applies Shape filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Pojemność filter

    Given that Gemma is on a certain category page
    When she applies Pojemność filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Wysokość filter

    Given that Gemma is on a certain category page
    When she applies Wysokość filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply Szerkość filter

    Given that Gemma is on a certain category page
    When she applies Szerkość filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied


  Scenario: Apply ILOŚĆ OSÓB filter

    Given that Gemma is on a certain category page
    When she applies Irlość_osób filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

  Scenario: Apply ZASTOSOWANIE filter

    Given that Gemma is on a certain category page
    When she applies Zastosowanie filter, refreshes the page, goes to next page and hit refresh
    Then she should see that the filter is applied

