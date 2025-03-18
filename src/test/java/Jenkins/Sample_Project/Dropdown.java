package Jenkins.Sample_Project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dropdown {
	WebDriver driver;
	@Test
	public void Dropdownhandling() throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
	dropdown.click();
	Select sel = new Select(dropdown);
	List<WebElement> list = sel.getOptions();
	Thread.sleep(2000);

	for(int i=0; i<list.size(); i++) {
		Reporter.log(list.get(i).getText(), true);
		Thread.sleep(2000);
		Robot r = new Robot();
		sel.selectByVisibleText("Option 2");
		
		r.keyPress(KeyEvent.VK_ENTER);
	
	}
	
	}
	
	
	
	}


