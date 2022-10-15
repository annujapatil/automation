package practice;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectedlistbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.cybertekschool.com/dropdown");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(	driver.getCurrentUrl());
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		WebElement lang = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lang);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByVisibleText("C#");
		s.getFirstSelectedOption();
		System.out.println(s.getFirstSelectedOption().getText());
		s.getAllSelectedOptions();
		System.out.println(s.getAllSelectedOptions().size());
		//s.getOptions();
		//System.out.println(s.getOptions().size());
		s.isMultiple();
		System.out.println(s.isMultiple());
		List abc = (List) s.getOptions();
		System.out.println(abc);
		//s.deselectAll();
		//s.deselectByIndex(1);
		//s.deselectByValue("java");
		//s.deselectByVisibleText("C#");
		
		
		
	}
}
