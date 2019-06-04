package com.mpdx.Helper;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

import static com.mpdx.Helper.Utils.*;

public class Commons {

  public static void login(IOSDriver iosDriver, String username, String password) {
    try {

      if(iosDriver.findElements(By.xpath("//XCUIElementTypeButton[@name='Continue']")).size() > 0) {
        waitForElement(iosDriver, By.xpath("//XCUIElementTypeButton[@name='Continue']"), WAIT_TIME).click();
      }
      iosDriver.findElementByXPath("//XCUIElementTypeTextField[@value='Email']").sendKeys(username);
      iosDriver.findElementByXPath("//XCUIElementTypeSecureTextField[@value='Password']").sendKeys(password);
      iosDriver.findElementByXPath("//XCUIElementTypeButton[@name='SIGN IN']").click();
      waitForElement(iosDriver, By.xpath("//XCUIElementTypeButton[@name='AUTHORIZE']"), WAIT_TIME).click();
      waitForElement(iosDriver, By.xpath("//XCUIElementTypeButton[@name='Get Started']"), 60).click();
      waitForElement(iosDriver, By.xpath("//XCUIElementTypeSecureTextField"), WAIT_TIME).sendKeys("1111");
      waitForElement(iosDriver, By.xpath("//XCUIElementTypeSecureTextField"), WAIT_TIME).sendKeys("1111");
      sleep(WAIT_TIME);
      if(iosDriver.findElements(By.xpath("//XCUIElementTypeButton[@name='Allow']")).size() > 0) {
        waitForElement(iosDriver, By.xpath("//XCUIElementTypeButton[@name='Allow']"), WAIT_TIME).click();
      }

      if(iosDriver.findElements(By.xpath("//XCUIElementTypeButton[@name='Got it!']")).size() > 0) {
        waitForElement(iosDriver, By.xpath("//XCUIElementTypeButton[@name='Got it!']"), WAIT_TIME).click();
      }

    } catch (Exception ex){
      ex.printStackTrace();
    }
  }

  public static void logout(IOSDriver driver) {
    waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconSettings']"), WAIT_TIME).click();
    waitForElement(driver, By.xpath("//XCUIElementTypeStaticText[@name='Logout Current User']"), WAIT_TIME).click();
    waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='yes']"), WAIT_TIME).click();
  }
}