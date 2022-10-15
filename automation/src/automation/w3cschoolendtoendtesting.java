package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class w3cschoolendtoendtesting {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebElement w =driver.findElement(By.xpath("//h1[text()='SQL']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2700)");
		driver.findElement(By.xpath("(//a[@class='w3-button w3-block tut-button'])[4]")).click();
		
		js.executeScript("window.scrollBy(0,1700)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='w3-blue w3-button w3-round']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//a[@href='/quiztest/quiztest.asp?qtest=SQL']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label2']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label4']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label2']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label2']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label4']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label2']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label4']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label2']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label1']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		driver.findElement(By.xpath("//label[@id='label3']")).click();
		driver.findElement(By.xpath("//button[text()='Next ❯']")).click();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\screenshot\\sqlquizemarks.jpg");
		FileHandler.copy(source, dest);
		}

}
