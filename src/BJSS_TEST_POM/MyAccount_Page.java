package BJSS_TEST_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyAccount_Page {

	private static WebElement  element = null;

    public static WebElement but_MyOrders(WebDriver driver){
		 
	    element = driver.findElement(By.cssSelector("a[title='Orders'] > span"));
	 
	    return element;
	 
	    }
    
 
    


}
