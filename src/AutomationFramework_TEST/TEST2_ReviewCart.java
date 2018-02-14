package AutomationFramework_TEST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
// Import Page objects
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BJSS_TEST_POM.Home_Page;
import BJSS_TEST_POM.Login_Page;
import BJSS_TEST_POM.MyAccount_Page;
import BJSS_TEST_POM.MyOrders_Page;
import BJSS_TEST_POM.QuickView;


public class TEST2_ReviewCart {

    private static WebDriver driver = null;
    	
    
	 
	public static void main(String[] args) {

		String s ="";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
    	//Open Site
		driver.get("http://automationpractice.com//");
	    
		// Access Login
    	Home_Page.but_Signin(driver).click();	
    	
    	// Enter Login Details and return Home
    	Login_Page.txt_MyEmail(driver).sendKeys("BJSSTest@Mailinator.com");
    	Login_Page.txt_MyPassWord(driver).sendKeys("BJSSTest");
    	Login_Page.but_loginSubmit(driver).click();
    	Login_Page.img_Homeicon(driver).click();
    	
    	// Navigate to home
    	Home_Page.but_MyAccount(driver).click();
    	//Open Account Details
    	MyAccount_Page.but_MyOrders(driver).click();
    	
    	//cycle through the orders list table
    	WebElement table = 	MyOrders_Page.tbl_OrdersHist(driver);
    	List<WebElement> allrows =  table.findElements(By.tagName("tr"));
    	
    	
    	//Find the row with the correct Order Date
    	for (WebElement row:allrows) {
    		List<WebElement> allcols =  table.findElements(By.tagName("td"));
    		for(WebElement cell:allcols) {
    			System.out.println("cell Text =  " + cell.getText());
    			 s = "not Found";
				//Check for the order with the correct Date, Select it and exit columns loop
    			 if( cell.getText().equals("02/13/2018")) {
    			    System.out.println("debug- Found String Match");
    			    s ="Found";
    			    System.out.println(s);
    			    cell.click();
    			    break;
    			   
    			}
    			 
    		}
    		//if the cell was clicked then end the table rows loop
    		if(s.equals("Found")) {
    			break;
    		}

    	}
		// Expand Order details 
		System.out.println("Looking for Details Button");
		MyOrders_Page.Btn_OrderDetails(driver).click();
		
		//MyOrders_Page.Drp_Products(driver).click();
		
		//Select select = new Select(MyOrders_Page.Drp_Products(driver));
	    //   List<WebElement> Options = select.getOptions();
	    //   for(WebElement option:Options) {
	    //   	if (option.getText().contains("Faded Short Sleeve")){
	    //    		select.selectByValue(option.getText());
	     //   		break;
	        	//}
	        
	    //MyOrders_Page.txt_Message(driver).sendKeys("Auto input Test");
	    //MyOrders_Page.btn_SendMsg(driver).click();
	       //}
	 
		Home_Page.but_SignOut(driver).click();
		  driver.quit();
	        }
	        
    }
    

    	