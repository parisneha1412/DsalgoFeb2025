Feature: Login functionality

Scenario: Login with valid credentials
Given User is on the Login page
When User enters username "automationtechies" and enters password "techies@1234"
And User clicks on Login button
Then User is logged in to home page

