package Appium;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Google_Genymotion {
	
	WebDriver driver;
	@BeforeClass
	public void bclass() throws Exception 
	
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Google Nexus 5X");
		cap.setCapability("udid","192.168.137.101:5555");
		 cap.setCapability("platformName","Android");
		 cap.setCapability("browserName","chrome");
		 driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	}
	@Test
	public void testcase() throws Exception {
		  driver.navigate().to("http://fundoopush-dev.bridgelabz.com/login");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  System.out.println("Application get open successfully");
		  driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("suhas.mhatre@bridgelabz.com");
		  System.out.println("Enter Email id");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("suhas");
		  System.out.println("Enter password");
		  
		  driver.findElement(By.xpath("//button[@class='login-button mat-button']")).sendKeys(Keys.ENTER); 
		  //driver.findElement(By.xpath("//button[@class='login-button mat-button']")).sendKeys(Keys.RETURN); 
		   System.out.println("Application get Logged in");
		   Thread.sleep(17000);
		   //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
				 
	}
	
	

	

}
