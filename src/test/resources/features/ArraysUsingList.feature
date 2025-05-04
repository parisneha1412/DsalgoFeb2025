Feature: Verify "Arrays Using List" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Arrays Using List" page opens up

Scenario: Verify the page header on the "Arrays Using List" page
Then User sees Arrays Using List header on the page

Scenario: Verify total links present on the "Arrays Using List" page
Then User should see 5 links on the page

Scenario: Verify the text of all the links on the "Arrays Using List" page
Then Text of all the links on Arrays Using List should be correct

Scenario: Verify the page source on the "Arrays Using List" page
Then Page source on Arrays Using List page should be correct

Scenario: Verify the url of the "Arrays Using List" page
Then Page url should be correct on Arrays Using List page

Scenario: Verify the "Arrays Using List" page title
Then Arrays Using List title should be correct

Scenario: Verify "Arrays in Python" link is clickable
Then  User should navigate to "Arrays in Python" page

Scenario: Verify "Arrays Using List" link is clickable
Then  User should remain on "Arrays Using List" page

Scenario: Verify "Basic Operations in Lists" link is clickable
Then  "Basic Operations in Lists" page opens up on Arrays Using List page

Scenario: Verify "Applications of Array" link is clickable
Then  "Applications of Array" page opens up on Arrays Using List page

Scenario: Verify "Practice Questions" link is clickable
Then  "Practice Questions" page opens up on Arrays Using List page

Scenario: Verify "Try here" button
When User clicks on Try here button
Then Try Editor page opens up from Arrays Using List page