package AndroidChrome;

import java.net.MalformedURLException;
import java.net.URL;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AutomationChromeBase{


    public static AndroidDriver<AndroidElement> setupCapabilities() throws MalformedURLException {

        // 1 Create Device Capabilities.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("chromedriverExecutable","C:\\chromedriver.exe");
        cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

        // 2 Setup a device name. This capability is currently ignored, but remains required on Android.
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

        // 3 Setup a name of Android web browser to automate.
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        // 4 Create an Android driver to initiate the session to Appium server.
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);

        return driver;
    }
}
