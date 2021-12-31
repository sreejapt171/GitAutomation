import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C://Users//bachan//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://google.com");
    String txt1=driver.getTitle();
    System.out.println("Title is :"+txt1);
    System.out.println(driver.getCurrentUrl());
    
    driver.get("http://yahoo.com");
    driver.navigate().back();;
    driver.navigate().forward(); 
    driver.close();
    driver.quit();
   
	}

}
