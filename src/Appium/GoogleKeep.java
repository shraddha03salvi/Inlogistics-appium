package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class GoogleKeep {
	WebDriver driver;
	@Test
	public void launch() throws InterruptedException, MalformedURLException {
		 DesiredCapabilities cap= new DesiredCapabilities();
	     cap.setCapability("deviceName","Pixel 2 API 26");
	     cap.setCapability("udid","emulator-5554");
	     cap.setCapability("platformName","Android");
	     cap.setCapability("platformVersion", "8.0");
	     cap.setCapability("appPackage","com.google.android.keep");
	    cap.setCapability("appActivity","com.google.android.apps.keep.ui.activities.BrowseActivity");
	    cap.setCapability("appWaitActivity","com.google.android.apps.keep.ui.activities.BrowseActivity");
	   	 Thread.sleep(4000);
	 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	 System.out.println("Google keep launched sucessfully");
	   	Thread.sleep(3000);
	   	driver.findElement(By.xpath("//android.widget.Button[@text='Take a note…']")).click();
	   	Thread.sleep(2000);
	   	System.out.println("Click on the note");
	   	//For Title
	   	//driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
	   	//Thread.sleep(2000);
		//driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).sendKeys("QA Testing");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Note']")).sendKeys("QA Testing Team Reminder");
	   	Thread.sleep(2000);
	   System.out.println("Write a note");
	   	driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	   	Thread.sleep(1000);
	   	//====Add Note With Checkbox====
	   	System.out.println("Add Checkbox into note");
	   	driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
	   	Thread.sleep(2000);
	   	driver.findElement(By.xpath("//android.widget.EditText[@index='2']")).sendKeys("Appium");
	   	Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//android.widget.TextView[@text='List item']")).sendKeys("PostMan");
	   	Thread.sleep(3000);
	   	driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	   	Thread.sleep(2000);
	   	driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
	   	Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Delete']")).click();
//		Thread.sleep(2000);
	   	driver.findElement(By.xpath("//android.widget.TextView[@text='QA Testing Team Reminder']")).click();
	   	Thread.sleep(2000);
	   	driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
	   	Thread.sleep(6000);
	
		//driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'color_picker_swatch')]")).click();
	   	//Thread.sleep(6000);
	   
	   	driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	   	Thread.sleep(6000);
	   	//=====Click On Menu
	   	System.out.println("Click on menu");
		driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	   	Thread.sleep(3000);
	   	//======Clicking On Reminder
	   	System.out.println("Click on Reminder Module");
	   	driver.findElement(By.xpath("//android.widget.TextView[@text='Reminders']")).click();
	   	Thread.sleep(3000);
	   	
	
}}
