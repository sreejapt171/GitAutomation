import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/");
		Thread.sleep(5000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[text()='one way']")).click();

		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[text()='International']")).click();
		driver.findElement(By.xpath("//div[text()='India']")).click();

		driver.findElement(By.xpath("//div[text()='MAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='BLR']")).click();

		driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		// driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-16ru68a
		// r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']")).click();
		// driver.findElement(By.xpath("//div[contains(@class,'16ru68a')]")).click();
		String opct = driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style");
		System.out.println(opct);
		if (opct.contains("0.5")) {
			System.out.print("Disabled...");
			AssertJUnit.assertTrue(true);

		} else
			AssertJUnit.assertFalse(true);
		driver.findElement(By.xpath("//div[text()='Return Date']")).click();
		driver.findElement(By.xpath("//div[text()='Return Date']")).click();
		String opct1 = driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style");
		System.out.println(opct1);
		if (opct1.contains("0.5")) {
			System.out.print("test failed...Disabled...");
			AssertJUnit.assertTrue(false);

		} else
			AssertJUnit.assertFalse(false);

		driver.findElement(By.xpath("//*[contains(@class,'jwli3a')]")).click();
		System.out.println("From date...");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		WebElement adult = driver.findElement(
				By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6'])[1]//div[2]//div[3]"));
		for (int i = 1; i < 3; i++) {

			adult.click();
		}
		Thread.sleep(2000);
		// WebElement adultMsg=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n
		// r-18u37iz r-1wtj0ep r-1x0uki6'])[1]//div[2]//div[2]"));
		WebElement btn = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
		Thread.sleep(1000);
		btn.click();
		// System.out.println("Msg
		// :"+driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());

		driver.findElement(By.xpath("//*[text()='Currency']")).click();

		driver.findElement(By.xpath("//div[text()='AED']")).click();
		Thread.sleep(1000);
		/*
		 * WebElement
		 * chbox=driver.findElement(By.xpath("//div[contains(text(),'Health')]"));
		 * 
		 * Actions actions=new Actions(driver);
		 * actions.moveByOffset(0,10).click().build().perform(); Thread.sleep(1000);
		 */
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[7]/div/div/div[2]/div")).click();
		
	//	driver.findElement(By.xpath("//div[text()='one way']")).click();

		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]")).getText());
		//driver.quit();
	}

}
