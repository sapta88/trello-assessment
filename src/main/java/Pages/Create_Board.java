package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Create_Board extends PageUtility
{

	WebDriver driver;
	JavascriptExecutor js;
	@FindBy(xpath = "//div[@class='board-tile mod-add']/p/span")
	WebElement eCreateBoard;
	@FindBy(xpath = "//div[@class='_2ESjMQMgEWKaNy pt-0']//child::form/div/label//child::input")
	WebElement eBoardList1;
	@FindBy(xpath = "//iframe[@id='ssIFrame_google']")
	WebElement eiframe;
	@FindBy(xpath = "//div[@class='_2ESjMQMgEWKaNy pt-0']//child::form//child::button")
	WebElement eCreate;
	public Create_Board(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void createBoardClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eCreateBoard);
		
	}
	public void waitForVisibility()
	{
		waitToVisible(eBoardList1);
		
	}
	
	public void windowMaximum()
	{
		windowMax();
		
	}
	public void boardList1(String value)
	{
		sendKeys(eBoardList1,value);
		
	}
	
	public void createClick()
	{
		jsClick(eCreate);
	}
	public void browserBackClick()
	{
		browserBack();
	}
	
	public void browserScrollDown()
	{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	

}
