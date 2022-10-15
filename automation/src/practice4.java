import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    WebElement lang = driver.findElement(By.name("Languages"));
	    Select s = new Select(lang);
	    Thread.sleep(3000);
	    s.selectByValue("java");
	    Thread.sleep(3000);
	    s.selectByValue("js");
	    Thread.sleep(3000);
	    s.selectByVisibleText("C#");
	    Thread.sleep(3000);
	    s.getFirstSelectedOption();
	    System.out.println(s.getFirstSelectedOption().getText()); 
	    s.isMultiple();
	    List<WebElement> selected = s.getAllSelectedOptions();
	    System.out.println( selected.size());
	    List<WebElement> op =s.getOptions();
	    System.out.println(op.size());
	    for(int i=0;i<op.size();i++) {
	    	System.out.println(op.get(i).getText());
	    }
	    for(int i=0;i<selected.size();i++) {
	    	System.out.println(selected.get(i).getText());
	    	
	    	s.deselectAll();
	    	
	    }
	    
	}

}
