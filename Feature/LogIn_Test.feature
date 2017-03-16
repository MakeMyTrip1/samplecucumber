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
@tag
Feature: User able to enter username and password

  @tag1
  Scenario Outline: Entering username and password
    Given User is in Homepage
    And User navigated to login page
    When User is able to enter username "<username>"
    And able to enter password  "<password>"
    And User should click Login button.
    Then Error : Invalid Login credential message should be displayed
    
    Examples:
    |		username		|		password		|
    |		testuser_1	|	Test@123	|
    |		testuser_2	|	Test@124	|
    |		testuser_3	|	Test@125	|


