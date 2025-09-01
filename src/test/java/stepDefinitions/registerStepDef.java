package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.homePageObj;
import pageObjects.loginPageObj;
import pageObjects.signupPageObj;
import io.cucumber.java.en.Then;

import base.baseClass;
import base.utility;

public class registerStepDef extends baseClass {

	homePageObj home= new homePageObj(driver);;
	loginPageObj login= new loginPageObj(driver);	
	signupPageObj signup= new signupPageObj(driver);
	//utility util=new utility(driver);
	

	@Given("User navigates to the application url")
	public void user_navigates_to_the_application_url() {
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Url is launched");
		String title = "Automation Exercise";
		Assert.assertEquals(title, driver.getTitle());
		log.pass("url title is correct");
	}

	@When("User clicks on the Signup\\/login button")
	public void user_clicks_on_the_signup_login_button() {
		
		
		home.clickSignup_login();
		log.info("signup button is clicked");

	}

	@When("User should be navigated to the login page")
	public void user_should_be_navigated_to_the_login_page() {
		String title = "Automation Exercise - Signup / Login";
		Assert.assertEquals(title, driver.getTitle());
		log.info("login page is displayed");
	}

	@When("User enters Name and email in the Sign up section")
	public void user_enters_and_in_the_sign_up_section() {
		
			
		login.enterSignup_name(prop.getProperty("name"));
		utility.generateRandomEmail();
		String email= utility.email;
		login.enterSignup_email(email);
		log.info("name and email is entered");
	}

	@When("User clicks on the signup button")
	public void user_clicks_on_the_signup_button() {
		login.clickSignup_button();
	}

	@When("User should be on the Signup page")
	public void user_should_be_on_the_signup_page() {
		String signupTitle = "Automation Exercise - Signup";
		Assert.assertEquals(signupTitle, driver.getTitle());
	}

	@When("User enters the Account Information")
	public void user_enters_the_account_information() {

		
		signup.enterPassword(prop.getProperty("pwd"));
		signup.enterFirst_Name(prop.getProperty("firstName"));
		signup.enterLast_Name(prop.getProperty("lastname"));
		signup.enterCompany(prop.getProperty("company"));

		signup.enterAddress1(prop.getProperty("address1"));
		signup.enterAddress2(prop.getProperty("address2"));

		signup.enterState(prop.getProperty("state"));
		signup.enterCity(prop.getProperty("city"));
		signup.enterZipCode(prop.getProperty("zipcode"));
		signup.enterMobileNo(prop.getProperty("mobile"));

	}

	@When("User selects the Title, Date Of Birth, Checkboxes and Country")
	public void user_selects_the_title_date_of_birth_and_country() throws InterruptedException {
		signup.selectTitle();
		signup.selectCheckboxes();
//		String month=prop.getProperty("month");
//		String year=prop.getProperty("year");

		signup.selectDateOfBirth("9","5","1998");
		signup.selectCountry(prop.getProperty("country"));
		
	}

	@Then("User clicks on Create Account button")
	public void user_clicks_on_create_accont_button() {
		signup.clickOnSubmit();

	}

	@Then("Verify Account created page is displayed")
	public void verify_account_created_page_is_displayed() {

		String Acc_CreatedTitle = "Automation Exercise - Account Created";
		Assert.assertEquals(Acc_CreatedTitle, driver.getTitle());
		//driver.close();
		
		
	}

}
