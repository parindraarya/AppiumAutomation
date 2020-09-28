import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomator extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//		driver.findElementByAndroidUIAutomator("attribute(value)")
//		driver.findElementByAndroidUIAutomator("index(4)").click();
		Thread.sleep(5000);
		driver.findElementById("com.google.android.youtube:id/mobile_topbar_avatar").click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Settings\")").click();
		driver.findElementByAndroidUIAutomator("index(11)").click();
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
	}

}
