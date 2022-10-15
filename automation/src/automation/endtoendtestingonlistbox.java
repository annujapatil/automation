package automation;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class endtoendtestingonlistbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='dropdown']")).sendKeys("Option 2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("feb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("13");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='state']")).sendKeys("CA");
		Thread.sleep(1000);
		
		WebElement lang = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lang);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		s.getFirstSelectedOption();
		System.out.println(s.getFirstSelectedOption().getText());
		s.isMultiple();
		System.out.println(s.isMultiple());
		s.getOptions();
		System.out.println(s.getOptions().size());
		s.getAllSelectedOptions();
		System.out.println(s.getAllSelectedOptions().size());
		//s.deselectAll();
		s.deselectByValue("java");
		driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Google']")).click();	
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
	}

}
