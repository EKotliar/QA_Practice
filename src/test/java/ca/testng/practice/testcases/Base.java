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

public class Base {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException, InterruptedException {
        File fs=new File("/Users/ekotliar/Project/QA_Practice/src/test/resources/applications/android-release-build-4.0.0-405.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000);

        return driver;
    }
}