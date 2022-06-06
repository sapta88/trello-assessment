package RegressionTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_Trello extends TestHelper {


	@Test(priority = 0, description = "Login")
	public void tc_Login() throws Exception {

		
		objLogin_Page.enterEmailid("sapta.narayan@gmail.com");
		objLogin_Page.loginButtonClick();
		objLogin_Page.enterPassword("swastik17");
		objLogin_Page.loginButtonClick1();

	}
	@Test(priority = 1, description = "Create Boards--List A,B")
	public void tc_2CreateBoard() throws InterruptedException 
	{
		
		objCreate_Board.createBoardClick();
		objCreate_Board.windowMaximum();
		objCreate_Board.waitForVisibility();
		objCreate_Board.boardList1("List A");
		objCreate_Board.createClick();
		objAdd_Card_List.waitForVisibility();
		objAdd_Card_List.enterListTitle("Title A");
		objAdd_Card_List.addListClick();
		objAdd_Card_List.waitForVisibilityCard();
		objAdd_Card_List.addCardClick();
		Thread.sleep(3000);
		objAdd_Card_List.enterCardName("Card A");
		objAdd_Card_List.addCardNameClick();
		objCreate_Board.browserBackClick();
		objCreate_Board.createBoardClick();
		objCreate_Board.waitForVisibility();
		objCreate_Board.boardList1("List B");
		Thread.sleep(3000);
		objCreate_Board.createClick();
		objCreate_Board.browserBackClick();
		
	}
	
	@Test(priority = 2, description = "Add a card in list A and move it to list B")
	public void tc_3MoveCard () throws Exception 
	{
		objCreate_Board.createBoardClick();
		objCreate_Board.windowMaximum();
		objCreate_Board.waitForVisibility();
		objCreate_Board.boardList1("List A");
		objCreate_Board.createClick();
		objAdd_Card_List.waitForVisibility();
		objAdd_Card_List.enterListTitle("Title A");
		objAdd_Card_List.addListClick();
		objAdd_Card_List.waitForVisibilityCard();
		objAdd_Card_List.addCardClick();
		Thread.sleep(3000);
		objAdd_Card_List.enterCardName("Card A");
		objAdd_Card_List.addCardNameClick();
		objAdd_Card_List.threeDots();
		objAdd_Card_List.moveList();
		objAdd_Card_List.relatedTo("List B");
		objAdd_Card_List.moveClick();
		objAdd_Card_List.logoClick();
		objAdd_Card_List.logoutClick();
		
	}


	
}
