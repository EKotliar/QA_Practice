package ca.testng.practice.ios.testcases;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BSShowsIOS extends BSBaseIOS {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        // TODO Auto-generated method stub


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click Skip button
        driver.findElement(MobileBy.AccessibilityId("SKIP")).click();

/*        //navigate to Shows - Global brand
        driver.findElement(By.id("SHOWS")).click();
        Thread.sleep(1000);


        //Verify marketing text is displayed under brand bar
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,\"FREE\")]")).getText();
        System.out.println();

        Thread.sleep(1000);


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
        //    new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
        //        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
        //            .perform();
        //    new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
        //        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
        //            .perform();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        //click on show to get show details page
        driver.findElement(By.id("Global BC")).click();
        Thread.sleep(1000);

        //Click Back button to navigate to Shows screen
        driver.findElement(By.id("Back")).click();

        // lookup for element to refresh appium

        // lookup for element to refresh appium
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(middleX, bottomY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(middleX, topY)).release()
                .perform();

/*        List<MobileElement> shows = driver.findElement(By.name("Indebted"));
        List<String> showsName = new ArrayList<>();
        for (MobileElement el : shows) {
            showsName.add(el.getAttribute("name"));
        }
        List<String> previousList = new ArrayList<>();
        boolean showFound = false;
        while (!previousList.equals(showsName) && !showFound) {
            for (MobileElement el : shows) {
                if (el.getAttribute("name").contains("Indebted")) {
                    el.click();
                    showFound = true;
                    break;
                }
            }
            if (showFound) {
                break;
            }
            // scroll screen
            swipe();
            Thread.sleep(2000);
            previousList.clear();
            previousList.addAll(showsName);
            shows = driver.findElement(By.name("Indebted"));
            showsName.clear();
            for (MobileElement el : shows) {
                showsName.add(el.getAttribute("name"));
            }

            //click to navigate to the show
            driver.findElement(By.name("Indebted")).click();
            Thread.sleep(2000);

            //click on heart
            driver.findElement(By.name("favourite off")).click();

            //click on heart to unfavourite show
            driver.findElement(By.name("favourite on")).click();

            //click to confirm cancellation
            driver.findElement(By.id("Yes, remove")).click();
*/
            // navigate back to Shows screen
            driver.findElement(By.id("SHOWS")).click();
            Thread.sleep(1000);


            //navigate to HGTV shows
            driver.findElement(By.id("history")).click();
            Thread.sleep(1000);

            //navigate to Alone show details screen
            driver.findElement(By.id("Alone")).click();

            //clisk Sin in to watch button
            driver.findElement(By.id("SIGN IN TO WATCH")).click();
            Thread.sleep(5000);


            //select Shaw to complete sign in flow
             driver.findElement(By.id("Shaw")).click();
             Thread.sleep(3000);

             //enter shaw creds
        driver.findElement(By.name("username")).click();
        MobileElement username=driver.findElement(By.name("username"));
        username.click();
        username.sendKeys("corusf.reerange@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).click();
        MobileElement password=driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("Welcome00");
        Thread.sleep(2000);

        driver.findElement(By.name("Sign In")).click();
        Thread.sleep(5000);

        System.out.println("Test completed successfully");

        }
    }