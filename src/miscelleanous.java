import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanous extends FirstTest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println(driver.currentActivity());
	     System.out.println(driver.getContext());
	     //views - Native , Hybrid, Webview
	     System.out.println(driver.getOrientation());
	     System.out.println(driver.isDeviceLocked());
	     System.out.println(driver.getDeviceTime());
	     System.out.println(driver.isKeyboardShown());
	     
	   //  driver.hideKeyboard();
	 	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 	driver.pressKeyCode(AndroidKeyCode.BACK);
	 	driver.pressKeyCode(AndroidKeyCode.HOME);


	}

}
