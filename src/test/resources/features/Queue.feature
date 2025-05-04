Feature: Queue functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Queue section
Then Queue page opens up successfully

Scenario: Verify Title of Queue page
Then User should able  see title of queue Page

Scenario: Verify Header of Queue page
Then User should able to see queue Header

Scenario: Verify SubHeader of Queue page
Then User should able to see SubHeader of quaeue page

Scenario: Verify QueuePage Content
Then User should able to see queuepagecontent 

Scenario: Verify Logo on Queue page
Then User should able to see Logo on Queue Page

Scenario: Verify Links  on Queue page
Then User should able to validate number of the link on Queue page

Scenario: Verfiy Implementation of Queue in Python Link is Clicable
When User click on Implementation of Queue in Python Link
Then User should land on Implementation of Queue in Python page successfully

Scenario: Verify Implementation using collections.deque Link Navigate to that  page
When User click on Implementation using collections.deque  Link
Then User should land on Implementation using collections.deque page successfully
 
Scenario: Verify Implementation using array Link Navigate to that  page
When User click on Implementation using array  Link
Then User should land on Implementation using array page successfully


Scenario: Verify Queue Operations Link is clickable
When User click on Queue Enqueue Link from Queue page
Then User should land on Queue Enqueue page successfully

