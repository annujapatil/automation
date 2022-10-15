package practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=R80mbL066g0");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p);
		Dimension d= new Dimension(500,200);
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.voot.com/");
		driver.quit();
		
	}

}
