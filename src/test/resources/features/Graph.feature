Feature: Graph functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started buttonfrom Graph section
Then Graph page opens up successfully

Scenario: Verify Header of Graph page
Then User should able to see Graph Header

Scenario: Verify GraphPage Content
Then User should able to see Graphpagecontent

Scenario: Verify Links on Graph page
Then User should able to validate number of the link on Graph Page

Scenario: Verify Links on Graph page
Then User should able to validate number of the link on Graph Page

#Scenario: Verify Graph Link is  clickable on  Graph page
#When User click on Graph Link
#Then User should able to navigate to  Graph Page Link sucessfully

Scenario: Verify Graph Representations Link is  clickable on  Graph page
When User click on Graph Representations Link
Then User should able to navigate to  Graph Representations Link sucessfully
 






