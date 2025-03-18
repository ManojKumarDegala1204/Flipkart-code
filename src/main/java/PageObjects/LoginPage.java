package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[@class='_30XB9F']")
	public WebElement crossbutton;
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']") 
	public WebElement Username;
	
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	public WebElement Login;
	
	@FindBy(xpath="//a[@class='_1jKL3b']")
	public WebElement click;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public WebElement RequestOTP;
	
	
	// Webelements actions
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public LoginPage ClickLogin() {
		click.click();
		return this;
	}
	
	public LoginPage ClickonROTP() {
		RequestOTP.click();
		return this;
	}
	public LoginPage clickCrossicon() {
		crossbutton.click();
		return this;
	}
	public LoginPage EnterUsername() {
		Username.sendKeys("manu.degala@gmail.com");
		return this;
	}
	
	public LoginPage EnterPassword() {
		Password.sendKeys("9700653227");
		return this;
	}
	
	public LoginPage ClickonLogin() {
		Login.click();
		return this;
	}

}
