package Stepprocesses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Dropdown_steps {
	
	@Given("^John is viewing the Etsy landing page$")
	  public void John_is_viewing_the_Etsy_landing_page() throws Throwable
	  {
			
	    // Driver location for Firefox driver
		    System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
		
		// creating firefoxdriver object	
		    WebDriver obj=new FirefoxDriver();
		    obj.get("https://www.etsy.com");
		    Thread.sleep(5000);
		    
		// To maximize the window
    		obj.manage().window().maximize();
	        Thread.sleep(5000);
	        
	    // To close window    
	        obj.close();
      }
		     	
	@When("^he searches for a product from the drop-down menu$")
	  public void he_searches_for_a_product_from_the_drop_down_menu() throws Throwable
	  {
		// Driver location for Firefox driver
		   System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
		   
		// creating firefoxdriver object	
   		   WebDriver obj=new FirefoxDriver();
	       obj.get("https://www.etsy.com");
	       Thread.sleep(5000);
	       
		// To maximize the window
			obj.manage().window().maximize();
			Thread.sleep(5000);
			    
    	// clciking the "Jewellery" link by locating element
			obj.findElement(By.xpath(".//*[@id='catnav-primary-link-1179-link']")).click();
			 
		// Using Action class to click "All Jewellery" element from dropdown list
			Actions a=new Actions(obj);
		    a.sendKeys(Keys.TAB,Keys.ENTER).build().perform();
		    Thread.sleep(5000);
		    
		// To close the window    
		    obj.close();
       }
	
	@Then("^the result jewellery page through dropdown should be displayed$")
	   public void the_result_jewellery_page_through_dropdown_should_be_displayed() throws Throwable 
	   {
		
		// Driver location for Firefox driver
	        System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
	
        // creating firefoxdriver object	
	        WebDriver obj=new FirefoxDriver();
	        obj.get("https://www.etsy.com");
	        Thread.sleep(5000);
	    
        // to Maximize window	
	        obj.manage().window().maximize();
            Thread.sleep(5000);
        
        // clciking the "Jewellery" link by locating element
     		obj.findElement(By.xpath(".//*[@id='catnav-primary-link-1179-link']")).click();
     			 
        // Using Action class to click "All Jewellery" element from dropdown list
     		Actions a=new Actions(obj);
     		    a.sendKeys(Keys.TAB,Keys.ENTER).build().perform();
     		    Thread.sleep(5000);
     		    
        // To get the url of Jewellery page		    
     		    String url=obj.getCurrentUrl();
     		    System.out.println(url);
     		    
        // comparing the url
     		    
     		    if(url.contains("https://www.etsy.com/uk/c/jewelry?ref=catnav-1179"))
     		    {
     		    	System.out.println("Landed to result Jewellery page successfully through dropdown");
     		    }
     		   else
     		    {
     		    	System.out.println("Landing to result Jewellery pag is failed through dropdown");

     		    }
    
		// To close window    
                obj.close();
      }

}




