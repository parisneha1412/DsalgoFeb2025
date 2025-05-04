Feature: Implementation using array functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Queue section 
And User click on Implementation using collections.deque  Link
And User should land on Implementation using collections.deque page successfully
And User Click on Practice question link from Queue Page
Then User should land on Practice question Page 


Scenario: Verify Current URL of the LInk
Then User should validate URL of Practice Page from Sucessfully.

Scenario: Verify Logo on Practice Page
Then User should validate logo on page Practice page sucessfully

Scenario: Verify Username on Practice Page
Then user should validate Userrname on Practice page Sucessfully.

Scenario: Verify Dropdown is Displayed on Practice Page
Then user should able to see  DropdownList on Practice Page.

Scenario: Verify from Dropdown user navigate  to that Page
When User click on dropdownmenu option from Practice Page
Then User should able to navigate that  Page sucessfully

Scenario: Verify  back button button Functionlity.
When User click on Back button from Practice Page
Then User should navigate to back page from Queue Practice Page  Sucessfully
