Feature: Practice Question  functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Stack section 
And User click on operation in Stack Link
And User should land on Opeartion in Stack page successfully
And User click on PracticeQuestion Link
Then User should Naviagte to page sucessfully

Scenario: Verify Current URL of the LInk
Then User should validate URL Sucessfully.

Scenario: Verify Logo on Practice Page
Then User should validate logo on page sucessfully

Scenario: Verify Username on Practice Page
Then user should validate Userrname Sucessfully.

Scenario: Verify Dropdown is Displayed on Practice Page
Then user should able to see  Dropdown on Practice Page.

Scenario: Verify from Dropdown user navigate  to that Page
When User click on dropdownmenu option
Then User should able to navigate that  Page.

Scenario: Verify  back button button Functionlity.
When User click on Back button
Then User should navigate to back page





