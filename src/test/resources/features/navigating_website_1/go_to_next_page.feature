Feature: Go to next page

  Customer should be able to go to the next page of a category page.

  Scenario: Go to the next page from category page

    Given that Gordon opens a category page
    When he clicks a pagination arrow
    Then he should go to that page


  Scenario: Go to the next page from search page

    Given that Gordon searches for a mug
    And he sees the search results page
    When he clicks a pagination arrow
    Then he should go to that page


