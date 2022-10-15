package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=pgc3J2hBBEU&list=RDQkPxhZO-0hc&index=15");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		Dimension d=new Dimension(500, 1000);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(200,500);
		driver.manage().window().setPosition(p);
		driver.quit();
		
		
		
		
	}

}
