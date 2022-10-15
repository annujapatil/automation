package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(100,500);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
	}

}
