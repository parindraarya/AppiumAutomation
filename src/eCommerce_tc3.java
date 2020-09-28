import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class eCommerce_tc3 extends eCommerce{

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
		
		WebElement element = driver.findElementByXPath("//*[@text='Products']");
		if(element.isDisplayed()) {
			System.out.println("Successfully logged in");
		}
		else {
			System.out.println("Log in failed");
		}
		  
//	System.out.println(driver.findElementsById("com.androidsample.generalstore:id/productName").size());
	
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Radio Group\"));");
	
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/productName\")).scrollIntoView(new UiSelector().text(\"Jordan 6 Rings\"));");

	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	
	int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
	String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	System.out.println(text);
	
	if(text.equalsIgnoreCase("Jordan 6 Rings")) {
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		break;
	}
	}
	driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
	
	String verify = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	
	if(verify.equalsIgnoreCase("Jordan 6 Rings"))
	{
		System.out.println("Successfully added into cart");
	}
	else {
		System.out.println("Wrong shoe");
	}
	
	}
}
