import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase7ParentChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://google.com");
   
    //parent child relationship
    driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Robot Framework");
   																																																																																					
   // driver.quit();
	
	}
    
}