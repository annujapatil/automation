package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceonselenium6popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='confirmation']")).click();
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	//a.accept();
	//a.dismiss();
	//a.sendKeys("anuja");
	String n = a.getText();
    System.out.println(n);
    driver.quit();
		
	}

}
