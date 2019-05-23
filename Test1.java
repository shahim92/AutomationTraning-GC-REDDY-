package core.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		//Initiate Google Chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Create Chrome Browser driver
		WebDriver driver = new ChromeDriver(); // lunch the browser with blank url
		
		
		driver.manage().window().maximize();//Maximize the window
	
		//Navigate to gcrshop.com website interface
		driver.get("http://www.gcrit.com/build3/admin/");
		
		//Enter"EmailAddress" //find element use for recognize the specific elements// sendkeys use for performing operation in the elements. 
		driver.findElement(By.name("username")).sendKeys("admin"); 
		
		//Enter password
		driver.findElement(By.name("password")).sendKeys("admin0123");
		
		//Click "login" button
		driver.findElement(By.id("tdb1")).click();
		
		
		
	}

}
