package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupandscrolldown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(1000);
		//WebElement tryit = driver.findElement(By.xpath("//img[@src='/images/totzovervitrinedetail.jpg']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*js.executeScript("arguments[0].scrollIntoView(true)", tryit);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)");*/
		
		//js.executeScript("window.scrollBy(0,-2000)");
		//Thread.sleep(1000);
		js.executeScript("window.scrollBy(-50000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(2000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-1000,0)");
		
	}

}
