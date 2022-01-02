#Gherkin:
# Business readable domain specific language also known as DSL
# It describes the behaviour of the system in plain english text that is human readable
# But with some standard structure
# Thus it helps to remove or segregate the business logic from the behaviour
# Thereby bridging the gap between non technical and technical people
# It can serve both as project documentation and also as an
# execution specification that can be automated
# Uses special keywords Given When Then to give it structure and meaning

# FEATURE :
# It provides high level description of the software feature that needs to be developed
# Description not executed, shows up in the report so putting this information is important
#  feature have multiple scenarios, one feature file have one feature
# A feature can be a user story or multiple as feature is a requirement

#  SCENARIO:
#  It is a concrete example that illustrates a specific business situation
#  Like feature can have title and description
#  consists of different steps
#  the statements are written in sequence that makes sense
#  usually consists of 5 to 8 steps, if not it looses it expression of scenario

#  STEPS:
#  Scenario consists sequence steps, Given, When , Then, And, But, *
#  Cucumber executes these steps in sequence
#  finds matching step definition
#  java method so it executes code inside the method
#  keyword not considered only applied regular expression
#  Given initial step of the system
#  When is used to define an event or action that user is performing on the system
#  on inital step defined by Given
@dummyfeature
Feature: Dummy Feature
  As a customer of xyz app
  I want to add a product to the cart
  So that I can purchase the product
  @dummyscenario
  Scenario: Dummy Scenario
    Given I'm dummy
    When I do dummy testing
    Then dummy things happen to me
  Scenario: Dummy Scenario
    Given I'm dummy
    When I do dummy testing
    Then dummy things happen to me