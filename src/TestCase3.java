import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://login.salesforce.com");
    
    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("SreejaPT");
    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("sreejapt");
    driver.findElement(By.cssSelector("#login_form > div.w0.pr.ln3.p16.remember > label")).click();		
    driver.findElement(By.cssSelector("#Login")).click();
    System.out.println(driver.findElement(By.id("error")).getText());     																																																																																					
    driver.quit();
	
	}
    
}