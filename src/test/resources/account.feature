Feature: Create Account

  as a customer i want to create account

  Scenario: Creation of account
    Given Customer who want to input id for create account : "test"
    When a id is make for account
    Then there is no password
    And the password to input by custumor : "changeme"


Feature: Connection Account

  as a customer i want to connection account

  Scenario: Connection account
    Given Customer who want to connection for create account : "test"
    When a id is same of id account
    Then the pasword is enter :"changeme"
    And the connection is established