import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		String locator = "com.google.android.youtube:id/mobile_topbar_avatar";
//		driver.findElementById(locator).click();
		
		driver.findElementByXPath("(//android.widget.ImageView)[3]").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Search YouTube']").sendKeys("Martin Garrix");
		driver.findElementByXPath("//android.widget.TextView[@text='martin garrix']").click();
		driver.findElementByXPath("//android.view.ViewGroup[@index='2']").click();

	}

}
