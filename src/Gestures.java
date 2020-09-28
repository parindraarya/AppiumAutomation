import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import static java.time.Duration.ofSeconds;

public class Gestures extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
//		System.out.println(driver.isDeviceLocked());
//		driver.unlockDevice();
		System.out.println(driver.isDeviceLocked());//LOcked condition
		System.out.println(driver.getContext());
		System.out.println(driver.currentActivity());
		System.out.println(driver.getAutomationName());
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*Thread.sleep(5000);
		driver.findElementById("com.google.android.youtube:id/mobile_topbar_avatar").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement setting = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));
		t.tap(tapOptions().withElement(element(setting))).perform();*/
		
		
		TouchAction t = new TouchAction(driver);
		WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		t.tap(tapOptions().withElement(element(view))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		WebElement peoplename = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		t.longPress(longPressOptions().withElement(element(peoplename)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());;
		
		
		Thread.sleep(10000);
		
//		driver.closeApp();

	}

}
