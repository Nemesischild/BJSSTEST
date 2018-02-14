package BJSS_TEST_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {


	private static WebElement  element = null;
	
    public static WebElement but_Signin(WebDriver driver){
		 
		    element = driver.findElement(By.className("login"));
		 
		    return element;
		 
		    }
    
    public static WebElement but_MyAccount(WebDriver driver){
		 
	    element = driver.findElement(By.className("account"));
	 
	    return element;
	 
	    }
    
    public static WebElement but_SignOut(WebDriver driver){
		 
	    element = driver.findElement(By.className("logout"));
	 
	    return element;
	 
	    }
    
    public static WebElement but_ShopCart(WebDriver driver){
		 
	    element = driver.findElement(By.className("shopping_cart"));
	 
	    return element;
	 
	    }
    
    
   public static WebElement img_QuickView1(WebDriver driver) {
	   
	   		element = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/div[1]/a/i"));
	   		
	   				return element;
	   		
   }

   
   public static WebElement img_QuickView2(WebDriver driver) {
	   
  		element = driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]/div/div[1]/div/div[1]/a/i"));
  		
  				return element;
  		
}
   
   public static WebElement txt_SearchFld(WebDriver driver){
		 
	    element = driver.findElement(By.id("searchbox"));
	 
	    return element;
	 
	    }
}



