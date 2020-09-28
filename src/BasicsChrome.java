import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasicsChrome {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		String deviceId = "17f3dee8";
		String version = "8.1.0";
		String platform = "Android";
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceId);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		cap.setCapability(MobileCapabilityType.UDID, deviceId);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
		

	}

}
