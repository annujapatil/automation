package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amezonsite {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement language = driver.findElement(By.xpath("//a[@href='/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(language).perform();
		Thread.sleep(2000);
		WebElement language1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		ac.moveToElement(language1).perform();
		WebElement w=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		ac.click(w).perform();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("annujapatil559@gmail.com");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abhishekpatil");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		WebElement m =driver.findElement(By.xpath("//a[@href='/b/?_encoding=UTF8&node=1375248031&ref_=sv_top_elec_mega_6']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0], ScrollIntoView(true), m");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.xpath("//img[@alt='Samsung Galaxy M32 | Starting at 10499']")).click();
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Proceed to checkout (1 item)']")).click();
		//driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("Annuja Farande");
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("9112795859");
		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("411043");
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[text()='Use this address']")).click();
	}

}
