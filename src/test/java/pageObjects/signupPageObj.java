package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.utility;

public class signupPageObj {
	WebDriver driver;
	utility util;

	public signupPageObj(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.id("id_gender1");
	By name = By.id("name");
	By email = By.id("email");
	By pwd = By.id("password");
	By day_dob = By.xpath("//select[@id='days']");
	By month_dob = By.xpath("//select[@id='months']");
	By year_dob = By.xpath("//select[@id='years']");
	By newsletter_checkbox = By.id("newsletter");
	By optin_checkbox = By.id("optin");
	By first_name = By.id("first_name");
	By last_name = By.id("last_name");
	By company = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By country = By.xpath("//select[@id='country']");

	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By mobile = By.id("mobile_number");
	By submit = By.xpath("//button[@data-qa='create-account']");

	public void selectTitle() {
		driver.findElement(title).click();
	}

	public void getName() {
		driver.findElement(name).getText();
	}

	public void getEmail() {
		driver.findElement(email).getText();
	}

	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}

	public void enterFirst_Name(String firstName) {
		driver.findElement(first_name).sendKeys(firstName);
	}

	public void enterLast_Name(String lastName) {
		driver.findElement(last_name).sendKeys(lastName);
	}

	public void enterCompany(String signup_comp) {
		driver.findElement(company).sendKeys(signup_comp);
	}

	public void enterAddress1(String add1) {
		driver.findElement(address1).sendKeys(add1);
	}

	public void enterAddress2(String add2) {
		driver.findElement(address2).sendKeys(add2);
	}

	public void enterState(String signup_state) {
		driver.findElement(state).sendKeys(signup_state);
	}

	public void enterCity(String signup_city) {
		driver.findElement(city).sendKeys(signup_city);
	}

	public void enterZipCode(String signup_zipcode) {
		driver.findElement(zipcode).sendKeys(signup_zipcode);
	}

	public void enterMobileNo(String mobileNo) {
		driver.findElement(mobile).sendKeys(mobileNo);
	}

	public void selectCheckboxes() {
		driver.findElement(newsletter_checkbox).click();
		driver.findElement(optin_checkbox).click();
	}

	public void clickOnSubmit() {
		driver.findElement(submit).click();
	}

	public void selectCountry(String signup_country) {
		// util=new utility(driver);
		utility.selectDropdown(driver.findElement(country), signup_country);

	}

	public void selectDateOfBirth(String day, String month, String year) throws InterruptedException {
		utility.selectDropdown(driver.findElement(day_dob), day);
		Thread.sleep(3000);
		utility.waitForElementToBeClickable(driver, month_dob, 5);

		utility.selectDropdown(driver.findElement(month_dob), month);
		utility.waitForElementToBeClickable(driver, year_dob, 5);
		Thread.sleep(3000);
		
		utility.selectDropdown(driver.findElement(year_dob), year);

	}
}
