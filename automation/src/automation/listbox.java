package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		WebElement lan = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lan);
		Thread.sleep(2000);
		s.selectByValue("java");
		s.selectByValue("js");
		s.selectByValue("c#");
		Thread.sleep(2000);
		s.getFirstSelectedOption();//get value of first selected web element
		System.out.println(s.getFirstSelectedOption());//print
		System.out.println(s.getFirstSelectedOption().getText());//for text value
		System.out.println(s.isMultiple());//verify the list box true or false
		List <WebElement> mau = s.getAllSelectedOptions();//get count of all selected web elements
		System.out.println(mau.size());
		List <WebElement> abc = s.getOptions();//get count of all web elements present in listbox
		System.out.println(abc.size());
		for(int i = 0;i<abc.size();i++)
		{
			System.out.println(abc.get(i).getText());
		}
		    s.deselectByValue("java");
			s.deselectByValue("js");
			s.deselectByValue("c#");
				//s.deselectAll();
	}

}
