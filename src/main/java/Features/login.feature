
Feature: Free CRM Login Feature
  
#with out example
#Scenario: Free CRM Login Test Scenario
  
#   Given User is already on login page
#    When title of Login page is Free CRM
#   Then user enters "dipenbhatt" and "dipen@123"
#    Then user Clicks on Login button
#   Then user is on home page
   
   #with example
   Scenario Outline: Free CRM Login Test Scenario
  
   Given User is already on login page
    When title of Login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user Clicks on Login button
    Then user is on home page
   
   Examples:
   |username  |password |
   |dipenbhatt|dipen@123|
   |tom       |  tom@123|