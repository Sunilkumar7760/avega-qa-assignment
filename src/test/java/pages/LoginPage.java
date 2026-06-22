package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement LoginBtn;
	
	public void enterUserName(String uname)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(uname);
	}
	public void enterPassWord(String Pwd)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		//wait.until(ExpectedConditions.visibilityOf(password));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys(Pwd);
	}
	
	public void clickLoginBtn()
	{
		LoginBtn.click();
	}
	

}
