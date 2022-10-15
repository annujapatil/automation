package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		driver.getWindowHandles();
		
		ArrayList <String> ar=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	}

}
