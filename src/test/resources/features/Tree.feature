Feature: Tree functionality
# background : Land on Tree Page
Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Tree section
Then Tree page opens up successfully
#-----------------------------------------------------------------------------------
# Land on Overview of Trees
#Scenario: Verify user is able to land on the Overview of trees Page
#Given Tree page opened up successfully
#When User clicks Overview of Trees link
#Then User is entered into Overview of trees page
#
#Scenario: Verify user is in the Overview of trees page
#Given User is entered into Overview of trees page successfully
#When validate user is in the Overview of Trees page
#Then User is able to see Overview Text in the page
#
# Verification of tryEditor through Overview of Trees
#Scenario: Verify user is able to use the tryEditor under Overviews of Trees
#Given User is entered into Overview of trees page successfully
#When User clicks on Try here button
#Then User is entered into a page having tryEditor with Run button 
#------------------------------------------------------------------------------------------------
# Land on Terminologies
Scenario: Verify user is able to land on the Terminologies Page
Given Tree page opened up successfully
When User clicks Terminologies link
Then User is entered into Terminologies page

Scenario: Verify user is in the Terminologies page
Given User is entered into Terminologies Page successfully
When Validate user is in the Terminologies page
Then User is able to see Terminologies Text in the page

# Verification of tryEditor through Terminologies
Scenario: Verify user is able to use the tryEditor under terminologies
Given User is entered into Terminologies Page successfully
When User clicks on Try here button under Terminologies
Then User is entered into a page having tryEditor with Run button
#-----------------------------------------------------------------------------------
# Land on Types of Trees
Scenario: Verify user is able to land on the Types of Trees Page
Given Tree page opened up successfully
When User clicks Types of Trees link
Then User is entered into Types of Trees page

Scenario: Verify user is in the Types of Trees page
Given User is entered into Types of Trees Page successfully
When Validate user is in the Types of Trees page
Then User is able to see Types of Trees Text in the page

#Verification of tryEditor through Types of Trees
Scenario: Verify user is able to use the tryEditor under Types of Trees
Given User is entered into Types of Trees Page successfully
When User clicks on Try here button under Types of Trees
Then User is entered into a page having tryEditor with Run button


#-----------------------------------------------------------------------------------
# Land on Tree Traversals
#
#
#Scenario: Verify user is able to land on the Tree Traversals Page
#Given Tree page opened up successfully
#When User clicks Tree Traversals link
#Then User is entered into Tree Traversals page
#
#Scenario: Verify user is in the Tree Traversals page
#Given User is entered into Tree Traversals Page successfully
#When Validate user is in the Tree Traversals page
#Then User is able to see Tree Traversals Text in the page
#
# Verification of tryEditor through Tree Traversals
#Scenario: Verify user is able to use the tryEditor under Tree Traversals
#Given User is entered into Tree Traversals Page successfully
#When User clicks on Try here button under Tree Traversals
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Traversals-Illustration
#
#
#Scenario: Verify user is able to land on the Traversals-Illustration Page
#Given Tree page opened up successfully
#When User clicks Traversals-Illustration link
#Then User is entered into Traversals-Illustration page
#
#Scenario: Verify user is in the Traversals-Illustration page
#Given User is entered into Traversals-Illustration Page successfully
#When Validate user is in the Traversals-Illustration page
#Then User is able to see Traversals-Illustration Text in the page
#
# Verification of tryEditor through Traversals-Illustration
#Scenario: Verify user is able to use the tryEditor under Traversals-Illustration
#Given User is entered into Traversals-Illustration Page successfully
#When User clicks on Try here button under Traversals-Illustration
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Binary Trees
#
#
#Scenario: Verify user is able to land on the Binary Trees Page
#Given Tree page opened up successfully
#When User clicks Binary Trees link
#Then User is entered into Binary Trees page
#
#Scenario: Verify user is in the Binary Trees page
#Given User is entered into Binary Trees Page successfully
#When Validate user is in the Binary Trees page
#Then User is able to see Binary Trees Text in the page
#
# Verification of tryEditor through Binary Trees
#Scenario: Verify user is able to use the tryEditor under Binary Trees
#Given User is entered into Binary Trees Page successfully
#When User clicks on Try here button under Binary Trees
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Types of Binary Trees
#
#
#Scenario: Verify user is able to land on the Types of Binary Trees Page
#Given Tree page opened up successfully
#When User clicks Types of Binary Trees link
#Then User is entered into Types of Binary Trees page
#
#Scenario: Verify user is in the Types of Binary Trees page
#Given User is entered into Types of Binary Trees Page successfully
#When Validate user is in the Types of Binary Trees page
#Then User is able to see Types of Binary Trees Text in the page
#
# Verification of tryEditor through Types of Binary Trees
#Scenario: Verify user is able to use the tryEditor under Types of Binary Trees
#Given User is entered into Types of Binary Trees Page successfully
#When User clicks on Try here button under Types of Binary Trees
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Implementation in Python
#
#
#Scenario: Verify user is able to land on the Implementation in Python Page
#Given Tree page opened up successfully
#When User clicks Implementation in Python link
#Then User is entered into Implementation in Python page
#
#Scenario: Verify user is in the Implementation in Python page
#Given User is entered into Implementation in Python Page successfully
#When Validate user is in the Implementation in Python page
#Then User is able to see Implementation in Python Text in the page
#
# Verification of tryEditor through Implementation in Python
#Scenario: Verify user is able to use the tryEditor under Implementation in Python
#Given User is entered into Implementation in Python Page successfully
#When User clicks on Try here button under Implementation in Python
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Binary Tree Traversals
#
#
#Scenario: Verify user is able to land on the Binary Tree Traversals Page
#Given Tree page opened up successfully
#When User clicks Binary Tree Traversals link
#Then User is entered into Binary Tree Traversals page
#
#Scenario: Verify user is in the Binary Tree Traversals page
#Given User is entered into Binary Tree Traversals Page successfully
#When Validate user is in the Binary Tree Traversals page
#Then User is able to see Binary Tree Traversals Text in the page
#
# Verification of tryEditor through Binary Tree Traversals
#Scenario: Verify user is able to use the tryEditor under Binary Tree Traversals
#Given User is entered into Binary Tree Traversals Page successfully
#When User clicks on Try here button under Binary Tree Traversals
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Implementation of Binary Trees
#
#
#Scenario: Verify user is able to land on the Implementation of Binary Trees Page
#Given Tree page opened up successfully
#When User clicks Implementation of Binary Trees link
#Then User is entered into Implementation of Binary Trees page
#
#Scenario: Verify user is in the Implementation of Binary Trees page
#Given User is entered into Implementation of Binary Trees Page successfully
#When Validate user is in the Implementation of Binary Trees page
#Then User is able to see Implementation of Binary Trees Text in the page
#
# Verification of tryEditor through Implementation of Binary Trees
#Scenario: Verify user is able to use the tryEditor under Implementation of Binary Trees
#Given User is entered into Implementation of Binary Trees Page successfully
#When User clicks on Try here button under Implementation of Binary Trees
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Applications of Binary trees
#
#
#Scenario: Verify user is able to land on the Applications of Binary Trees Page
#Given Tree page opened up successfully
#When User clicks Applications of Binary Trees link
#Then User is entered into Applications of Binary Trees page
#
#Scenario: Verify user is in the Applications of Binary Trees page
#Given User is entered into Applications of Binary Trees Page successfully
#When Validate user is in the Applications of Binary Trees page
#Then User is able to see Applications of Binary Trees Text in the page
#
# Verification of tryEditor through Applications of Binary Trees
#Scenario: Verify user is able to use the tryEditor under Applications of Binary Trees
#Given User is entered into Applications of Binary Trees Page successfully
#When User clicks on Try here button under Applications of Binary Trees
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Binary Search Trees
#
#
#Scenario: Verify user is able to land on the Binary Search Trees Page
#Given Tree page opened up successfully
#When User clicks Binary Search Trees link
#Then User is entered into Binary Search Trees page
#
#Scenario: Verify user is in the Binary Search Trees page
#Given User is entered into Binary Search Trees Page successfully
#When Validate user is in the Binary Search Trees page
#Then User is able to see Binary Search Trees Text in the page
#
# Verification of tryEditor through Binary Search Trees
#Scenario: Verify user is able to use the tryEditor under Binary Search Trees
#Given User is entered into Binary Search Trees Page successfully
#When User clicks on Try here button under Binary Search Trees
#Then User is entered into a page having tryEditor with Run button
#
#
#-----------------------------------------------------------------------------------
# Land on Implementation Of BST
#
#
#Scenario: Verify user is able to land on the Implementation Of BST Page
#Given Tree page opened up successfully
#When User clicks Implementation Of BST link
#Then User is entered into Implementation Of BST page
#
#Scenario: Verify user is in the Implementation Of BST page
#Given User is entered into Implementation Of BST Page successfully
#When Validate user is in the Implementation Of BST page
#Then User is able to see Implementation Of BST Text in the page
#
# Verification of tryEditor through Implementation Of BST
#Scenario: Verify user is able to use the tryEditor under Implementation Of BST
#Given User is entered into Implementation Of BST Page successfully
#When User clicks on Try here button under Implementation Of BST
#Then User is entered into a page having tryEditor with Run button
#
#
