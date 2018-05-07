#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@api
Feature: CountryApi test
  I want to test Country APIs

  @api
  Scenario Outline: Validate status code
    Given The country api <uri>
    When The api is triggered
    Then <statusCode> is returned
    
    Examples:
    |uri																	|statusCode|
    |https://restcountries.eu/rest/v2/all	|200			 |
    |http://restcountries.eu/rest/v2/all  |200       |
    |https://restcountries.eu/rest/v2/code  |404       |
    

  
