package Jenkins.Sample_Project;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import PageObjects.LoginPage;
import PageObjects.Searchtheitems;



public class Flipkart extends BaseClass{
	@Test (priority = 1)
	public void verifyloginpage() throws Throwable {

		LoginPage LP = new LoginPage(BaseClass.driver);
		
		logger = LogManager.getLogger(Flipkart.class.getName());
		
//		PropertyConfigurator.configure("Log4j.properties");
//		LP.clickCrossicon();
		String Actual = BaseClass.driver.getTitle();
		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Reporter.log("Page Title - " + Actual, true);
		logger.info("page open");
		Assert.assertEquals(Actual, Expected);
		String URL = BaseClass.driver.getCurrentUrl();
		Reporter.log("url printed   " + URL, true);
		
//		LP.ClickLogin().EnterUsername().ClickonROTP();
//		Thread.sleep(2000);
		
	}
	
	@Test (priority=2)
	public void searchtheitem() throws Throwable {

//		LoginPage LP= new LoginPage(BaseClass.driver);
////		LP.clickCrossicon();
//		String Actual = BaseClass.driver.getTitle();
//		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Reporter.log("Page Title - " + Actual, true);
//		Assert.assertEquals(Actual, Expected);
//		String URL = BaseClass.driver.getCurrentUrl();
//		Reporter.log("url printed   " + URL, true);
		Flipkart vlp = new Flipkart();
		vlp.verifyloginpage();
		
		Searchtheitems sti = new Searchtheitems(BaseClass.driver);
		sti.clicksearchbar();
		Thread.sleep(5000);
	//	List<WebElement>search_suggestion= driver.findElements(By.xpath("//a[@class='oleBil']"));
		
		List<WebElement> search_suggestion= sti.select_search_result;
		for(int i=0; i<search_suggestion.size()-1;i++)
		{

			Reporter.log("List of search results " + search_suggestion.get(i).getText(), true);
			
		}
	
		for(int i=0; i<search_suggestion.size()-1;i++) {
			if(search_suggestion.get(i).getText().contains("apple watch")) {
				search_suggestion.get(i).click();
				Reporter.log("apple watch clicked from the list", true);
			}
		}
		
		String s1 = BaseClass.driver.getTitle();
		Reporter.log("Page title is - " + s1, true);
		Assert.assertEquals(s1, "Apple Watch- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		
	}
	@Test (priority=3)
	public void Select_the_item_from_the_list() throws Throwable {
//		LoginPage L = new LoginPage(BaseClass.driver);
//	//	L.clickCrossicon();
//		String Actual = BaseClass.driver.getTitle();
//		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Reporter.log("Page Title - " + Actual, true);
//		Assert.assertEquals(Actual, Expected);
//		String URL = BaseClass.driver.getCurrentUrl();
//		Reporter.log("url printed   " + URL, true);
//		Searchtheitems si = new Searchtheitems(BaseClass.driver);
//		si.clicksearchbar();
//		Thread.sleep(5000);
//		List<WebElement> search_suggestion = si.select_search_result;
//		for(int i=0; i<search_suggestion.size()-1; i++) {
//			Reporter.log("List of search results  "+search_suggestion.get(i).getText(), true);
//			
//		}
//		
//		for(int i=0; i<search_suggestion.size()-1;i++) {
//			if(search_suggestion.get(i).getText().contains("apple watch")) {
//				search_suggestion.get(i).click();
//				Reporter.log("apple watch clicked from the list", true);
//			}
//		}
//		
//		String s1 = BaseClass.driver.getTitle();
//		Reporter.log("Page title is - " + s1, true);
//		//Assert.assertEquals(s1, "Apple Watch- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
//	
		Flipkart sti = new Flipkart();
		sti.searchtheitem();
		Searchtheitems si = new Searchtheitems(BaseClass.driver);
		si.click_selected_item();
		Reporter.log("Item selected successfully", true);
		Thread.sleep(5000);
		
		
		 Set<String> window=driver.getWindowHandles();
		    List<String>handle=new ArrayList<>(window);
		    driver.switchTo().window(handle.get(1));
		    String st1 = BaseClass.driver.getCurrentUrl();
		    Reporter.log("The current URL is  " + st1, true);

		String st2 = BaseClass.driver.getTitle();
	    Reporter.log("Page title is -"+ st2, true);
	   // Assert.assertEquals(st2, "Apple Watch Series 10 GPS 46mm Jet Black Aluminium with Ink Sport Loop Price in India - Buy Apple Watch Series 10 GPS 46mm Jet Black Aluminium with Ink Sport Loop online at Flipkart.com");
	    Thread.sleep(3000);       
	  //  driver.close();
	  //  driver.switchTo().window(handle.get(0));
	}
	
	@Test (priority=4)
	public void Additemtothecart() throws Throwable {
//		LoginPage L = new LoginPage(BaseClass.driver);
//		L.clickCrossicon();
//		String Actual = BaseClass.driver.getTitle();
//		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Reporter.log("Page Title - " + Actual, true);
//		Assert.assertEquals(Actual, Expected);
//		String URL = BaseClass.driver.getCurrentUrl();
//		Reporter.log("url printed   " + URL, true);
//		Searchtheitems si = new Searchtheitems(BaseClass.driver);
//		si.clicksearchbar();
//		Thread.sleep(5000);
//		List<WebElement> search_suggestion = si.select_search_result;
//		for(int i=0; i<search_suggestion.size()-1; i++) {
//			Reporter.log("List of search results  "+search_suggestion.get(i).getText(), true);
//			
//		}
//		
//		for(int i=0; i<search_suggestion.size()-1;i++) {
//			if(search_suggestion.get(i).getText().contains("apple watch")) {
//				search_suggestion.get(i).click();
//				Reporter.log("apple watch clicked from the list", true);
//			}
//		}
//		
//		String s1 = BaseClass.driver.getTitle();
//		Reporter.log("Page title is - " + s1, true);
//		Assert.assertEquals(s1, "Apple Watch- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
//		
//		si.click_selected_item();
//		Reporter.log("Item selected successfully", true);
//		Thread.sleep(5000);
//		
//		
//		 Set<String> window=driver.getWindowHandles();
//		    List<String>handle=new ArrayList<>(window);
//		    driver.switchTo().window(handle.get(1));
//		    String st1 = BaseClass.driver.getCurrentUrl();
//		    Reporter.log("The current URL is  " + st1, true);
//
//		String st2 = BaseClass.driver.getTitle();
//	    Reporter.log("Page title is -"+ st2, true);
//	    Assert.assertEquals(st2, "Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPods - APPLE : Flipkart.com");
//	    Thread.sleep(3000);
	  //  driver.close();
	  //  driver.switchTo().window(handle.get(0));
	  //  Thread.sleep(3000);
		Searchtheitems si = new Searchtheitems(BaseClass.driver);
		Flipkart AIC = new Flipkart();
		AIC.Select_the_item_from_the_list();
	    si.EnterPincode();
	    Thread.sleep(2000);
	    si.ClickCheckbutton();
	    Thread.sleep(2000);
	    String msg = si.deliverytextmessage.getText();
	    Reporter.log("message captured " + msg, true);
	    Thread.sleep(5000);
	    si.ClickAddcartbutton();
	  //  driver.close();
	  //  driver.switchTo().window(handle.get(0));
		
	}
	
	@Test (priority=5)
	public void Gotocartandverifytheaddeditem() throws Throwable {
//		LoginPage L = new LoginPage(BaseClass.driver);
//		L.clickCrossicon();
//		String Actual = BaseClass.driver.getTitle();
//		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Reporter.log("Page Title - " + Actual, true);
//		Assert.assertEquals(Actual, Expected);
//		String URL = BaseClass.driver.getCurrentUrl();
//		Reporter.log("url printed   " + URL, true);
//		Searchtheitems si = new Searchtheitems(BaseClass.driver);
//		si.clicksearchbar();
//		Thread.sleep(5000);
//		List<WebElement> search_suggestion = si.select_search_result;
//		for(int i=0; i<search_suggestion.size()-1; i++) {
//			Reporter.log("List of search results  "+search_suggestion.get(i).getText(), true);
//			
//		}
//		
//		for(int i=0; i<search_suggestion.size()-1;i++) {
//			if(search_suggestion.get(i).getText().contains("apple watch")) {
//				search_suggestion.get(i).click();
//				Reporter.log("apple watch clicked from the list", true);
//			}
//		}
//		
//		String s1 = BaseClass.driver.getTitle();
//		Reporter.log("Page title is - " + s1, true);
//		Assert.assertEquals(s1, "Apple Watch- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
//		
//		si.click_selected_item();
//		Reporter.log("Item selected successfully", true);
//		Thread.sleep(5000);
//		
//		
//		 Set<String> window=driver.getWindowHandles();
//		    List<String>handle=new ArrayList<>(window);
//		    driver.switchTo().window(handle.get(1));
//		    String st1 = BaseClass.driver.getCurrentUrl();
//		    Reporter.log("The current URL is  " + st1, true);
//
//		String st2 = BaseClass.driver.getTitle();
//	    Reporter.log("Page title is -"+ st2, true);
//	    Assert.assertEquals(st2, "Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPods - APPLE : Flipkart.com");
//	    Thread.sleep(3000);
//	  //  driver.close();
//	  //  driver.switchTo().window(handle.get(0));
//	  //  Thread.sleep(3000);
//	    si.EnterPincode();
//	    Thread.sleep(2000);
//	    si.ClickCheckbutton();
//	    Thread.sleep(2000);
//	    String msg = si.deliverytextmessage.getText();
//	    Reporter.log("message captured " + msg, true);
//	    Thread.sleep(5000);
//	    si.ClickAddcartbutton();
		Searchtheitems si = new Searchtheitems(BaseClass.driver);
	    Flipkart Gcvi = new Flipkart();
	    Gcvi.Additemtothecart();
	    Thread.sleep(3000);
	    String T = driver.getTitle();
	    Reporter.log("Page title is - " + T, true);
	    Assert.assertEquals(T, "Shopping Cart | Flipkart.com");
	    
	    String PD = si.pricedetails.getText();
	    Reporter.log(PD, true);
	 //   driver.close();
	 //   driver.switchTo().window(handle.get(0));
		
		
	}
	
	@Test (priority=6)
	public void Placeorder() throws Throwable {
//		LoginPage L = new LoginPage(BaseClass.driver);
//		L.clickCrossicon();
//		String Actual = BaseClass.driver.getTitle();
//		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		Reporter.log("Page Title - " + Actual, true);
//		Assert.assertEquals(Actual, Expected);
//		String URL = BaseClass.driver.getCurrentUrl();
//		Reporter.log("url printed   " + URL, true);
//		Searchtheitems si = new Searchtheitems(BaseClass.driver);
//		si.clicksearchbar();
//		Thread.sleep(5000);
//		List<WebElement> search_suggestion = si.select_search_result;
//		for(int i=0; i<search_suggestion.size()-1; i++) {
//			Reporter.log("List of search results  "+search_suggestion.get(i).getText(), true);
//			
//		}
//		
//		for(int i=0; i<search_suggestion.size()-1;i++) {
//			if(search_suggestion.get(i).getText().contains("apple watch")) {
//				search_suggestion.get(i).click();
//				Reporter.log("apple watch clicked from the list", true);
//			}
//		}
//		
//		String s1 = BaseClass.driver.getTitle();
//		Reporter.log("Page title is - " + s1, true);
//		Assert.assertEquals(s1, "Apple Watch- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
//		
//		si.click_selected_item();
//		Reporter.log("Item selected successfully", true);
//		Thread.sleep(5000);
//		
//		
//		 Set<String> window=driver.getWindowHandles();
//		    List<String>handle=new ArrayList<>(window);
//		    driver.switchTo().window(handle.get(1));
//		    String st1 = BaseClass.driver.getCurrentUrl();
//		    Reporter.log("The current URL is  " + st1, true);
//
//		String st2 = BaseClass.driver.getTitle();
//	    Reporter.log("Page title is -"+ st2, true);
//	    Assert.assertEquals(st2, "Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPods - APPLE : Flipkart.com");
//	    Thread.sleep(3000);
//	  //  driver.close();
//	  //  driver.switchTo().window(handle.get(0));
//	  //  Thread.sleep(3000);
//	    si.EnterPincode();
//	    Thread.sleep(2000);
//	    si.ClickCheckbutton();
//	    Thread.sleep(2000);
//	    String msg = si.deliverytextmessage.getText();
//	    Reporter.log("message captured " + msg, true);
//	    Thread.sleep(5000);
//	    si.ClickAddcartbutton();
//	    Thread.sleep(3000);
//	    String T = driver.getTitle();
//	    Reporter.log("Page title is - " + T, true);
//	    Assert.assertEquals(T, "Shopping Cart | Flipkart.com");
//	    String PD = si.pricedetails.getText();
//	    Reporter.log(PD, true);
		Searchtheitems si = new Searchtheitems(BaseClass.driver);
	    Flipkart PH = new Flipkart();
	    PH.Gotocartandverifytheaddeditem();
	    si.Clickplaceorder();
	    String PO = driver.getTitle();
	    Reporter.log("Page title - " + PO, true);
	    
	   // driver.close();
	   // driver.switchTo().window(handle.get(0));
	}
	
	

}
