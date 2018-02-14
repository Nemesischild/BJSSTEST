package AutomationFramework_TEST;

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
import BJSS_TEST_POM.QuickView;


public class TEST1_QuickView {



private static WebDriver driver = null;
			 
	public static void main(String[] args) {
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
	
	    
    	// Access item 1 Quick view
    	//Home_Page.img_QuickView1(driver).click();
    	
    	
    	//WebDriverWait wait = new WebDriverWait(driver, 30);
    	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("fancybox-skin")));

    	///Select select = new Select(QuickView.Drp_Size(driver));
       // select.selectByVisibleText("L");    	
    	
    	//QuickView.but_AddCart(driver).click();
    	
    	//QuickView.but_ContShop(driver).click();
    	
    	//Home_Page.img_QuickView2(driver).click();	
    	
    	//QuickView.but_AddCart(driver).click();
    	
    	//QuickView.but_ContShop(driver).click();
    	
    	Home_Page.but_ShopCart(driver).click();
    	
    	Home_Page.but_SignOut(driver).click();


	  
	 			
	 			
	 			
	  driver.quit();
	}



	}



