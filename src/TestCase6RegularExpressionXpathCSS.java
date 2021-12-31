import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase6RegularExpressionXpathCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://login.salesforce.com");
    
    //xpath regular exprs: //tagname[contains(@attribute,'value')] 
    driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("SreejaPT");
    
    //css locator Regular expression:  tagname[attribute*='value'               ]]
    driver.findElement(By.cssSelector("input[id*='pass')]")).sendKeys("sreejapt");
    driver.findElement(By.cssSelector("#rememberUn")).click();
    driver.findElement(By.cssSelector("input#Login")).click();
   // Thread.sleep(1000);
   // driver.findElement(By.cssSelector("[id='forgot_password_link']")).click(); 
   // Thread.sleep(1000);
  //  System.out.println(driver.findElement(By.cssSelector(("h2.mb12"))).getText());
    driver.close();
    // driver.quit();
	
	}
    
}