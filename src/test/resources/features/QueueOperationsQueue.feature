Feature: Queue Operations functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Queue section 
And User click on Queue Enqueue Link from Queue page
Then User should land on Queue Enqueue page successfully

Scenario: Verify Title of Queue Operations page
Then User should able  see Title of Queue Operations Page

Scenario: Verify  Header of Queue Operations
Then User sees the header as Queue Operations

Scenario: Verify Queue Operations Page Content
Then User should able to see Queue Operations Page Content

Scenario: Verify DropdownList on Queue Operations Page
Then User should able to see DropdownList Queue Operations

Scenario: Verify TryEditor btn is  Clickable
 When User click on Try Editor Button on Queue Operations Page
 Then User should Naviagte to Try editor page from Queue Operations

 Scenario: Verify number of  link on Queue Operations Page
Then User should able to validate number of the link on Queue Operations Page

