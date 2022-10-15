package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //browser launch
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.facebook.com/"); //insert url
		Thread.sleep(2000);
		//driver.findElement(By.id("email")).sendKeys("annuja farande");
		//driver.findElement(By.name("pass")).sendKeys("rutuj farande");
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("annuja patil");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abhi");
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	}

	
}
