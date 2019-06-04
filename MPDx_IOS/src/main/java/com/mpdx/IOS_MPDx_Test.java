package com.mpdx;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.mpdx.Helper.Commons.login;
import static com.mpdx.Helper.Commons.logout;
import static com.mpdx.Helper.Config.getAppPassword;
import static com.mpdx.Helper.Config.getAppUserName;
import static com.mpdx.Helper.Utils.*;

public class IOS_MPDx_Test {
    private IOSDriver<WebElement> driver;
    @Test(dataProvider = "devicesList", dataProviderClass = com.mpdx.Helper.DataProvider.class)
    public void IOS_MPDx_App_Test(String deviceName) {
        driver = getIOSDriver(deviceName);
        if(driver != null) {
            try {
                getSessionDetailsLink(driver);
                login(driver, getAppUserName(), getAppPassword());

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconClose']"), 60).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='contacts']"), WAIT_TIME).click();

                sleep(10);
                System.out.println(driver.getPageSource());

                waitForElement(driver, By.xpath("//XCUIElementTypeSearchField[@name='search']"), WAIT_TIME).sendKeys("Aaron");
                waitForElement(driver, By.xpath("//XCUIElementTypeStaticText[@value='Aaronson, Aaron A.']"), WAIT_TIME).click();

                swipe(driver, null, DIRECTION.UP, 1);

                waitForElement(driver, By.xpath("//XCUIElementTypeSegmentedControl/child::*[2]"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeSegmentedControl/child::*[3]"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='notes']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='info']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='editPencil']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='least likely']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='edit contact']"), WAIT_TIME).click();

                swipe(driver, null, DIRECTION.DOWN, 1);

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconAddEmailPhone']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeTextField[@value='Phone Number']"), WAIT_TIME).sendKeys(" 4075551212");
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='Done']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconAddEmailPhone']/following::*[@name='CRUIconAddEmailPhone']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeTextField[@value='Email Address']"), WAIT_TIME).sendKeys(" rb@example.com");
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='Done']"), WAIT_TIME).click();

                // the app will quit by itself when clicking on save button
                // instead we will click on cancel button to avoid this issue
//                waitForElement(null, driver, By.xpath("//XCUIElementTypeButton[@name='save']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='cancel']"), WAIT_TIME).click();
                System.out.println(driver.getPageSource());


                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconCall']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='cancel']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconText']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='cancel']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconEmail']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='cancel']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='CRUIconAddress']"), WAIT_TIME).click();
                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='okay']"), WAIT_TIME).click();

                waitForElement(driver, By.xpath("//XCUIElementTypeButton[@name='dashboard']"), WAIT_TIME).click();

                logout(driver);
            } finally {
                if (driver != null) {
                    driver.quit();
                }
            }
        }
        else {
            System.out.println("Failed to create driver");
        }
    }
}