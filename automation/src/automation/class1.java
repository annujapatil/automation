package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); // browser launch
	driver.get("https://www.youtube.com/watch?v=bzSTpdcs-EI"); //insert url
	
	String url = driver.getCurrentUrl(); //return the url of a browser
	System.out.println(url); //output print
	
	System.out.println(driver.getTitle());// return the title of a tab
	//driver.navigate().to("https://www.selenium.dev/downloads"); // insert url and also method chaining
	
	Navigation nv = driver.navigate();
	//nv.back(); // use to move backward on browser
	
	Thread.sleep(5000); // use to delay for 2 second
	//nv.forward(); // use to move forward on browser
	Thread.sleep(5000); // use to delay for 2 second
	nv.refresh(); // use to reload the browser
	
	driver.get("https://www.youtube.com/watch?v=LJsyVBJMfUs"); //insert url
	
	Thread.sleep(5000); // use to delay for 2 sec 
	nv.refresh(); // use to reload the browser
	driver.close();
	driver.quit(); // use to close whole browser
	//driver.close();// use to close current tab on browser
	
}
}
