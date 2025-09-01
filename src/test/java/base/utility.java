package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	
	WebDriver driver;
	public static String email;
	public utility(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public static void selectDropdown(WebElement dropdownElement, String value) {
		Select dropdown=new Select(dropdownElement);
		dropdown.selectByValue(value);
	}
	
		
	public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

	
	
	    public static void generateRandomEmail() {
	        // Generate random number between 1000–9999
	        int randomNum = (int)(Math.random() * 10000);
	        
	        // Create unique email id
	        email = "testuser" + randomNum + "@example.com";
	       
	    }
	
	
	

}
