
Feature: DLGDemo, DTP-8
  This is the description of the feature

  Scenario: ThisIsTheScenarioNameForTesting
    Given i first run this test
    When i execute the test
    Then it will fail but soon it will pass
    And I add a step to test functionality
    And Added step 2
    
  Scenario: ThisIsTheScenarioNameForTesting2
    Given i first run this test
    When i execute the test
    Then it will fail but soon it will pass
    And I add a step to test functionality
    And Added step 2
    And Added step 3

  Scenario Outline: ThisIsTheScenarioNameForTesting3
    Given i first run this test
    When i execute the test <field1>
    Then it will fail but soon it will pass <field2>
    Examples:
      |field1|field2|
      | f1|f2|
      | f3|f4|
     
  Scenario: ScenarioFor-As a user, i want to see scenario
    Given i first run this test
    When i execute the test
    Then it will fail but soon it will pass
    And I add a step to test functionality
    And Added step 2
    And Added step 3
    
  Scenario: Preetam, new test scenario
    Given i first run this test
    When i execute the test
    Then it will fail but soon it will pass