import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windownHandlersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();
		int cnt=windows.size();
		System.out.println(cnt);
 		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
	    String mesg=driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]")).getText().split("at")[1].trim().split(" ")[0];
	    driver.switchTo().window(parentid);
	 //   driver.findElement(By.id("username")).sendKeys(mesg);
        driver.quit();	    
	}

}
