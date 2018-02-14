package AutomationFramework_TEST;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TakesScreenshot;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


//Import Page objects
import BJSS_TEST_POM.Home_Page;
import BJSS_TEST_POM.Login_Page;
import BJSS_TEST_POM.MyAccount_Page;
import BJSS_TEST_POM.QuickView;

public class TEST3_Screenshots {

	
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
    	
    	// Navigate to home
    	Home_Page.but_MyAccount(driver).click();
    	//Open Account Details
    	MyAccount_Page.but_MyOrders(driver).click();
    	
    	
   		try{
   			
   			Assert.assertTrue(Home_Page.txt_SearchFld(driver).isSelected());
   		
   		}catch(AssertionError e) {
   			  			
   			File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   			Random rand = new Random();
   			try {
				FileUtils.copyFile(scrfile, new File ("C:\\Selenium\\BJSSTEST"+ rand +".png"));
			} catch (IOException e1) {
				//e1.printStackTrace();
			}
   			
   		}
   		
   		Home_Page.but_SignOut(driver).click();
   	    driver.quit();
    
		}
	
   
}
