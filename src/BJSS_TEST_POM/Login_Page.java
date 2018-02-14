package BJSS_TEST_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	private static WebElement  element = null;
	public static WebElement txt_MyEmail(WebDriver driver){
		 
		    element = driver.findElement(By.id("email"));
		 
		    return element;
		 
		    }
	
	public static WebElement txt_MyPassWord(WebDriver driver){
		 
	    element = driver.findElement(By.id("passwd"));
	 
	    return element;
	 
	    }
	
	public static WebElement but_loginSubmit(WebDriver driver){
		 
	    element = driver.findElement(By.id("SubmitLogin"));
	 
	    return element;
	 
	    }
	
	public static WebElement img_Homeicon(WebDriver driver){
		 
	    element = driver.findElement(By.id("header_logo"));
	 
	    return element;
	 
	    }


}


