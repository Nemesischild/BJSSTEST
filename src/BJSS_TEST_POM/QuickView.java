package BJSS_TEST_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuickView {
	

	private static WebElement  element = null;
	
    public static WebElement but_AddCart(WebDriver driver){
		 
		    element = driver.findElement(By.name("submit"));
		 
		    return element;
		 
		    }
    
    public static WebElement Drp_Size(WebDriver driver){
		 
	    element = driver.findElement(By.id("group_1"));
	 
	    return element;
	 
	    }
    
    public static WebElement but_ContShop(WebDriver driver){
		 
	    element = driver.findElement(By.id("Continue Shopping"));
	 
	    return element;
	 
	    }
}
