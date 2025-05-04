Feature: Verify "Applications of Array" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Applications of Array" page opens up

Scenario: Verify page header on the "Applications of Array" page
Then User sees Applications of Array header on the page

Scenario: Verify total links present on the "Applications of Array" page
Then User should see 5 links on the page

Scenario: Verify the text of all the links on the "Applications of Array" page
Then Text of all the links on Applications of Array should be correct

Scenario: Verify the page source on the "Applications of Array" page
Then Page source on Applications of Array page should be correct

Scenario: Verify the url on the "Applications of Array" page
Then Page url should be correct on Applications of Array page

Scenario: Verify the "Applications of Array" page title
Then Page title should be correct on Applications of Array page

Scenario: Verify "Arrays in Python" link is clickable
Then  "Arrays in Python" page opens up on Arrays in Python page

Scenario: Verify "Arrays Using List" link is clickable
Then  "Arrays Using List" page opens up from Applications of Array page

Scenario: Verify "Basic Operations in Lists" link is clickable
Then  "Basic Operations in Lists" page opens up from Applications of Array page

Scenario: Verify "Applications of Array" link is clickable
Then User should remain on "Applications of Array" page

Scenario: Verify "Practice Questions" link is clickable
Then  "Practice Questions" page opens up from Applications of Array page

Scenario: Verify "Try here" button
When User clicks on Try here button
Then  Try Editor page opens up from Applications of Array page