import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTestWithFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
			
		//switch to iframe with webelements
		WebElement iframe1=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(iframe1);
				
		//switch to ifame with index
	   // int cnt=driver.findElements(By.tagName("ifrmae")).size();
	   // System.out.println(cnt);
		//driver.switchTo().frame((cnt));
		
		
		
		Actions act=new Actions(driver);
		
		
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
		act.build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//li[@class='active']/a")).click();
        driver.quit();
}
}