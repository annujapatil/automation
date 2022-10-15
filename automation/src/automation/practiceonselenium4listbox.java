package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceonselenium4listbox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		Thread.sleep(2000);
		d.selectByIndex(12);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		Thread.sleep(2000);
		m.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		Thread.sleep(2000);
	    y.selectByValue("1995");
		
		
	}

}
