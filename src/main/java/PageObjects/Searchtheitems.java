package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Searchtheitems {
	
	public  Searchtheitems(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
 @FindBy(xpath="//input[@class='Pke_EE']")	
 public WebElement Searchbar;
 
 @FindBys(@FindBy(xpath="//a[@class='oleBil']"))
 public List<WebElement> select_search_result;
 
 @FindBy(xpath="//a[text()='Apple Watch Series 10 GPS 46mm Jet Black Aluminium with...']")
 public WebElement select_item;
 
 @FindBy(xpath="//input[@id='pincodeInputId']")
 public WebElement Selectpincode;
 
 @FindBy(xpath="//span[@class='i40dM4']")
 public WebElement Check;
 
// @FindBy(xpath="//div[text()='Enter Delivery Pincode']")
// public WebElement Selectpincode;
 
 @FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
 public WebElement Addtocart;
 
@FindBy(xpath="//div[@class='hVvnXm']")
public WebElement deliverytextmessage;

@FindBy(xpath="//div[@class='kQCHPX']")
public WebElement pricedetails;

@FindBy(xpath="//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")
public WebElement Placeorder;
 
 //actions
 public Searchtheitems clicksearchbar() {
	 Searchbar.sendKeys("Apple");
	 return this;
 }
 
 public Searchtheitems click_selected_item() {
	 select_item.click();
	 return this;
 }
 
 public Searchtheitems EnterPincode() {
	 Selectpincode.sendKeys("500084");
	 return this;
 }
 
 public Searchtheitems ClickCheckbutton() {
	 Check.click();
	 return this;
 }
 
 
 public Searchtheitems ClickAddcartbutton() {
	 Addtocart.click();
	 return this;
 }
 
 public Searchtheitems Clickplaceorder() {
	 Placeorder.click();
	 return this;
 }

}
