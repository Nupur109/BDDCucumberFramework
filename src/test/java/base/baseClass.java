package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class baseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static ChromeOptions options;
	public static ExtentReports extent;
	public static ExtentTest log;

	public void webDriverManager() throws IOException {
		
//		if (driver != null) {
//			return;
//		}

		FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
		prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		options = new ChromeOptions();
		options.addArguments("start-maximized");

		if (driver == null) {
			if ((prop.getProperty("browser")).equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver(options);
				log.info("Chrome browser is launched");
			}

			if ((prop.getProperty("browser")).equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				log.info("Firefox browser is launched");
			}

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		if(log != null )log.info("Browser window maximized,implicit wait applied and all cookies deleted.");

	}

	public void generateExtentReports() {
		
		ExtentSparkReporter report = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/extent-report.html");
		report.config().setReportName("Automation Test Report");
        report.config().setDocumentTitle("Cucumber Extent Report");
        extent = new ExtentReports();
		extent.attachReporter(report);

		extent.setSystemInfo("Tester", "Nupur");
	}
	 public void quitDriver() {
			if (driver != null) {

				driver.quit();	
			}
		}
	
//	 public void flushReport() {
//	        if (extent != null) {
//	            extent.flush();
//	        }
//	    }

	
}