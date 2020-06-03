package AndroidChrome;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BrowseSample extends AutomationChromeBase {

    public static void main(String[] args) throws MalformedURLException {

        // 1
        AndroidDriver<AndroidElement> driver = setupCapabilities();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

        // 2
        driver.get("https://www.google.ru/");

        //3
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("кресло-качалка");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);


    }
}
