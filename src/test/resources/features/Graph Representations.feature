Feature: Graph Respresntations functionality
Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started buttonfrom Graph section
And User click on Graph Representations Link
Then User should able to navigate to  Graph Representations Link sucessfully

Scenario: Verify Title of Graph Respresntations page
Then User should able  see title of the Graph Respresntations Page

Scenario: Verify  Header on Graph Respresntations page
Then User sees the header as Graph Respresntations 

Scenario: Verify Graph Respresntations Page Content
Then User should able to see Graph Respresntations Content

Scenario: Verify Signout Link  on Graph Respresntations page
Then User should able to see Signout Link on Graph Respresntations

Scenario: Verify number of  link on Graph Respresntations page
Then User should able to validate number of the link on Graph Respresntations

 Scenario: Verify TryEditor btn is  Clickable on Graph Respresntations Page
 When User click on Try Editor Button on Graph Respresntations
 Then User should Naviagte to Try editor page from Graph Respresntations
 
 Scenario: Verify PracticeQuestion Link is Clickable on Graph Respresntations
 When User click on PracticeQuestion Link on Graph Respresntations
 Then User should Naviagte to PracticeQuestion page sucessfully from Graph Respresntations
 



