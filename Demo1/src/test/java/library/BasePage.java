package library;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
	}
	
	public void verifyTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			String aTitle = driver.getTitle();
			
			Reporter.log("Title Displayed", true);
			Reporter.log("The Title is Displayed" +aTitle, true);
			
		} catch (TimeoutException e) {
			Reporter.log("Title not Displayed", true);
			String aTitle = driver.getTitle();
			Reporter.log("The Title is Displayed" +aTitle, true);
		}
	}
	public void verifyElement(WebElement element) {
		try {
			
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present", true);
		} catch (Exception e) {
			Reporter.log("Element not found", true);
		}
	}


}
