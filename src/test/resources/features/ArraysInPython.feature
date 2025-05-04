Feature: Verify "Arrays in Python" page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully
And "Arrays in Python" page opens up

Scenario: Verify Arrays in Python header on the "Arrays in Python" page
Then User sees Arrays in Python header on the page

Scenario: Verify Array header on the "Arrays in Python" page
Then User sees Array header on the page

Scenario: Verify total links present on the "Arrays in Python" page
Then User should see 5 links on the page

Scenario: Verify the text of all the links on the "Arrays in Python" page
Then Text of all the links on Arrays in Python should be correct

Scenario: Verify the page source on the "Arrays in Python" page
Then Page source on Arrays in Python page should be correct

Scenario: Verify the url on the "Arrays in Python" page
Then Page url should be correct on Arrays in Python page

Scenario: Verify the "Arrays in Python" page title
Then Arrays in Python page title should be correct

Scenario: Verify "Arrays in Python" link is clickable
Then  User should remain on "Arrays in Python" page

Scenario: Verify "Arrays Using List" link is clickable
Then  "Arrays Using List" page opens up on Arrays in Python page

Scenario: Verify "Basic Operations in Lists" link is clickable
Then  "Basic Operations in Lists" page opens up on Arrays in Python page

Scenario: Verify "Applications of Array" link is clickable
Then  "Applications of Array" page opens up on Arrays in Python page

Scenario: Verify "Practice Questions" link is clickable
Then  "Practice Questions" page opens up on Arrays in Python page

Scenario: Verify "Try here" button
When User clicks on Try here button on Arrays in Python page
Then  Try Editor page opens up on Arrays in Python page