package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Dimension d = new Dimension(200,400);
	driver.manage().window().setSize(d);
	Point p=new Point(500,500);
	Thread.sleep(2000);
	driver.manage().window().setPosition(p);
	driver.close();
	}
	}