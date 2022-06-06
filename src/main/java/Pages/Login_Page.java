package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Login_Page extends PageUtility
{
	
	WebDriver driver;
	@FindBy(xpath = "//input[@id='user']")
	WebElement eEmailId;
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement ePassword;
	@FindBy(xpath = "//input[@id=\"login\"]")
	WebElement eLogin;
	@FindBy(xpath = "//button[@id=\"login-submit\"]")
	WebElement eLoginew;
	
		public Login_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterEmailid(String mailid)
	{
		sendKeys(eEmailId,mailid);
	}
	
	public void enterPassword(String password)
	{
		sendKeys(ePassword,password);
	}
	public void loginButtonClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eLogin);
		
	}
	public void loginButtonClick1() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eLoginew);
		
	}
	

	
}
