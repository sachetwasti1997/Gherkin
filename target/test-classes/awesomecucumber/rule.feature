# RULE  is used to provide additional information to feature, rule is the business rule that is to be implemented
#  it can be used to group different scenarios that belong to the group

Feature: Add to cart

  Rule: Add from store
    This is rule no 1
    Background: Common Given Rules
    Scenario: Scenario 1
    Scenario: Scenario 2

  Rule: Add from product page
    Background: Common Given Rules
    Scenario: Scenario 1
    Scenario: Scenario 2
