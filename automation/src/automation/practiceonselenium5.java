package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceonselenium5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		WebElement w = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(w);
		s.selectByValue("java");
		s.selectByIndex(1);
		s.selectByVisibleText("C#");
		Thread.sleep(2000);
		s.getFirstSelectedOption();
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s.isMultiple();
		System.out.println(s.isMultiple());
		List <WebElement> l =s.getAllSelectedOptions();// count of selected options
		System.out.println(l.size());
		s.getOptions();
		System.out.println(s.getOptions().size());
		for(int i=0; i<s.getOptions().size(); i++)
		{
			System.out.println(s.getOptions().get(i).getText());
		}
		Thread.sleep(2000);
		s.deselectByIndex(0);
		
		Thread.sleep(2000);
		s.deselectByValue("java");
		
		Thread.sleep(2000);
		s.deselectByVisibleText("C#");
	
		
		
		
	}

}
