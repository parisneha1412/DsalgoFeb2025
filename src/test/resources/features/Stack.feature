Feature: Stack functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Stack section
Then Stack page opens up successfully


Scenario: Verify Title of Stack page
Then User should able  see title of stack Page


Scenario: Verify Header of Stack page
Then User should able to see stack Header


Scenario: Verify SubHeader of Stack page
Then User should able to see SubHeader 


Scenario: Verify StackPage Content
Then User should able to see stackpagecontent 

Scenario: Verify Logo on Stack page
Then User should able to see Logo

Scenario: Verify Links  on Stack page
Then User should able to validate number of the link 

Scenario: Verfiy Operation in stack Link is Clickable
When User click on operation in Stack Link
Then User should land on Opeartion in Stack page successfully

Scenario: Verify Implementation Link Navigate to that  page
When User click on Implementation  Link
Then User should land on Implementation page successfully
 
Scenario: Verify Applications Link Navigate to that  page
When User click on Applications  Link
Then User should land on Applications page successfully
 
