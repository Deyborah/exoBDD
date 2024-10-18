Feature: Create Account

  as a customer i want to create account

  Scenario: Creation of account
    Given Customer who want to input id for create account : "test"
    When a id is make for account
    Then there is no password
    And the password to input by custumor : "changeme"