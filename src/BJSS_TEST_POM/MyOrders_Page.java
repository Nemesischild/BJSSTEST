package BJSS_TEST_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyOrders_Page {
	
	private static WebElement  element = null;
	
    public static WebElement tbl_OrdersHist(WebDriver driver){
		 
	    element = driver.findElement(By.id("order-list"));
	 
	    return element;
	 
	    }
	
    public static WebElement Btn_OrderDetails(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr[2]/td/div/div[3]/div[2]/a/span"));
	 
	    return element;
	 
	    }	
    public static WebElement Drp_Products(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\'sendOrderMessage\']/p[2]/select"));
	    return element;
	 
	    }	
    
    public static WebElement txt_Message(WebDriver driver){
		 
	    element = driver.findElement(By.cssSelector("#sendOrderMessage > p:nth-child(3) > select"));
	 
	    return element;
	 
	    }	

    public static WebElement btn_SendMsg(WebDriver driver){
		 
	    element = driver.findElement(By.cssSelector("button[name=\"submitMessage\"] > span"));
	 
	    return element;
	 
	    }	

}

//table[@id='order-list']/tbody/tr[2]/td/div/div[3]/div[2]/a/span
