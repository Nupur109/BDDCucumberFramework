package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseClass;

public class loginPageObj  {

	WebDriver driver;

	public loginPageObj(WebDriver driver) {

		this.driver = driver;
	}

	By signup_login = By.xpath("//a[@href='/login']");
	By signup_name = By.xpath("//input[@data-qa='signup-name']");
	By signup_email = By.xpath("//input[@data-qa='signup-email']");
	By signup_Button = By.xpath("//button[@data-qa='signup-button']");

	public void clickSignup_login() {

		driver.findElement(signup_login).click();

	}

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
