Feature: Operation in Stack functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Stack section 
And User click on operation in Stack Link
Then User should land on Opeartion in Stack page successfully

Scenario: Verify Title of Opearion in stack page
Then User should able  see title of the Page

Scenario: Verify  Header of Operations in stack page
Then User sees the header as Operations in Stack

Scenario: Verify operationinStackPage Content
Then User should able to see operationinStackPage Content

Scenario: Verify Username on Operation in Stack page
Then User should able to see Username  

Scenario: Verify number of  link on stack page
Then User should able to validate number of the link on Operations in stack page

 Scenario: Verify TryEditor btn is  Clickable
 When User click on Try Editor Button
 Then User should Naviagte to Try editor page
 
 Scenario: Verify PracticeQuestion Link is  Clickable
 When User click on PracticeQuestion Link
 Then User should Naviagte to page sucessfully
 
 
 
 
 
  