package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylist1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();
		driver.getWindowHandle();//main window id
		driver.getWindowHandles();//child+main window id
		ArrayList<String> ar = new ArrayList<String>(driver.getWindowHandles());//obj of arraylist
		String id = ar.get(4);//get child id
		driver.switchTo().window(id);//switch to child window
		String w = driver.getCurrentUrl();//to verify which child window is return in o/p
		System.out.println(w);//print o/p
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.findElement(By.xpath("//a[@href='javascript:void(0);'][4]")).click();
		
		
		}

}
