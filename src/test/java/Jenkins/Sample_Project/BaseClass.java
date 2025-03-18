package Jenkins.Sample_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	
	public static Logger logger;
	@BeforeMethod 
	public void URL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/");
		Reporter.log("URL verified", true);
		
		logger = LogManager.getLogger(BaseClass.class.getName());
		//PropertyConfigurator.configure("Log4j.properties");
		logger.info("started");
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
		driver.quit();
		Reporter.log("Driver closed successfully", true);
	}
}
