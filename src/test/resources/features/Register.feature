#Feature: Registration functionality
#
#Scenario: User creates an account 
#Given User navigates to Registration page
#When User enters below details into the fields
#|username          |suvarnapatil     |
#|password          |suvarna@123      |
#|confirmPassword   |suvarna@123      |
#And User clicks on Register button
#Then User account should be created
#
#Scenario: User creates a duplicate account 
#Given User navigates to Registration page
#When User enters below details into the fields
#|username          |testadmin      |
#|password          |Indra@31   |
#|confirmPassword   |Indra@31   |
#And User clicks on Register button
#Then User should get a proper error message
#
#Scenario: User creates an account with blank values 
#Given User navigates to Registration page
#When User keeps all the fields blanks 
#And User clicks on Register button 
#Then User should remain on Register page