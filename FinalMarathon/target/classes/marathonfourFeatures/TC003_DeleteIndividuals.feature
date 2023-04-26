@RegressionTest
Feature: Delete Individuals in Salesfore Application
  As a Salesforce User, I need to delete existing individuals in the application
  Background: Login to Salesforce application with valid credentials
  Given Enter the username as "hari.radhakrishnan@qeagle.com"
  And Enter the password as "Leaf@1234" 
  When Click LoginButton
  Then User should be taken to Home Page of Service Now Application.
    Scenario: Deleting the existing Individuals
    Given Click on Toggle Menu on left hand corner
    And Click View All
    And Click on Individuals from App launcher
    And Click on Individuals from Dropdown
    And Search for existing individuals
    And Click on the retrieved result
    When Click on Delete option
    Then Verify whether the Delete is successfull  
    And Clear the searched input
    And Search for existing individuals   
    And Verify whether the no records is dispalayed    
    
