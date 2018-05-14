package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\drivers\\new\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }

}
