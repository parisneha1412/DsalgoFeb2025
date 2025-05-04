package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BinaryTreeTraversalsPage;
import pages.BinaryTreesPage;
import pages.HomePageAfterLogin;
import pages.ImplementationInPythonPage;
import pages.OverviewOfTreesPage;
import pages.Terminologies;
import pages.Traversals_IllustrationPage;
import pages.TreePage;
import pages.TreeTraversalsPage;
import pages.TypesOfBinaryTreesPage;
import pages.TypesofTreesPage;
import utils.CommonUtils;


public class TreeStepDefinition {
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	TreePage treePage;
	OverviewOfTreesPage overviewOfTreesPage;
	CommonUtils commonUtils;
	Terminologies terminologies;
	TypesofTreesPage typesofTreesPage;
	TreeTraversalsPage treeTraversalsPage;
	Traversals_IllustrationPage traversals_IllustrationPage;
	BinaryTreesPage binaryTreesPage;
	TypesOfBinaryTreesPage typesOfBinaryTreesPage;
	ImplementationInPythonPage implementationInPythonPage;
	BinaryTreeTraversalsPage binaryTreeTraversalsPage;

	//*****************Background Steps***********************
	@When("User clicks the Get Started button from Tree section")
	public void user_clicks_the_get_started_button_from_tree_section() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		homePageAfterLogin = new HomePageAfterLogin(driver);
		homePageAfterLogin.doClickOnTreeGetStarted();
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
	}

	@Then("Tree page opens up successfully")
	public void tree_page_opens_up_successfully() {
		treePage = new TreePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/"));
		treePage.treeHeadingIsDisplayed();
		treePage.treeSubHeaderIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Background Executed");
	}
	//*********************Scenario 1 Steps****************************
	@Given("Tree page opened up successfully")
	public void tree_page_opened_up_successfully() {
		System.out.println("treePage Opened");
		treePage = new TreePage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/tree/");
		System.out.println("Page title is : " + driver.getTitle());
		treePage.getCountOfLinks();
	}

	@When("User clicks Overview of Trees link")
	public void user_clicks_overview_of_trees_link() {
		treePage = new TreePage(driver);
		overviewOfTreesPage = new OverviewOfTreesPage(driver);
		treePage.clickOnOverviewOfTree();
	}

	@Then("User is entered into Overview of trees page")
	public void user_is_entered_into_overview_of_trees_page() {
		overviewOfTreesPage = new OverviewOfTreesPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/overview-of-trees/"));
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}

	//*************************Scenario 2 Steps***********************************
	@Given("User is entered into Overview of trees page successfully")
	public void user_is_entered_into_overview_of_trees_page_successfully() {
		treePage.clickOnOverviewOfTree();
		overviewOfTreesPage = new OverviewOfTreesPage(driver);

	}

	@When("validate user is in the Overview of Trees page")
	public void validate_user_is_in_the_overview_of_trees_page() {
		overviewOfTreesPage = new OverviewOfTreesPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/overview-of-trees/"));
		overviewOfTreesPage.getCountOfLinks();

	}

	@Then("User is able to see Overview Text in the page")
	public void user_is_able_to_see_overview_text_in_the_page() {
		overviewOfTreesPage = new OverviewOfTreesPage(driver);
		overviewOfTreesPage.topHeadingIsDisplayed();
		overviewOfTreesPage.overviewHeadingText();
		System.out.println("Scenario 2 Executed");
	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {

		overviewOfTreesPage = new OverviewOfTreesPage(driver);
		treePage.clickOnOverviewOfTree();
		overviewOfTreesPage.clickOnTryHereButton();

	}

	@Then("User is entered into a page having tryEditor with Run button")
	public void user_is_entered_into_a_page_having_try_editor_with_run_button() {

		commonUtils = new CommonUtils(driver);
		commonUtils.isTryEditorPageDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		//	    commonUtils.verifyValidDataInTryEditor();
		//	    commonUtils.verifyAlertMessageInTryEditor();
		//	    commonUtils.verifyBlankDataInTryEditor();
		commonUtils.verifyBackFromTryEditorPage();
		System.out.println("Scenario 3 Executed");
	}

	//************************ Terminologies Page ****************************
	//*************************Scenario 1**********************************
	@When("User clicks Terminologies link")
	public void user_clicks_terminologies_link() {
		treePage = new TreePage(driver);
		treePage.clickOnTerminologies();
	}

	@Then("User is entered into Terminologies page")
	public void user_is_entered_into_terminologies_page() {
		terminologies = new Terminologies(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/terminologies/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Scenario 1 Executed");
	}

	//**************************Scenario 2********************************
	@Given("User is entered into Terminologies Page successfully")
	public void user_is_entered_into_terminologies_page_successfully() {
		treePage = new TreePage(driver);
		System.out.println("Page title is : " + driver.getTitle());
		treePage.clickOnTerminologies();
	}

	@When("Validate user is in the Terminologies page")
	public void validate_user_is_in_the_terminologies_page() {
		terminologies = new Terminologies(driver);
		terminologies.getCountOfLinks();
	}

	@Then("User is able to see Terminologies Text in the page")
	public void user_is_able_to_see_terminologies_text_in_the_page() {
		terminologies.terminologiesHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 2 Executed");
	}
	//***********************Scenario 3****************************************
	@When("User clicks on Try here button under Terminologies")
	public void user_clicks_on_try_here_button_under_terminologies() {
		terminologies = new Terminologies(driver);
		terminologies.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//************************ Types of Trees ****************************
	//*************************Scenario 1**********************************	

	@When("User clicks Types of Trees link")
	public void user_clicks_types_of_trees_link() {
		treePage = new TreePage(driver);
		treePage.clickOnTypesOfTreesLink();
	}

	@Then("User is entered into Types of Trees page")
	public void user_is_entered_into_types_of_trees_page() {
		typesofTreesPage = new TypesofTreesPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/types-of-trees/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}

	//**************************Scenario 2********************************

	@Given("User is entered into Types of Trees Page successfully")
	public void user_is_entered_into_types_of_trees_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnTypesOfTreesLink();
	}

	@When("Validate user is in the Types of Trees page")
	public void validate_user_is_in_the_types_of_trees_page() {
		typesofTreesPage = new TypesofTreesPage(driver);
		typesofTreesPage.getCountOfLinks();
	}

	@Then("User is able to see Types of Trees Text in the page")
	public void user_is_able_to_see_types_of_trees_text_in_the_page() {
		typesofTreesPage.typesOfTreesHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 Executed");
	}
	//***********************Scenario 3****************************************
	@When("User clicks on Try here button under Types of Trees")
	public void user_clicks_on_try_here_button_under_types_of_trees() {
		typesofTreesPage = new TypesofTreesPage(driver);
		typesofTreesPage.typesOfTreesHeadingIsDisplayed();
		typesofTreesPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//****************************Tree Traversals***********************************************
	//*************************Scenario 1**********************************	

	@When("User clicks Tree Traversals link")
	public void user_clicks_tree_traversals_link() {
		treePage = new TreePage(driver);
		System.out.println("Page title is : " + driver.getTitle());
		treePage.clickOnTreeTraversalsLink();
	}

	@Then("User is entered into Tree Traversals page")
	public void user_is_entered_into_tree_traversals_page() {
		treeTraversalsPage = new TreeTraversalsPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/tree-traversals/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}
	//**************************Scenario 2********************************

	@Given("User is entered into Tree Traversals Page successfully")
	public void user_is_entered_into_tree_traversals_page_successfully() {

		treePage = new TreePage(driver);
		treePage.clickOnTreeTraversalsLink();
	}

	@When("Validate user is in the Tree Traversals page")
	public void validate_user_is_in_the_tree_traversals_page() {
		treeTraversalsPage = new TreeTraversalsPage(driver);
		treeTraversalsPage.getCountOfLinks();
	}

	@Then("User is able to see Tree Traversals Text in the page")
	public void user_is_able_to_see_tree_traversals_text_in_the_page() {
		treeTraversalsPage.treeTraversalsHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 Executed");
	}
	//****************************Scenario 3 steps*************************

	@When("User clicks on Try here button under Tree Traversals")
	public void user_clicks_on_try_here_button_under_tree_traversals() {
		treeTraversalsPage = new TreeTraversalsPage(driver);
		treeTraversalsPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//*******************************Traversals-Illustration**********************************************
	//*************************Scenario 1**********************************

	@When("User clicks Traversals-Illustration link")
	public void user_clicks_traversals_illustration_link() {
		treePage = new TreePage(driver);
		treePage.clickOnTraversals_IllustrationLink();

	}

	@Then("User is entered into Traversals-Illustration page")
	public void user_is_entered_into_traversals_illustration_page() {
		traversals_IllustrationPage = new Traversals_IllustrationPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/traversals-illustration/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}
	//**************************Scenario 2********************************

	@Given("User is entered into Traversals-Illustration Page successfully")
	public void user_is_entered_into_traversals_illustration_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnTraversals_IllustrationLink();
	}

	@When("Validate user is in the Traversals-Illustration page")
	public void validate_user_is_in_the_traversals_illustration_page() {
		traversals_IllustrationPage = new Traversals_IllustrationPage(driver);
		traversals_IllustrationPage.getCountOfLinks();
	}

	@Then("User is able to see Traversals-Illustration Text in the page")
	public void user_is_able_to_see_traversals_illustration_text_in_the_page() {
		traversals_IllustrationPage.traversals_IllustrationHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 Executed");
	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Traversals-Illustration")
	public void user_clicks_on_try_here_button_under_traversals_illustration() {
		traversals_IllustrationPage = new Traversals_IllustrationPage(driver);
		traversals_IllustrationPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//*****************************Binary Trees*********************************************
	//*************************Scenario 1**********************************

	@When("User clicks Binary Trees link")
	public void user_clicks_binary_trees_link() {
		treePage = new TreePage(driver);
		treePage.clickOnBinaryTreesLink();
	}

	@Then("User is entered into Binary Trees page")
	public void user_is_entered_into_binary_trees_page() {
		binaryTreesPage = new BinaryTreesPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/binary-trees/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}
	//**************************Scenario 2********************************

	@Given("User is entered into Binary Trees Page successfully")
	public void user_is_entered_into_binary_trees_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnBinaryTreesLink();

	}

	@When("Validate user is in the Binary Trees page")
	public void validate_user_is_in_the_binary_trees_page() {
		binaryTreesPage = new BinaryTreesPage(driver);
		binaryTreesPage.getCountOfLinks();	
	}

	@Then("User is able to see Binary Trees Text in the page")
	public void user_is_able_to_see_binary_trees_text_in_the_page() {
		binaryTreesPage.binaryTreesHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 Executed");
	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Binary Trees")
	public void user_clicks_on_try_here_button_under_binary_trees() {
		binaryTreesPage = new BinaryTreesPage(driver);
		binaryTreesPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//***************************Types of Binary Trees*******************************************
	//*************************Scenario 1**********************************

	@When("User clicks Types of Binary Trees link")
	public void user_clicks_types_of_binary_trees_link() {
		treePage = new TreePage(driver);
		treePage.clickOnTypesOfBinaryTreesLink();
	}

	@Then("User is entered into Types of Binary Trees page")
	public void user_is_entered_into_types_of_binary_trees_page() {
		typesOfBinaryTreesPage = new TypesOfBinaryTreesPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/types-of-binary-trees/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}
	//**************************Scenario 2********************************

	@Given("User is entered into Types of Binary Trees Page successfully")
	public void user_is_entered_into_types_of_binary_trees_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnTypesOfBinaryTreesLink();
	}

	@When("Validate user is in the Types of Binary Trees page")
	public void validate_user_is_in_the_types_of_binary_trees_page() {
		typesOfBinaryTreesPage = new TypesOfBinaryTreesPage(driver);
		typesOfBinaryTreesPage.getCountOfLinks();
	}

	@Then("User is able to see Types of Binary Trees Text in the page")
	public void user_is_able_to_see_types_of_binary_trees_text_in_the_page() {
		typesOfBinaryTreesPage.typesOfBinaryTreesHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 ");
	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Types of Binary Trees")
	public void user_clicks_on_try_here_button_under_types_of_binary_trees() {
		typesOfBinaryTreesPage = new TypesOfBinaryTreesPage(driver);
		typesOfBinaryTreesPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//************************Implementation in Python**********************************************
	//*************************Scenario 1**********************************

	@When("User clicks Implementation in Python link")
	public void user_clicks_implementation_in_python_link() {
		treePage = new TreePage(driver);
		treePage.clickOnimplementationInPythonLink();
	}

	@Then("User is entered into Implementation in Python page")
	public void user_is_entered_into_implementation_in_python_page() {
		implementationInPythonPage = new ImplementationInPythonPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("com/tree/implementation-of-binary-trees/"));
		commonUtils = new CommonUtils(driver);
		commonUtils.isDropdownDisplayed();
		commonUtils.isUserNameDisplayed();
		System.out.println("Page title is : " + driver.getTitle());
		System.out.println("Scenario 1 Executed");
	}
	//**************************Scenario 2********************************

	@Given("User is entered into Implementation in Python Page successfully")
	public void user_is_entered_into_implementation_in_python_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnimplementationInPythonLink();
	}

	@When("Validate user is in the Implementation in Python page")
	public void validate_user_is_in_the_implementation_in_python_page() {
		implementationInPythonPage = new ImplementationInPythonPage(driver);
		implementationInPythonPage.getCountOfLinks();
	}

	@Then("User is able to see Implementation in Python Text in the page")
	public void user_is_able_to_see_implementation_in_python_text_in_the_page() {
		implementationInPythonPage.implementationInPythonHeadingIsDisplayed();
		commonUtils = new CommonUtils(driver);
		commonUtils.isLogoPresent();
		commonUtils.isSignOutLinkDisplayed();
		System.out.println("Scenario 2 ");

	}//****************************Scenario 3 steps*************************

	@When("User clicks on Try here button under Implementation in Python")
	public void user_clicks_on_try_here_button_under_implementation_in_python() {
		implementationInPythonPage = new ImplementationInPythonPage(driver);
		implementationInPythonPage.clickOnTryHereButton();
		System.out.println("Scenario 3 Executed");
	}

	//**************************Binary Tree Traversals************************************************
	//*************************Scenario 1**********************************

	@When("User clicks Binary Tree Traversals link")
	public void user_clicks_binary_tree_traversals_link() {
		treePage = new TreePage(driver);
		treePage.clickOnBinaryTreeTraversalsLink();
	}

	@Then("User is entered into Binary Tree Traversals page")
	public void user_is_entered_into_binary_tree_traversals_page() {
		binaryTreeTraversalsPage = new BinaryTreeTraversalsPage(driver);

	}
	//**************************Scenario 2********************************

	@Given("User is entered into Binary Tree Traversals Page successfully")
	public void user_is_entered_into_binary_tree_traversals_page_successfully() {
		treePage = new TreePage(driver);
		treePage.clickOnBinaryTreeTraversalsLink();
	}

	@When("Validate user is in the Binary Tree Traversals page")
	public void validate_user_is_in_the_binary_tree_traversals_page() {

	}

	@Then("User is able to see Binary Tree Traversals Text in the page")
	public void user_is_able_to_see_binary_tree_traversals_text_in_the_page() {

	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Binary Tree Traversals")
	public void user_clicks_on_try_here_button_under_binary_tree_traversals() {

	}

	//*********************Implementation of Binary Trees*********************************
	//*************************Scenario 1**********************************


	@When("User clicks Implementation of Binary Trees link")
	public void user_clicks_implementation_of_binary_trees_link() {

	}

	@Then("User is entered into Implementation of Binary Trees page")
	public void user_is_entered_into_implementation_of_binary_trees_page() {

	}
	//**************************Scenario 2********************************
	@Given("User is entered into Implementation of Binary Trees Page successfully")
	public void user_is_entered_into_implementation_of_binary_trees_page_successfully() {

	}

	@When("Validate user is in the Implementation of Binary Trees page")
	public void validate_user_is_in_the_implementation_of_binary_trees_page() {

	}

	@Then("User is able to see Implementation of Binary Trees Text in the page")
	public void user_is_able_to_see_implementation_of_binary_trees_text_in_the_page() {

	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Implementation of Binary Trees")
	public void user_clicks_on_try_here_button_under_implementation_of_binary_trees() {

	}

	//************************Applications of Binary Trees******************************
	//*************************Scenario 1**********************************

	@When("User clicks Applications of Binary Trees link")
	public void user_clicks_applications_of_binary_trees_link() {

	}

	@Then("User is entered into Applications of Binary Trees page")
	public void user_is_entered_into_applications_of_binary_trees_page() {

	}
	//**************************Scenario 2********************************

	@Given("User is entered into Applications of Binary Trees Page successfully")
	public void user_is_entered_into_applications_of_binary_trees_page_successfully() {

	}

	@When("Validate user is in the Applications of Binary Trees page")
	public void validate_user_is_in_the_applications_of_binary_trees_page() {

	}

	@Then("User is able to see Applications of Binary Trees Text in the page")
	public void user_is_able_to_see_applications_of_binary_trees_text_in_the_page() {

	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Applications of Binary Trees")
	public void user_clicks_on_try_here_button_under_applications_of_binary_trees() {

	}

	//*************************Binary Search Trees**********************************************
	//*************************Scenario 1**********************************

	@When("User clicks Binary Search Trees link")
	public void user_clicks_binary_search_trees_link() {

	}

	@Then("User is entered into Binary Search Trees page")
	public void user_is_entered_into_binary_search_trees_page() {

	}
	//**************************Scenario 2********************************

	@Given("User is entered into Binary Search Trees Page successfully")
	public void user_is_entered_into_binary_search_trees_page_successfully() {

	}

	@When("Validate user is in the Binary Search Trees page")
	public void validate_user_is_in_the_binary_search_trees_page() {

	}

	@Then("User is able to see Binary Search Trees Text in the page")
	public void user_is_able_to_see_binary_search_trees_text_in_the_page() {

	}
	//****************************Scenario 3 steps*************************
	@When("User clicks on Try here button under Binary Search Trees")
	public void user_clicks_on_try_here_button_under_binary_search_trees() {

	}

	//************************Implementation Of BST********************************************
	//*************************Scenario 1**********************************

	@When("User clicks Implementation Of BST link")
	public void user_clicks_implementation_of_bst_link() {

	}

	@Then("User is entered into Implementation Of BST page")
	public void user_is_entered_into_implementation_of_bst_page() {

	}
	//**************************Scenario 2********************************

	@Given("User is entered into Implementation Of BST Page successfully")
	public void user_is_entered_into_implementation_of_bst_page_successfully() {

	}

	@When("Validate user is in the Implementation Of BST page")
	public void validate_user_is_in_the_implementation_of_bst_page() {

	}

	@Then("User is able to see Implementation Of BST Text in the page")
	public void user_is_able_to_see_implementation_of_bst_text_in_the_page() {

	}
	//****************************Scenario 3 steps*************************

	@When("User clicks on Try here button under Implementation Of BST")
	public void user_clicks_on_try_here_button_under_implementation_of_bst() {

	}


}
