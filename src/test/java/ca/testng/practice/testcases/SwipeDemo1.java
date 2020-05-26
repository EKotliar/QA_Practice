package ca.testng.practice.testcases;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SwipeDemo1 extends Base1 {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//click Skip button
        driver.findElementById("com.shawmedia.smglobal:id/left_button").click();
        //or
        //driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")")).click();
        //or
        //WebElement skipButton = driver.findElement(MobileBy.AndroidUIAutomator("text(\"SKIP\")"));
        //skipButton.click();

        //navigate to Shows - Global brand
        driver.findElementByAccessibilityId("global").click();
        //or
        //driver.findElementByXPath("//android.widget.ImageView[@content-desc='history']").click()
        Thread.sleep(2000);

        // lookup for element to refresh appium
        List<AndroidElement> shows = driver.findElements(By.id("com.shawmedia.smglobal:id/general_show_art_image_view"));
        List<String> showsName = new ArrayList<>();
        for (AndroidElement el : shows) {
            showsName.add(el.getAttribute("content-desc"));
        }
        List<String> previousList = new ArrayList<>();
        boolean showFound = false;
        while (!previousList.equals(showsName) && !showFound) {
            for (AndroidElement el : shows) {
                if (el.getAttribute("content-desc").contains("Survivor")) {
                    el.click();
                    showFound = true;
                    break;
                }
            }
            if (showFound) {
                break;}
            // scroll screen
            swipe();
            Thread.sleep(2000);
            previousList.clear();
            previousList.addAll(showsName);
            shows = driver.findElements(By.id("com.shawmedia.smglobal:id/general_show_art_image_view"));
            showsName.clear();
            for (AndroidElement el : shows) {
                showsName.add(el.getAttribute("content-desc"));
            }
        }



/*//navigate to Shows - Global brand
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

 */
    }
}