import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class eCommerce_tc1 extends eCommerce{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Test");
		driver.hideKeyboard();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.xpath("//*[@text='Afghanistan']")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hong Kong\"));");
		
		driver.findElementByXPath("//*[@text='Hong Kong']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		WebElement element = driver.findElementByXPath("//*[@text='Products']");
		if(element.isDisplayed()) {
			System.out.println("Successfully logged in");
		}
		else {
			System.out.println("Log in failed");
		}
	}

}
