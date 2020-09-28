import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDown extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TouchAction t = new TouchAction(driver);
		WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		t.tap(tapOptions().withElement(element(view))).perform();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
		
	}

}
