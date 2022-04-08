Feature: Change page

  Customer should be able to select a given page by page number.

  Scenario: Select page from category page

    Given that Patty is on a category page
    When she selects a page
    Then she should be on that page


  Scenario: Select page from search page

    Given that Patty looks for a mug
    And she is on the search results page
    When she selects a page
    Then she should be on that page