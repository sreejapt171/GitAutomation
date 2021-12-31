import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//find the number of links in the page
		int count1=driver.findElements(By.tagName("a")).size();
		System.out.println(count1);
		
		//find the num of links in thr footer
		WebElement ftrdriver=driver.findElement(By.id("gf-BIG"));
		int count2=ftrdriver.findElements(By.tagName("a")).size();
		System.out.println(count2);
		
		//find the num of links in the left most section in footer
		WebElement colmndrv=ftrdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		int count3=colmndrv.findElements(By.tagName("a")).size();
		System.out.println(count3);
		
		//click on all links in left most section in footer [control+enter ]
		for(int i=1;i<count3;i++)
		{ 
			String ctrlenter=Keys.chord(Keys.CONTROL,Keys.ENTER);
			colmndrv.findElements(By.tagName("a")).get(i).sendKeys(ctrlenter);
		}
		
		
		//to get title of all tabs
		Set<String> windows=driver.getWindowHandles();
		Iterator <String> itr1=windows.iterator();
		while(itr1.hasNext())
		{
			driver.switchTo().window(itr1.next());
			System.out.println(driver.getTitle());
		}
		
		
		

	}

}
