package stepDefinitions;

import base.baseClass;
import base.utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.homePageObj;
import pageObjects.loginPageObj;
import pageObjects.signupPageObj;
import io.cucumber.java.en.Then;

public class loginStepDef extends baseClass {

	homePageObj home= new homePageObj(driver) ;
	loginPageObj login= new loginPageObj(driver);
	
	

	@When("User enters invalid Email and Password in the login section")
	public void user_enters_invalid_email_and_password_in_the_login_section() {
		//login = new loginPageObj(driver);
		login.enterLogin_email("invalid@Email.com");
		login.enterLogin_pwd("invalidPwd");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin_button();
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		String actualErrorMsg = login.getErrorMessage();
		String expectedErrorMsg = "Your email or password is incorrect!";
		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	}

	@When("User enters valid Email and Password in the login section")
	public void user_enters_valid_email_and_password_in_the_login_section() {
		
		String validEmail= utility.email;
		String validPwd = prop.getProperty("pwd");

		login.enterLogin_email(validEmail);
		login.enterLogin_pwd(validPwd);
	}

	@When("User should be navigated to the homePage")
	public void user_should_be_navigated_to_the_home_page() {
		String title = "Automation Exercise";
		Assert.assertEquals(title, driver.getTitle());
		System.out.println(driver.getTitle());
	}

	@When("User should verify that Logged in as username is displayed")
	public void user_should_verify_that_logged_in_as_username_is_displayed() {
		String actualUserName = home.getTextLoginAs();
		String userName = prop.getProperty("name");
		String expectedUserName = 	"Logged in as "+ userName;
		Assert.assertEquals(expectedUserName, actualUserName);

			}

}
