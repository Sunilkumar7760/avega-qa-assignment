package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import bases.BaseClass;
import pages.LoginPage;

public class TC_SigninTest extends BaseClass{
	@Test
	public void verifysignin()
	{
		
		WebDriver driver = null;
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("Admin");
		lp.enterPassWord("admin123");
		lp.clickLoginBtn();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

	     WebElement dash = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    		 By.xpath("//h6[text()='Dashboard']")));

	        String text = dash.getText();

	        Assert.assertEquals(text, "Dashboard");
	}

}
