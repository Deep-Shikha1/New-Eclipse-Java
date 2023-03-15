import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class basic1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//chrome-url
		//App- .apk, device name, port-4723
		//commands
		//AndroidDriver 
		
		File appDir = new File("src");   //add parent address/directroy
		File app = new File (appDir, "ApiDemos-debug.apk");   //File parent 
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//UI Automator -->Android apps
		//uiautomator2
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),cap);
		
		

	}

}
