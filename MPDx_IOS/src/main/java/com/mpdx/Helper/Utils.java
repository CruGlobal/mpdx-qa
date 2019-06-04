package com.mpdx.Helper;

import com.google.common.base.Function;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Utils {

  public enum DIRECTION {
    DOWN, UP, RIGHT, LEFT
  }
  public static int WAIT_TIME = 20;

  public static IOSDriver<WebElement> getIOSDriver(String deviceName) {
    try {
      IOSDriver<WebElement> driver = new IOSDriver<>(new URL(com.mpdx.Helper.Config.getCredential()), getIOSAppDesiredCapabilites(com.mpdx.Helper.Config.getAppURL(), deviceName));
      driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
      return driver;
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }

  public static void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (Exception ex){
      ex.printStackTrace();
    }
  }

  private static DesiredCapabilities getIOSAppDesiredCapabilites(String appUrl, String deviceName) {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("sessionName", "[MPDx] Automation test session");
    capabilities.setCapability("sessionDescription", "testing auto app for iOS");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("noReset", false);
    capabilities.setCapability("fullReset", true);
    capabilities.setCapability("captureScreenshots", true);
    capabilities.setCapability("autoGrantPermissions", true);
    capabilities.setCapability("app", appUrl);
    capabilities.setCapability("deviceGroup", "KOBITON");
    capabilities.setCapability("newCommandTimeout", 180);
    capabilities.setCapability("platformName", "IOS");
    capabilities.setCapability("deviceName", deviceName);
    capabilities.setCapability("automationName", "XCUITest");
    capabilities.setCapability("forceMjsonwp", true);

    return capabilities;
  }

  public static void swipe(IOSDriver<WebElement> driver, By by, DIRECTION direction, int duration) {
    WebElement ele = null;
    Dimension size = driver.manage().window().getSize();

    int startX, startY, endX, endY;

    if (by != null) {
      ele = driver.findElement(by);
    }

    switch (direction) {

      case RIGHT:
        startY = (ele != null) ? (int) (ele.getLocation().getY()) : (int) (size.height / 2);
        startX = (int) (size.width * 0.90);
        endX = (int) (size.width * 0.05);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
        break;

      case LEFT:
        startY = (ele != null) ? (int) (ele.getLocation().getY()) : (int) (size.height / 2);
        startX = (int) (size.width * 0.05);
        endX = (int) (size.width * 0.90);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

        break;

      case UP:
        endY = (ele != null) ? ((ele.getLocation().getY()) + 200) : (int) (size.height * 0.70);
        startY = (ele != null) ? (ele.getLocation().getY()) : (int) (size.height * 0.30);
        startX = (ele != null) ? (ele.getLocation().getX()) : (size.width / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        break;

      case DOWN:
        startY = (int) (size.height * 0.70);
        endY = (int) (size.height * 0.30);
        startX = (ele != null) ? (ele.getLocation().getX()) : (size.width / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        break;
    }
  }

  public static void getSessionDetailsLink(IOSDriver<WebElement> driver) {
    String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
    String session = "\nClick following link for your automation session details:\nhttps://portal.kobiton.com/sessions/" + kobitonSessionId + "\n";
    System.out.println(session);
  }

  public static WebElement waitForElement(IOSDriver<WebElement> driver, By locatorName, int timeout){
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    return wait.until(presenceOfElementLocated(locatorName));
  }

  public static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
    return new Function<WebDriver, WebElement>() {
      @Override
      public WebElement apply(WebDriver driver) {
        return driver.findElement(locator);
      }
    };
  }
}