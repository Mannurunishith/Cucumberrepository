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
#feature: Title of your feature
  #I want to use this template for my feature file


  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with "<name>"
    #When I check for the "<value>" in step
    

    #Examples: 
     # | name  |    value | 
      #| ram   |     5123 | 
      #| sam |     7435 | 

      
     #Scenario: Success
      #Given user in home page
      #When user enters credentials
       #| username  |    value | 
       #| ram       |     5123 | 
       #| sam       |     7435 | 
       #And Click on login button
       #Then Home page is displayed
      
      Feature: nishith
       Scenario: Success
      Given user in home page
      When user enters credentials
       | username  |    password | 
       | ram       |     fgyguyb | 
       | sam       |     fyfyfhh | 
       And Click on login button
       Then Home page is displayed
      
      
      