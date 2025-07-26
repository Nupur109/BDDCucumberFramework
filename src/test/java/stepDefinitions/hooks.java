package stepDefinitions;

import java.io.IOException;

import base.baseClass;
import io.cucumber.java.Before;

public class hooks extends baseClass{

	
	    @Before
	    public void setup() throws IOException {
	    	generateExtentReports();
	        log = extent.createTest("Login Test Execution");
	        log.info("Setting up test...");
	    	webDriverManager();
	    	
	    }
	}


