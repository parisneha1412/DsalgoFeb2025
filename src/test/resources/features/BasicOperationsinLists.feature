Feature: Verify "Basic Operations in Lists" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Basic Operations in Lists" page opens up

Scenario: Verify the page header on the "Basic Operations in Lists" page
Then User sees Basic Operations in Lists header on the page

Scenario: Verify total links present on the "Basic Operations in Lists" page
Then User should see 5 links on the page

Scenario: Verify the text of all the links on the "Basic Operations in Lists" page
Then Text of all the links on Basic Operations in Lists should be correct

Scenario: Verify the page source on the "Basic Operations in Lists" page
Then Page source on Basic Operations in Lists page should be correct

Scenario: Verify the url of the "Basic Operations in Lists" page
Then Page url should be correct on Basic Operations in Lists page

Scenario: Verify the "Basic Operations in Lists" page title
Then Basic Operations in Lists title should be correct

Scenario: Verify "Arrays in Python" link is clickable
Then "Arrays in Python" page opens up on Basic Operations in Lists page

Scenario: Verify "Arrays Using List" link is clickable
Then  "Arrays Using List" page opens up on Basic Operations in Lists page

Scenario: Verify "Basic Operations in Lists" link is clickable
Then  User should remain on "Basic Operations in Lists"

Scenario: Verify "Applications of Array" link is clickable
Then  "Applications of Array" page opens up on Basic Operations in Lists page

Scenario: Verify "Practice Questions" link is clickable
Then  "Practice Questions" page opens up on Basic Operations in Lists page

Scenario: Verify "Try here" button
When User clicks on Try here button
Then Try Editor page opens up from Basic Operations in Lists page