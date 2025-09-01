package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPageObj {

	WebDriver driver;

	public loginPageObj(WebDriver driver) {

		this.driver = driver;
	}

	By login_email = By.xpath("//input[@data-qa='login-email']");
	By login_pwd = By.name("password");
	By login_button = By.xpath("//button[@data-qa='login-button']");
	By error_msg = By.xpath("//p[@style='color: red;']");
	By signup_name = By.xpath("//input[@data-qa='signup-name']");
	By signup_email = By.xpath("//input[@data-qa='signup-email']");
	By signup_Button = By.xpath("//button[@data-qa='signup-button']");

	// login section

	public void enterLogin_email(String email) {
		
		driver.findElement(login_email).sendKeys(email);

	}

	public void enterLogin_pwd(String pwd) {

		driver.findElement(login_pwd).sendKeys(pwd);

	}

	public void clickLogin_button() {

		driver.findElement(login_button).click();

	}

	public String getErrorMessage() {

		return driver.findElement(error_msg).getText();

	}

	// signup section

	public void enterSignup_name(String name) {

		driver.findElement(signup_name).sendKeys(name);

	}

	public void enterSignup_email(String email) {

		driver.findElement(signup_email).sendKeys(email);

	}

	public void clickSignup_button() {

		driver.findElement(signup_Button).click();

	}

}
