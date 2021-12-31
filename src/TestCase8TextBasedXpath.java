import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8TextBasedXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		// relative xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sreejapt");

		
		
		// absolute xpath
		//driver.findElement(By.xpath("")).sendKeys("sreejapt     ");
		
		//text based xpath
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		driver.quit();

	}

}