 @SmokeTest
Feature: Edit Individuals in Salesfore Application
  As a Salesforce User, I need to edit existing individuals in the application
  Background: Login to Salesforce application with valid credentials
  Given Enter the username as "hari.radhakrishnan@qeagle.com"
  And Enter the password as "Leaf@1234" 
  When Click LoginButton
  Then User should be taken to Home Page of Service Now Application.
    Scenario Outline: Editing the existing Individuals
    Given Click on Toggle Menu on left hand corner
    And Click View All
    And Click on Individuals from App launcher
    And Click on Individuals from Dropdown
    And Search for existing individuals
    And Click on the retrieved result
    And Click on Edit option
    And Edit the title to Mr
    And Provide the First Name as <FirstName>
    When User clicks on Save option
    Then Verify whether the Edit is successfull         

    Examples: 
      |FirstName|
      |Gautham|
      |Rahul|
      
