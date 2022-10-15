package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignement1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension D = new Dimension(500,500);
		driver.manage().window().setSize(D);
		Thread.sleep(2000);
		Point P = new Point(300,300);
		driver.manage().window().setPosition(P);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
