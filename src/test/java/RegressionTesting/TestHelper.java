package RegressionTesting;

import org.testng.annotations.Test;

import Pages.Add_Card_List;
import Pages.Create_Board;
import Pages.Login_Page;

import Utilities.ExcelUtility;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestHelper {
	
	WebDriver driver;
	public Properties prop;
	Login_Page objLogin_Page;
	Create_Board objCreate_Board;
	Add_Card_List objAdd_Card_List;
	
 
  @BeforeClass
  public void beforeClass() throws IOException
  {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\New Eclipse\\Trello New\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://trello.com/login");
	  objLogin_Page=new Login_Page(driver);
	  objCreate_Board=new Create_Board(driver);
	  objAdd_Card_List=new Add_Card_List(driver);
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

	}	

  
  


