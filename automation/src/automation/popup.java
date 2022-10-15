package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); // browser Launch
		Driver.manage().window().maximize();//maximize the browser
		Driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		//Driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Alert alt = Driver.switchTo().alert();
		Thread.sleep(2000);
		//alt.getText();
		alt.accept();//apply action on ok button
	   alt.sendKeys("anuja patil");
	   alt.dismiss();//apply action on cancel button
	}

}
