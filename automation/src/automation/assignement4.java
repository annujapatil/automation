package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignement4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//browser launch
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.facebook.com/");//insert url
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Velocity Class");
		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.className("Create New Account"));
		
		//driver.findElement(By.tagName("input")).sendKeys("Annuja");
		//driver.findElement(By.id("lastName")).sendKeys("Farande");
		//driver.findElement(By.name("Username")).sendKeys("annuja555559");
		//driver.findElement(By.name("Password")).sendKeys("shdfdhfgdhf");
		//driver.findElement(By.tagName("span")).click();
		
		
	}
}
