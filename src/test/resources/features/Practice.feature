Feature: Verify "Practice" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Applications of Array" page opens up
Then "Practice Questions" page opens up from Applications of Array page

Scenario: Verify page title on the Practice page
Then Page title is displayed on the Practice page

Scenario: Verify page links on the Practice page
Then 4 links should be displayed on the Practice page

Scenario: Verify the text on the Practice page
Then Text should be displayed correctly on the Practice page

Scenario: Verify "Search the Array" link is clickable
Then "Search the array" page opens up from Practice page

Scenario: Verify "Max Consecutive Ones" link is clickable
Then "Max Consecutive Ones" page opens up from Practice page

Scenario: Verify "Find Numbers with Even Number of Digits" link is clickable
Then "Find Numbers with Even Number of Digits" page opens up from Practice page

Scenario: Verify "Squares of  a Sorted Array" link is clickable
Then "Squares of a Sorted Array" page opens up from Practice page

