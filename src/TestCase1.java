import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://facebook.com");
    driver.manage().window().maximize();
    driver.findElement(By.id("email")).sendKeys("SreejPT");
    driver.findElement(By.name("pass")).sendKeys("sreejapt");
    
	driver.findElement(By.linkText("Forgot your password?")).click();
   																																																																																																																								
   // driver.quit();
	
	}
    
}