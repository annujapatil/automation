package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmenat7 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // browser launch
		driver.manage().window().maximize();// browser window maximize
		driver.get("http://practice.cybertekschool.com/dropdown");
		// driver.findElement(By.xpath("//input[@ type = 'text']")).sendKeys("Alok");
		// driver.findElement(By.name("pass")).sendKeys("patil");
//driver.findElement(By.linkText("Create New Account")).click();
		WebElement lan = driver.findElement(By.xpath("//select[@name='Languages']"));
		Select s = new Select(lan);// obj creation of select class
		Thread.sleep(3000);
		s.selectByValue("java");
		s.selectByValue("js");
		s.selectByValue("c#");
		WebElement firstselected = s.getFirstSelectedOption();// return first selected options
		System.out.println(firstselected);// return first web element
		System.out.println(firstselected.getText());// return text of webelement
//system.out.println(s.getFirstSelectedOption().getText());//return text of web element
		System.out.println(s.isMultiple());//true verify the listbox is multiselected or not
		List<WebElement> l2 = s.getAllSelectedOptions();//return all selected options only
		List<WebElement> l = s.getOptions();//return all options are listbox
		System.out.println(l.size());//count of options present in a listbox
		System.out.println(l2.size());//count of selected output
		for(int i=0;i<l.size(); i++)
		{
			
			System.out.println(l.get(i).getText());//print text of all options
		}
		s.deselectByValue("java");//deselect selected options
		s.deselectByIndex(1);//deselect selected options
		s.selectByValue("c#");//deselect selected options
		s.deselectAll();//deselect all selected options
		}
}