package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePO;
import pom.SearchPO;

public class Test3 extends BaseTest{
	@Test
	public void testFacebookHome() {
	
		try {
		driver.get("https://www.google.com/");
		GooglePO googlePO=new GooglePO(driver);
		googlePO.searchTxtBx().sendKeys("twitter"+Keys.ENTER);
		SearchPO searchPO=new SearchPO(driver);
		searchPO.verifyElement(searchPO.TwitterLink());
		searchPO.TwitterLink().click();
		System.out.println(driver.getTitle());
		String eTitle = "Login on Twitter";
		wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle = driver.getTitle();
		Reporter.log("Title is displayed"+aTitle, true);
		//searchPO.verifyTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	}
		catch(Exception e) {
			Assert.fail();
		}

}

}
