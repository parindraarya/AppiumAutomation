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

public class DragDrop extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TouchAction t = new TouchAction(driver);
		WebElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		t.tap(tapOptions().withElement(element(view))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		
//		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
		

	}

}
