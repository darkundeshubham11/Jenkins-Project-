@tag
Feature: Simple Form Submission
  @tag1
  Scenario: User submits the form with valid details
    Given The user is on the Simple Form page
    When The user enters their details
    And The user clicks on the submit button
    Then A confirmation message is displayed