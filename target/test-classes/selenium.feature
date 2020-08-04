@run
Feature: selenium

  @single
  Scenario: Test Selenium
    Given I open chrome browser
    When I navigate to home page
    Then Check Test 1
    Then Check Test 2
    Then Check Test 3
    Then Check Test 4
    Then Check Test 5
    Then Check Test 6