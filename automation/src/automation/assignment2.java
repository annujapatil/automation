package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    /*Options op = Driver.manage();
	    Window w = op.window();
	    w.minimize();*/
	    Driver.get("https://www.youtube.com/watch?v=QkPxhZO-0hc&list=RDQkPxhZO-0hc&start_radio=1");
	    String s = Driver.getCurrentUrl();
	    System.out.println(s);
	    String t = Driver.getTitle();
	    System.out.println(t);
	    Driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    Driver.navigate().to("https://www.google.com/");
	    Thread.sleep(2000);
	    Dimension D =new Dimension(200,400);
	    Driver.manage().window().setSize(D);
	    Thread.sleep(2000);
	    Point p=new Point(100,500);
	    Driver.manage().window().setPosition(p);
	    Driver.manage().window().maximize();
	    Thread.sleep(2000);
	    Driver.navigate().to("https://www.facebook.com/");
	    Driver.navigate().refresh();
	    Thread.sleep(2000);
	    Driver.quit();
	    
	    
	}

}
