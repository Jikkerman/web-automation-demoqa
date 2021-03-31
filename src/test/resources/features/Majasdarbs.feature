
Feature: DemoQA - Elements page
  Background:
    Given I am on the "Home" page
    And   I click "Book Store Application"
    Then  I am on the "Book Store Application" page


  Scenario: Book store
    When I click "Book Store option"
    And  I set "Search Box" to "Pro"
    Then "Title" should contain "Programming"
    And  I set "Search Box" to ""
    Then "Title" should contain 2 empty "rows"
    And  I set "Rows per page" to "5"
    And  I click "Next button"
    Then I see 3 books
