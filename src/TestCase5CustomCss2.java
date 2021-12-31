import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase5CustomCss2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://login.salesforce.com");
    
    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("SreejaPT");
    driver.findElement(By.cssSelector("[id='password']")).sendKeys("sreejapt");
    driver.findElement(By.cssSelector("#rememberUn")).click();
    driver.findElement(By.cssSelector("input#Login")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("[id='forgot_password_link']")).click(); 
    Thread.sleep(1000);
    
    //tagname.classname --css locater
    System.out.println(driver.findElement(By.cssSelector(("h2.mb12"))).getText());
    driver.close();
    // driver.quit();
	
	}
    
}