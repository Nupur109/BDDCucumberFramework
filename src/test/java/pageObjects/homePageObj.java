package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageObj {

	WebDriver driver;

	public homePageObj(WebDriver driver) {

		this.driver = driver;
	}

	By signup_login = By.xpath("//a[@href='/login']");
	By logout = By.xpath("//a[text()=' Logout']");
	By deleteAccount = By.xpath("//a[text()=' Delete Account']");
	By logInAs = By.xpath("//a[text()=' Logged in as ']");

	public void clickSignup_login() {

		driver.findElement(signup_login).click();

	}

	public void clickLogout() {

		driver.findElement(logout).click();

	}

	public void clickDeleteAccount() {

		driver.findElement(deleteAccount).click();

	}

	public String getTextLoginAs() {
		return driver.findElement(logInAs).getText();
	}

	public String getSignUpLogin_Button() {
		return driver.findElement(signup_login).getText();
	}

}
