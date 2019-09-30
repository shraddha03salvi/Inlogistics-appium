package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TC_001 {

	 @Test
	public void TestCase() throws MalformedURLException  
	 {  //If apk file is not installed on virtual device then write following line
		//File f = new File("E:/Users/Bridgelabz/Downloads/TheTestingWorld.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Google Nexus 5X");
		cap.setCapability("platformName","android");
		//cap.setCapability("app",f);
		cap.setCapability("appPackage","com.example.work.thetestingworld");
		cap.setCapability("appActivity","com.example.work.thetestingworld.Splash");
		//URL url = new URL("http://0.0.0.0:4723/wd/hub")
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	}
}
