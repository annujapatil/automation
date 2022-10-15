package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String s = driver.getCurrentUrl();
		System.out.println(s);
		String t = driver.getTitle();
		System.out.println(t);
		Thread.sleep(3000);
		Navigation nv = driver.navigate();
		nv.refresh();
		Thread.sleep(3000);
		Dimension D = new Dimension(200,500);
		driver.manage().window().setSize(D);
		Thread.sleep(3000);
		Point p = new Point(500,500);
		Options op = driver.manage();
		Window w = op.window();
		w.setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		Options o = driver.manage();
		Window wi=o.window();
		wi.maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/watch?v=QkPxhZO-0hc&list=RDQkPxhZO-0hc&start_radio=1");
		Thread.sleep(9000);
		driver.quit();
		
		
		
		
		
		
	}

}
