 @SmokeTest
Feature: Create Individuals in Salesfore Application
  As a Salesforce User, I need to create new individuals in the application
  Background: Login to Salesforce application with valid credentials
  Given Enter the username as "hari.radhakrishnan@qeagle.com"
  And Enter the password as "Leaf@1234" 
  When Click LoginButton
  Then User should be taken to Home Page of Service Now Application.  

    Scenario Outline: Creating New Individuals
    Given Click on Toggle Menu on left hand corner
    And Click View All
    And Click on Individuals from App launcher
    And Click on Individuals from Dropdown
    And Click on New button to create an individual
    And Select the respective Title from dropdown
    And Provide the lastname as <LastName>
    When User clicks on Save Button
    Then Verify whether the Individual is created successfully

    Examples: 
      |LastName|
      |Gambhir|
      |Dravid|
      
      
