package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceonselenium2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String s = driver.getCurrentUrl();
		System.out.println(s);
		String a= driver.getTitle();
		System.out.println(a);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		String b = driver.getCurrentUrl();
		System.out.println(b);
		Thread.sleep(2000);
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(100,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
