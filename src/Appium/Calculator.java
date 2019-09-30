package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;
	@Test
	public void setUp() throws InterruptedException, MalformedURLException
	    {
DesiredCapabilities cap= new DesiredCapabilities();
	     cap.setCapability("deviceName","Pixel 2 API 26");
	     cap.setCapability("udid","emulator-5554");
	     cap.setCapability("platformName","Android");
	     cap.setCapability("platformVersion", "8.0");
	     cap.setCapability("appPackage","com.android.calculator2");
	         cap.setCapability("appActivity","com.android.calculator2.Calculator");
	   	 Thread.sleep(4000);
	   	 driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	   	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	 System.out.println(" Application lunched sucessfully");
	   	 Thread.sleep(3000);
	   	 //------Application automated sucessfully with Addition
	   	 driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
	 	 Thread.sleep(1000);
	 	 driver.findElement(By.xpath("//android.widget.Button[@text='8']")).click();
	 	 driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
	 	 driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
	 	Thread.sleep(1000);
	 	driver.findElement(By.xpath("//android.widget.Button[@text='9']")).click();
	   	 Thread.sleep(1000);
	   	driver.findElement(By.xpath("//android.widget.Button[@text='6']")).click();
	   	 driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
	   	System.out.println("Application automated sucessfully with Addition");
	   	Thread.sleep(2000);
	    //------Application automated sucessfully with multiplication
	   	 driver.findElement(By.xpath("//android.widget.Button[@text='9']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@text='×']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='8']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
	    Thread.sleep(1000);
	    System.out.println("Application automated sucessfully with multiplication");
	    Thread.sleep(1000);
	    //-------------Application automated sucessfully with division
	    driver.findElement(By.xpath("//android.widget.Button[@text='9']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='8']")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@text='÷']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
	    Thread.sleep(1000);
	    System.out.println("Application automated sucessfully with division");
	    
}
	
}
