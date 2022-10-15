package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctionalityofflipkartloginpage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://id.freepikcompany.com/v2/log-in?client_id=freepik&lang=en");
		driver.findElement(By.name("email")).sendKeys("Annuja");
		driver.findElement(By.name("password")).sendKeys("145ddhgd");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	}

}
