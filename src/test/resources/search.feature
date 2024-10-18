Feature: Search

  as a customer i want to search a product

  Scenario: Searching
    Given Customer who want to search a product: "marteau"
    When the searching give a results
    Then the resuslts is display
    And the customer select the choice