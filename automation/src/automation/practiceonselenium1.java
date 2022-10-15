package automation;

import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceonselenium1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser open
		driver.get("https://www.google.com/");// insert url
		String s= driver.getCurrentUrl();//verify the webpage is right or wrong
		System.out.println(s);
		String a = driver.getTitle();//verify the title of webpage
		System.out.println(a);
		Thread.sleep(2000); // wait for 2 sec
		driver.manage().window().maximize();// maximize the browser
		Thread.sleep(2000);
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);// set the size of an browser
		Thread.sleep(2000);
		Point p = new Point(400,400);
		driver.manage().window().setPosition(p);//set the position of an browser
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		
		
		
	}

}
