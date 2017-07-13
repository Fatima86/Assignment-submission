package Stepprocesses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Click_Icon_steps {
 	
	@When("^he searches for a product icon$")
		public void he_searches_for_a_product_icon() throws Throwable 
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
		    
		    // Cascading JavaScriptExecutor with Webdriver object "obj"
	            JavascriptExecutor js=(JavascriptExecutor)obj;
	     	    WebElement jelement=obj.findElement(By.xpath(".//*[@id='content']/div[2]/div/span[2]/div/div/div/div[2]/a/div[1]"));
	     	
	        // Using WebElement to Scrolling to that located element "Jewellery Icon"
			    js.executeScript("arguments[0].scrollIntoView(true);",jelement);
			    Thread.sleep(3000);

	        // Using WebElement to click located element "Jewellery Icon"
			    jelement.click();
			    
			//  To close the window	
			   obj.close();
	    }
	
	@Then("^the result jewellery page through Icon should be displayed$")
	    public void the_result_jewellery_page_through_Icon_should_be_displayed() throws Throwable
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
          
       // Cascading JavaScriptExecutor with Webdriver object "obj"
            JavascriptExecutor js=(JavascriptExecutor)obj;
   	        WebElement jelement=obj.findElement(By.xpath(".//*[@id='content']/div[2]/div/span[2]/div/div/div/div[2]/a/div[1]"));
   	
       // Using WebElement to Scrolling to that located element "Jewellery Icon"
		    js.executeScript("arguments[0].scrollIntoView(true);",jelement);
		    Thread.sleep(3000);

       // Using WebElement to click located element "Jewellery Icon"
		    jelement.click();
          
       // To get the url of Jewellery page		    
		    String url=obj.getCurrentUrl();
		    System.out.println(url);
          
       // comparing the url
            if(url.contains("https://www.etsy.com/c/jewelry?anchor_listing_id=273831994&ref=hp"))
		    {
		    	System.out.println("Landed to result Jewellery page successfully through Icon");
		    }
		   else
		    {
		    	System.out.println("Landing to result Jewellery pag is failed through Icon");
		    }

      	 // To close window
              obj.close();
	}
}


