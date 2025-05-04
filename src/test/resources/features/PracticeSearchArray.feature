Feature: Verify "Practice" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Arrays option from Data Structures dropdown
When Array page opens up successfully
And "Applications of Array" page opens up
And "Practice Questions" page opens up from Applications of Array page
Then "Search the array" page opens up from Practice page

Scenario: Verify page title on "Search the array" page
Then Page title "Assessment" is displayed correctly on Search the array page

Scenario: Verify page url on "Search the array" page
Then Page url is displayed correctly on Search the array page

Scenario: Verify default text on "Search the array" page 
Then Default text should be displayed correctly on Search the array page

Scenario: Verify default text on "Editor" pane
Then Default text should be displayed correctly on the Editor pane

Scenario: Verify the buttons on "Search the array" page
Then Run and Submit button should be displayed on Search the array page

Scenario: Verify the valid text on "Search the array" page
When User enters data "print(Testing)" in the text editor window 
And User clicks on Run button
Then Output "Testing" should be displayed correctly

Scenario: Verify the page text on "Search the array" page
When User enters data "print(10)" in the text editor window  
And User clicks on Submit button
Then Output "Error occurred during submission" should be displayed correctly

Scenario: Verify the page text on "Search the array" page
When User enters data "testing" in the text editor window  
And User clicks on Submit button
Then Output "Error occurred during submission" should be displayed correctly

Scenario: Verify the alert message on "Search the array" page
When User enters data "print1" in the text editor window  
And User clicks on Run button
And Alert message is displayed
Then Page url is displayed correctly on Search the array page

Scenario: Verify user is navigated back to Practice page
When User clicks on browser back button
Then User is navigated to Practice page


