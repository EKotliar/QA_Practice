package ca.testng.practice.testcases;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base1 {
    static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException, InterruptedException {

        File fs = new File("/Users/ekotliar/Project/QA_Practice/src/test/resources/applications/android-release-build-4.0.0-405.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        //AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000);
        return driver;
    }

    public static void swipe() throws MalformedURLException, InterruptedException {
        // calculate bottom & top of the screen


        Dimension size = driver.manage().window().getSize();
        int middleX = (int) (size.getWidth() * 0.5);
        int bottomY = (int) (size.getHeight() * 0.8);
        int topY = (int) (size.getHeight() * 0.3);
        new TouchAction(driver)
                .press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(middleX, topY))
                .release()
                .perform();
    }
}