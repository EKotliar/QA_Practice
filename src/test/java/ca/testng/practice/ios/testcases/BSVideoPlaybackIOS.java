package ca.testng.practice.ios.testcases;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BSVideoPlaybackIOS extends BSBaseIOS {

    @Test
    public void Playback() throws MalformedURLException, InterruptedException {
        // TODO Auto-generated method stub


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //click Skip button
        driver.findElement(MobileBy.AccessibilityId("SKIP")).click();


        //navigate to Global brand - on Shows screen
        driver.findElement(By.id("global")).click();
        Thread.sleep(2000);


    //scroll down
    // calculate bottom & top of the screen
    Dimension size = driver.manage().window().getSize();
    int middleX = (int) (size.getWidth() * 0.5);
    int bottomY = (int) (size.getHeight() * 0.8);
    int topY = (int) (size.getHeight() * 0.3);
    // lookup for element to refresh appium
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();

        //Verify Play button is displayed and launch palyer
        MobileElement playButton=driver.findElement(By.name("media-play"));
        System.out.println("Play button is displayed");
        playButton.click();

}
}
