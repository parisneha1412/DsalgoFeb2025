Feature: Implementation  functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Stack section 
And User click on Implementation  Link
Then User should land on Implementation page successfully

Scenario: Verify Title of Implementation  page
Then User should able  see title of the Implementation Page

Scenario: Verify  Header on Implementation page
Then User sees the header as Implementation 

Scenario: Verify ImplementationPage Content
Then User should able to see ImplementationkPage Content

Scenario: Verify Signout Link  on Implementation page
Then User should able to see Signout Link  

Scenario: Verify number of  link on Implementation page
Then User should able to validate number of the link on Implementation page

 Scenario: Verify TryEditor btn is  Clickable on Implementation page
 When User click on Try Editor Button on Implementation page
 Then User should Naviagte to Try editor page from Implementation page 
 
 Scenario: Verify PracticeQuestion Link is Clickable on Implementation Page
 When User click on PracticeQuestion Link on Implementation Page
 Then User should Naviagte to PracticeQuestion page sucessfully
 
