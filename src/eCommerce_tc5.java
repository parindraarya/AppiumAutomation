import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eCommerce_tc5 extends eCommerce{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Test");
		driver.hideKeyboard();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.xpath("//*[@text='Afghanistan']")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		
		driver.findElementByXPath("//*[@text='Argentina']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(2000);
		
		TouchAction t = new TouchAction(driver);
		WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		
		driver.findElementByXPath("//*[@text='Visit to the website to complete purchase']").click();
		Thread.sleep(4000);
		Set<String> context = driver.getContextHandles();
		for(String contextname : context)
		{
			System.out.println(contextname);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//mobile back button
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		

	}

}
