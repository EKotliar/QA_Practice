package ca.testng.practice.testcases;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
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
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement skipButton = driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")"));
        skipButton.click();

        //or
        //driver.findElementByAccessibilityId("com.shawmedia.smglobal:id/left_button").click();
        //or
        //driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")")).click();


        //navigate to Shows - Global brand
        driver.findElementByAccessibilityId("global").click();
        //or
        //driver.findElementByXPath("//android.widget.ImageView[@content-desc='history']").click()
        Thread.sleep(2000);
//click on show to get show details page
        WebElement show = driver.findElement(MobileBy.AndroidUIAutomator("description(\"A Little Late with Lilly Singh\")"));
        show.click();
        Thread.sleep(2000);
//click Back button to return to Shows screen - Global brand
        driver.findElementById("com.shawmedia.smglobal:id/detail_page_back_button").click();

// scroll screen
        // calculate bottom & top of the screen
        Dimension size = driver.manage().window().getSize();
        int middleX = (int) (size.getWidth() * 0.5);
        int bottomY = (int) (size.getHeight() * 0.8);
        int topY = (int) (size.getHeight() * 0.3);
// lookup for element to refresh appium
        List<AndroidElement> lst = driver.findElementsById("com.shawmedia.smglobal:id/shows_grid_view");
        System.out.println(lst.size());
        new TouchAction(driver).press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        new TouchAction(driver).press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        WebElement show1 = driver.findElement(MobileBy.AndroidUIAutomator("description(\"EVIL\")"));
        show1.click();
//click Shows navigation button to return to Shows screen - Global brand
        WebElement NavShow = driver.findElement(MobileBy.AndroidUIAutomator("text(\"SHOWS\")"));
        NavShow.click();
        //driver.findElementById("com.shawmedia.smglobal:id/detail_page_back_button").click();
    }
}




