Feature: Apply Filters
  A customer should be able to apply filters and see the products are in accordance with the applied filters.
  A customer should be able to apply filters, refresh page and see the filters are still applied.


  Scenario: Apply Kolor filter

    Given that Gemma is on a certain category page
    When she applies Kolor filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied



  Scenario: Apply Shape filter

    Given that Gemma is on a certain category page
    When she applies Shape filter, refreshes the page, goes to next page and hit refresh
    Then she should see that she's on the next page and the filter is still applied

