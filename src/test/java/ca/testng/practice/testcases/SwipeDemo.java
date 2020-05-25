package ca.testng.practice.testcases;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
public class SwipeDemo extends Base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver= Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement skipButton = driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")"));
        skipButton.click();

        //or
        //driver.findElementByAccessibilityId("com.shawmedia.smglobal:id/left_button").click();
        //or
        //driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")")).click();

        // calculate bottom & top of the screen
        Dimension size = driver.manage().window().getSize();
        int middleX = (int) (size.getWidth() * 0.5);
        int bottomY = (int) (size.getHeight() * 0.8);
        int topY = (int) (size.getHeight() * 0.3);
// lookup for element to refresh appium
        List<AndroidElement> lst = driver.findElementsById("com.shawmedia.smglobal:id/shows_grid_view");
        System.out.println(lst.size());
// scroll screen
        new TouchAction(driver).press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();


    }
}