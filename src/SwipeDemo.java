import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TouchAction t = new TouchAction(driver);
		WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		t.tap(tapOptions().withElement(element(view))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='35']");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(3))).moveTo(element(second)).release().perform();

	}

}
