package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylist2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();
		
		driver.getWindowHandle();
		driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		String s = a.get(3);
		driver.switchTo().window(s);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
