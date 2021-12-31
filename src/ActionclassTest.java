import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		WebElement msmv=driver.findElement(By.cssSelector("span[class='nav-line-2 '] span"));
		WebElement srch=driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions a=new Actions(driver);
		
		//type hello in search field with press of shift key  and select the input with double click
		a.moveToElement(srch).click().keyDown(Keys.SHIFT).sendKeys("hellooooo").doubleClick().build().perform();
		
		
		//move mouse oven an element elm
		a.moveToElement(msmv).build().perform();
		
		a.contextClick().build().perform();

}
}
