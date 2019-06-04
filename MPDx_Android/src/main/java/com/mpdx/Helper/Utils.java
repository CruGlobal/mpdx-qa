package com.mpdx.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static  com.mpdx.Helper.Config.*;

public class Utils {

    public enum DIRECTION {
        DOWN, UP
    }

    public static int WAIT_TIME = 20;

    public static AndroidDriver<WebElement> getAndroidDriver(String deviceName) {
        try {
            AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL(getCredential()), getAndroidAppDesiredCapabilities(getAndroidAppURL(), deviceName));
            driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
            return driver;
        }
        catch (Exception ex) {
              ex.printStackTrace();
        }
        return null;
    }

    private static DesiredCapabilities getAndroidAppDesiredCapabilities(String appUrl, String deviceName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("sessionName", "[MPDx] Automation Android app testing with Kobiton");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("app", appUrl);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appWaitActivity", "org.mpdx.features.onboarding.OnboardingActivity");
        capabilities.setCapability("appPackage", "org.mpdx");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("newCommandTimeout", 120);
        return capabilities;
    }

    public static void scroll(AndroidDriver<WebElement> driver, DIRECTION direction, int noOfSwipe) {
        int count = 1;
        while(count <= noOfSwipe)
        {
            Dimension size = driver.manage().window().getSize();
            int y_start;
            int y_end;
            if(direction == DIRECTION.UP) {
                y_start=(int)(size.height*0.60);
                y_end=(int)(size.height*0.30);
            } else {
                y_start=(int)(size.height*0.30);
                y_end=(int)(size.height*0.60);
            }
            int x=size.width/2;
            new TouchAction(driver)
                .press(PointOption.point(x, y_start))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(WAIT_TIME*10)))
                .moveTo(PointOption.point(x, y_end))
                .release()
                .perform();
            count++;
        }
    }

    public static void click(AndroidDriver driver, By by, int timeoutInSeconds) {
      waitElement(driver, by, timeoutInSeconds);
      driver.findElement(by).click();
    }

    public static void waitElement(AndroidDriver driver, By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void setText(AndroidDriver driver, By by, int timeoutInSeconds, String value) {
        waitElement(driver, by, timeoutInSeconds);
        driver.findElement(by).sendKeys(value);
    }

    public static void sleep(int seconds) {
        try {
           Thread.sleep(seconds * 1000);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void getSessionDetailsLink(AndroidDriver<WebElement> androidDriver) {
        String kobitonSessionId = androidDriver.getCapabilities().getCapability("kobitonSessionId").toString();
        String session = "\nClick following link for your automation session details:\nhttps://portal.kobiton.com/sessions/" + kobitonSessionId + "\n";
        System.out.println(session);
    }
}
