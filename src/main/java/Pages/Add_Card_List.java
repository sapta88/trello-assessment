package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_Card_List extends PageUtility
{

	WebDriver driver;
	JavascriptExecutor js;
	@FindBy(xpath = "//form//child::input[@class='list-name-input']")
	WebElement eListTitle;
	@FindBy(xpath = "//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
	WebElement eAddList;
	@FindBy(xpath = "//span[@class='js-add-a-card']")
	WebElement eAddCard;
	@FindBy(xpath = "//div[@class='card-composer']//child::textarea")
	WebElement eCardName;
	@FindBy(xpath = "//div[@class='cc-controls-section']/input")
	WebElement eAddCardNameClick;
	@FindBy(xpath = "(//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li/a")
	WebElement eSelectCard;
	@FindBy(xpath = "//div[@class=\"list-header-extras\"]//child::a")
	WebElement eThreeDots;
	@FindBy(xpath = "//ul[@class=\"pop-over-list\"][1]/li[3]/a")
	WebElement eMoveToList;
	@FindBy(xpath = "//select[@class='js-select-board']/optgroup/option")
	WebElement eSelect;
	@FindBy(xpath = "//input[@value='Move']")
	WebElement eMove;
	@FindBy(xpath = "//div[@class='_2LKdO6O3n25FhC']//child::span[1]")
	WebElement eLogo;
	@FindBy(xpath = "//button//child::span[text()='Log out']")
	WebElement eLogout;
	public Add_Card_List(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterListTitle(String title)
	{
		sendKeys(eListTitle,title);
	}
	public void waitForVisibility()
	{
		waitToVisible(eListTitle);
		
	}
	public void addListClick() throws InterruptedException
	{
	
		jsClick(eAddList);
		
	}
	public void addCardClick()
	{
		jsClick(eAddCard);
	}
	public void waitForVisibilityCard()
	{
		waitToVisible(eAddCard);
		
	}
	public void enterCardName(String title)
	{
		sendKeys(eCardName,title);
	}
	public void addCardNameClick()
	{
		jsClick(eAddCardNameClick);
	}
	public void scrollDown()
	{
		scrollDown(eSelectCard);
	}
	public void selectCardName()
	{
		jsClick(eSelectCard);
	}
	public void threeDots()
	{
		jsClick(eThreeDots);
	}
	public void moveList()
	{
		jsClick(eMoveToList);
	}
	public void relatedTo(String value) {
		selectByVisisbleText(eSelect,value);

	}
	public void moveClick()
	{
		jsClick(eMove);
	}
	public void logoClick()
	{
		jsClick(eLogo);
	}
	
	public void logoutClick()
	{
		jsClick(eLogout);
	}
}
