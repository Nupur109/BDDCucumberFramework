package stepDefinitions;

import org.junit.Assert;

import base.baseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.deleteAccountPageObj;
import pageObjects.homePageObj;
//import pageObjects.loginPageObj;

public class logout_deleteStepDef extends baseClass {

	homePageObj home = new homePageObj(driver);;
	//loginPageObj login=new loginPageObj(driver);
	deleteAccountPageObj deleteAccount=new deleteAccountPageObj(driver);

	@When("User clicks on Delete Account button")
	public void user_clicks_on_delete_account_button() {
		
		home.clickDeleteAccount();
	}

	@Then("User should be deleted and navigated to Account deleted page")
	public void user_should_be_deleted_and_navigated_to_account_deleted_page() {
		String title = "Automation Exercise - Account Created";
			Assert.assertEquals(title, driver.getTitle());
	}

	@Then("User should verify ACCOUNT DELETED! is displayed on the page")
	public void user_should_verify_account_deleted_is_displayed_on_the_page() {
		//deleteAccount = new deleteAccountPageObj(driver);
		Assert.assertEquals(deleteAccount.getMsgTitle(), "ACCOUNT DELETED!");
		quitDriver();
	}

	@When("User clicks on Logout Account button")
	public void user_clicks_on_logout_account_button() {
		home.clickLogout();
	}

	@Then("Sigup\\/Login button should be displayed")
	public void sigup_login_button_should_be_displayed() {

		home.getSignUpLogin_Button();
		String ExpectedButtonText = "Signup / Login";
		Assert.assertEquals(home.getSignUpLogin_Button(), ExpectedButtonText);
		//quitDriver();
	}

}
