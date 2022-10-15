import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		//WebElement selectlang = driver.findElement(By.xpath("//a[@href='/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang']"));
		Actions ac= new Actions(driver);
		//ac.moveToElement(selectlang).perform();
		//ac.click().perform();
		//ac.contextClick().perform();
		//ac.doubleClick().perform();
		//ac.dragAndDrop(src, dest);
		//ac.clickAndHold().perform();*/
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement S = driver.findElement(By.name("(//a[@class='button button-orange'])[2]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Thread.sleep(2000);
		//ac.clickAndHold().perform();
		//ac.release().perform();
		ac.dragAndDrop(S, d).perform();
		
		
		
	}

}
