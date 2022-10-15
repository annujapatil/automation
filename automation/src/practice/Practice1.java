package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		Options op = driver.manage();
		Window w =op.window();
		w.maximize();
		String s =driver.getTitle();
		System.out.println(s);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		Dimension d = new Dimension(200,500);
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,500);
		driver.manage().window().setPosition(p);
		driver.findElement(By.xpath("(//yt-formatted-string[@id='text'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("anuja5559@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("anuja559");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
		
		
	}

}
