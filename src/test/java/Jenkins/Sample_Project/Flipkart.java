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
		

		String Actual = BaseClass.driver.getTitle();
		String Expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Reporter.log("Page Title - " + Actual, true);
		logger.info("page open");
		Assert.assertEquals(Actual, Expected);
		String URL = BaseClass.driver.getCurrentUrl();
		Reporter.log("url printed   " + URL, true);
		

		
	}
	
	@Test (priority=2)
	public void searchtheitem() throws Throwable {

		verifyloginpage();
		Searchtheitems sti = new Searchtheitems(BaseClass.driver);
		sti.clicksearchbar();
		Thread.sleep(5000);	
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

		searchtheitem();
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
	  
	    Thread.sleep(3000);       
	  
	}
	
	@Test (priority=4)
	public void Additemtothecart() throws Throwable {

		Searchtheitems si = new Searchtheitems(BaseClass.driver);
		
		Select_the_item_from_the_list();
	    si.EnterPincode();
	    Thread.sleep(2000);
	    si.ClickCheckbutton();
	    Thread.sleep(2000);
	    String msg = si.deliverytextmessage.getText();
	    Reporter.log("message captured " + msg, true);
	    Thread.sleep(5000);
	    si.ClickAddcartbutton();
	  
		
	}
	
	@Test (priority=5)
	public void Gotocartandverifytheaddeditem() throws Throwable {

		Searchtheitems si = new Searchtheitems(BaseClass.driver);
		Additemtothecart();
	    Thread.sleep(3000);
	    String T = driver.getTitle();
	    Reporter.log("Page title is - " + T, true);
	    Assert.assertEquals(T, "Shopping Cart | Flipkart.com"); 
	    String PD = si.pricedetails.getText();
	    Reporter.log(PD, true);
	    
	}
	
	@Test (priority=6)
	public void Placeorder() throws Throwable {

		Searchtheitems si = new Searchtheitems(BaseClass.driver);
	    Gotocartandverifytheaddeditem();
	    si.Clickplaceorder();
	    String PO = driver.getTitle();
	    Reporter.log("Page title - " + PO, true);
	    Assert.assertEquals(PO, "Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order");
	}
}
