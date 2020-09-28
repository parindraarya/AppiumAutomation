import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.offset.ElementOption;
import static java.time.Duration.ofSeconds;

public class eCommerce_tc4 extends eCommerce{

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
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(2000);
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sum = 0;
		
		for(int i=0;i<count;i++) {
			String p1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double amount = getAmount(p1);
			sum += amount;
		}
		
		String total = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
		double price = getAmount(total);
		
		TouchAction t = new TouchAction(driver);
		WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		
		WebElement tc = driver.findElementByXPath("//*[@text='Please read our terms of conditions']");
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElement(By.id("com.androidsample.generalstore:id/alertTitle")).getText());
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElementByXPath("//*[@text='Visit to the website to complete purchase']").click();
		
		if(sum == price) {
			System.out.println("Your Total amount is: "+ sum);
		}
		else {
			System.out.println("Invalid billing");
		}
	}
	
	public static double getAmount(String amount) {
		amount = amount.substring(1);
		double amountvalue = Double.parseDouble(amount);
		return amountvalue;
	}

}
