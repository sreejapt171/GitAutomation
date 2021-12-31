import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase4CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://login.salesforce.com");
    
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("SreejaPT");
    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sreejapt");
    driver.findElement(By.xpath("//input[@name='Login']")).click();
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());     																																																																																					
    driver.quit();
	
	}
    
}