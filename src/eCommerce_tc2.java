import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class eCommerce_tc2 extends eCommerce{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TouchAction t = new TouchAction(driver);
		WebElement shop = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");
		t.tap(tapOptions().withElement(element(shop))).perform();
		
		WebElement toast = driver.findElement(By.xpath("//android.widget.Toast[1]"));
		System.out.println(toast.getAttribute("name"));
		

	}

}
