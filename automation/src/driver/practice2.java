package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.name("email")).sendKeys("annuja farande");
	driver.findElement(By.id("pass")).sendKeys("dhsfshdgf645");
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
	driver.findElement(By.id("email")).sendKeys("abhishek patil");
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys("123456789");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	driver.quit();
}
}
