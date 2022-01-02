@multiple
Feature: Testing various different scenarios with examples
  Scenario Outline: Dummy multiple scenario with just one example
    Given my account balance is $<opening balance>
    When I withdraw $<withdrawal amount>
    Then the account balance should be $<closing balance>

    Examples:
      | opening balance | withdrawal amount | closing balance |
      | 100             | 50                | 50              |
      | 50              | 50                | 0               |
