package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GamilSignIn {

	WebDriver driver;
	@Test
	public void SignUp() throws MalformedURLException, InterruptedException {
		 DesiredCapabilities cap= new DesiredCapabilities();
	     cap.setCapability("deviceName","Pixel 2 API 26");
	     cap.setCapability("udid","emulator-5554");
	     cap.setCapability("platformName","Android");
	     cap.setCapability("platformVersion", "8.0");
	     cap.setCapability("browserName","chrome");
	     driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	     driver.navigate().to("https://accounts.google.com/signin");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	 System.out.println("Gmail SignIn page get Open Successfully");
	   	 Thread.sleep(3000);
	   	driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
	 	 Thread.sleep(3000);
	 	driver.findElement(By.xpath("//android.view.View[@index='2']")).sendKeys("shraddha12salvi@gmail.com");
	 	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
	 	 Thread.sleep(3000);
	}
}
