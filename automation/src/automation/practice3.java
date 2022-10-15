package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select d= new Select(day);
		Select m= new Select(month);
		Select y= new Select(year);
		Thread.sleep(2000);
		d.selectByIndex(12);//1
		Thread.sleep(1000);
		m.selectByValue("2");//5
		Thread.sleep(1000);
		y.selectByVisibleText("1995");//13
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
