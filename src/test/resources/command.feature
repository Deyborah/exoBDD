Feature: Command Ordering

  as a customer i want to make a command

  Scenario: Creation of an empty Command
    Given Customer who want to command for Someone : "Me"
    When a Command is make for Someone
    Then there is no product in the Command
    And the command come from Customer