Feature: as user

  @test
  Scenario: I want to log in
    Given user is on home page
    And user enter user name
    And user enter password
    Then user should login successfully
