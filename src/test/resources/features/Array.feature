Feature: Array page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Arrays option from Data Structures dropdown
Then Array page opens up successfully

Scenario: Verify Array header on the Array page
Then User sees Array header on the Array page

Scenario: Verify Topics Covered header on the Array page
Then User sees Topics Covered header on the Array page
#
#Scenario: Verify total links present on the Array page
#Then User should see 4 links on the Array page
#
#Scenario: Verify the text of all the links on the Array page
#Then Text of all the links should be correct
#
#Scenario: Verify the page source on the Array page
#Then Page source on Array page should be correct
#
#Scenario: Verify the url on the Array page
#Then Page url should be correct
#
#Scenario: Verify the Array page title
#Then Page title should be correct
#
#Scenario: Verify "Arrays in Python" link is clickable
#Then  "Arrays in Python" page opens up
#
#Scenario: Verify "Arrays Using List" link is clickable
#Then  "Arrays Using List" page opens up
#
#Scenario: Verify "Basic Operations in Lists link" is clickable
#Then  "Basic Operations in Lists" page opens up
#
#Scenario: Verify "Applications of Array" link is clickable
#Then  "Applications of Array" page opens up