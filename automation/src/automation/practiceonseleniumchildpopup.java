package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceonseleniumchildpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		String mainwindow = driver.getWindowHandle();//id of main window
		String id ="";
		String expurl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		Set<String> ss=driver.getWindowHandles();//main + child window id
		for(String s : ss) {
			System.out.println(s);//fetching one by one id from set
			driver.switchTo().window(s);//switching window by id
			String actualurl = driver.getCurrentUrl();//verify the url
			if(expurl.equals(actualurl)) {
				System.out.println("Correct url");
				id=s;
				break;
			}
				else {
					System.out.println("Wrong url");
			}
			
			
		}
		//driver.switchTo().window(id);
		driver.findElement(By.xpath("//a[@href='javascript:void(0);'][4]")).click();
	}
}
