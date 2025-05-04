Feature: Verify "Arrays in Python" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Arrays in Python" page opens up
When User clicks on Try here button on Arrays in Python page
And  Try Editor page opens up on Arrays in Python page

Scenario: Verify the title of the Editor Page
Then Title of the Editor Page should be correct

Scenario: Verify valid data in Try Editor page
When User sends valid data "print(10)" in the Editor
And User clicks on Run button on Try Editor
Then User sees the correct output

Scenario: Verify the alert message on "Search the array" page
When User sends valid data "Testing" in the Editor
And User clicks on Run button on Try Editor
And Alert message is displayed on Try Editor
Then Page url is displayed correctly on Try Editor page

Scenario: Verify user navigates to previous page from Try Editor 
When User clicks on browser back button in the Editor
Then Arrays in Python page should be displayed
