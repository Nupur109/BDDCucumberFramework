package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deleteAccountPageObj {

	WebDriver driver;

	public deleteAccountPageObj(WebDriver driver) {

		this.driver = driver;
	}

	By accountDeletedMsgTitle = By.xpath("//h2[@class='title text-center']");

	public String getMsgTitle() {
		return driver.findElement(accountDeletedMsgTitle).getText();

	}

	
	}
