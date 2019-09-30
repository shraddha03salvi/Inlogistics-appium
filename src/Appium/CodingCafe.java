package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CodingCafe {
	private static AppiumDriver<MobileElement> driver;
    
    @Test
    public void setUpofapp() throws InterruptedException 
    {
    	DesiredCapabilities cap= new DesiredCapabilities();
	     cap.setCapability("deviceName","Pixel 2 API 26");
	     cap.setCapability("udid","emulator-5554");
	     cap.setCapability("platformName","Android");
	     cap.setCapability("platformVersion","8.0");
         cap.setCapability("browserName","chrome");

        try 
        {
        	driver =new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
            driver.navigate().to("http://codingcafe-stg.bridgelabz.com");
            Thread.sleep(3000);
            //System.out.println("started");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println("Application get lunched");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
	 	 Thread.sleep(1000);
    }
}
