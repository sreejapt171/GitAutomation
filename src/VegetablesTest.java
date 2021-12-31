import org.testng.AssertJUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VegetablesTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
  
	    //implicit wait for 2 seconds..applicable to complete project
	   // driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    String[] neededitems= {"Brocolli","Cucumber","Cauliflower"};
	    
	    addItems(driver,neededitems);
	    
	    String cartItemCount=driver.findElement(By.xpath("//div[@class='cart-info']/table/tbody/tr[1]/td[3]")).getText();
        if(cartItemCount.equalsIgnoreCase(Integer.toString(neededitems.length)))
        {
        	System.out.println("Pass...");
        	AssertJUnit.assertTrue(true);
        }
        else
        {
        	System.out.println("Fail...");
        	 AssertJUnit.assertFalse(true);
        }
          
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       // Thread.sleep(2000);
      
        //explicit wait for 4 seconds
        WebDriverWait w=new WebDriverWait(driver,4);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode ")));
       
        driver.findElement(By.cssSelector("input.promoCode ")).sendKeys("CODE123");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
      
        //explicit wait for 5 seconds
        WebDriverWait w5=new WebDriverWait(driver,5);
        w5.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    driver.quit();
	    
	   
	}
	
	
	public static void addItems(WebDriver driver1,String[] neededitems1)
	{
	    List<String> neededitemsList=Arrays.asList(neededitems1);
	    List<WebElement> veggies=driver1.findElements(By.xpath("//h4[@class='product-name']"));
	    int i;
	    int j=0;
	    for(i=0;i<veggies.size();i++)
	    {
	    	String[] veg=veggies.get(i).getText().split("-");
	    	String vegitem=veg[0].trim();
	        System.out.println(vegitem);
	        
	        if(neededitemsList.contains(vegitem))
	        {
	        	j++;
	        	driver1.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	        	if(neededitems1.length==j)
	        		break;
	        }
	        	
	    }
	   
	 //   driver1.findElements(By.xpath("//a[@class='increment']")).get(i).click();
	        
	  
	}

}
