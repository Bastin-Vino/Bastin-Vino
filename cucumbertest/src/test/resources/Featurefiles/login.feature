@testfeature
Feature: feature to test Login funtionality with valid credentials

  @test1
  Scenario: Check Login success with valid credentials
    When open browser
    And goto login page
    Given enter valid username
    And enter valid password
    And click login
    Then navigate to home page

  @test1
  Scenario Outline: Check Login success with valid credentials using parameter
    When open browser
    And goto login page
    Given enter valid <username>
    And enters valid <password>
    And click login
    Then navigate to home page

    Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | Password123 |