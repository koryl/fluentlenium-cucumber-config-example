Feature: Check if goTo works as expected
  goTo should properly initialize FluentLenium context

  Scenario: goTo correctly initializes FL when passing String
    When goTo duckduckgo.com with String
    Then the expected page is open
    And the webdriver is not null

  Scenario: goTo correctly initializes FL when passing Page
    When goTo duckduckgo.com with Page
    Then the expected page is open
    And the webdriver is not null