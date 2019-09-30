package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {

	public AppiumDriver<MobileElement> driver;
	@Test
	public void setup() throws InterruptedException, MalformedURLException {
		System.out.println("Application get open");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Device Configuration
		
				cap.setCapability("deviceName","Pixel 2 Xl API 26");
				cap.setCapability("udid","emulator-5554");
				cap.setCapability("platformName","Android");
				cap.setCapability("platformVersion","8.0.0");
				Thread.sleep(2000);
				// App Information
				cap.setCapability("appPackage","com.inlogistics");
				// App Launch Or App Activity
				cap.setCapability("appActivity","com.inlogistics.MainActivity");
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap); 
				System.out.println("Application get open successfully");

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	}

