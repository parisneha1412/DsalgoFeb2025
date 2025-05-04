Feature: Implementation  functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Stack section 
And User click on Applications  Link
Then User should land on Applications page successfully

Scenario: Verify URL of Applications page
Then User should able  see URL of the Page

Scenario: Verify  Header on Application page
Then User sees the header as Applications

Scenario: Verify ApplicationsPage Content
Then User should able to see ApplicationsPage Content

Scenario: Verify Links  on Applications page
Then User should able to validate number of the link on Applications Page

Scenario: Verify  DatastuructureDropdown  on Application page
Then User sees the DatastuructureDropdown on Applications

Scenario: Verify TryEditor btn is  Clickableon application Page
 When User click on Try Editor Button on application Page
 Then User should Naviagte to Try editor page from aplicatio page
 
 Scenario: Verify PracticeQuestion Link is  Clickable on application Page
 When User click on PracticeQuestion Link on application Page
 Then User should Naviagte to page sucessfully from  application Page
