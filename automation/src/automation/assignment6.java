package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //browser launch
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.amazon.in/"); //insert url
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("annuja farande");
		driver.findElement(By.linkText("Create your Amazon account")).click();
		
		
	}

}
