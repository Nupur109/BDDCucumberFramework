package stepDefinitions;

import java.io.IOException;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import base.baseClass;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;

import io.cucumber.java.Scenario;

public class hooks extends baseClass{
	
	
	    @Before
	    public void setup(Scenario scenario) throws IOException {
	    	generateExtentReports();
	        log = extent.createTest(scenario.getName() + "Login Test Execution");
	        log.info("Setting up test...");
	    	webDriverManager();
	    	
	    }
	    
	    @AfterAll
	    
	    public static void flushReport() {
	        if (extent != null) {
	            extent.flush();
	        }
	    }
	    
	   

	    
	    
	}


