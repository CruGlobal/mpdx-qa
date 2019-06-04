package com.mpdx;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.mpdx.Helper.Commons.*;
import static com.mpdx.Helper.Config.getAppPassword;
import static com.mpdx.Helper.Config.getAppUserName;
import static com.mpdx.Helper.Utils.*;
import static com.mpdx.Helper.Utils.sleep;

public class Android_MPDx_Test {
    private AndroidDriver<WebElement> driver;
    @Test(dataProvider = "androidDevicesList", dataProviderClass = com.mpdx.Helper.DataProvider.class)
    public void Android_MPDx_App_Test(String deviceName) {
        driver = getAndroidDriver(deviceName);
        if(driver != null) {
            try {
                getSessionDetailsLink(driver);

                login(driver,getAppUserName(), getAppPassword() );

                By by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/settings']");
                click(driver, by, WAIT_TIME*3);

                driver.pressKey(new KeyEvent(AndroidKey.BACK));

                by = By.xpath("//android.widget.TextView[@text='Contacts']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/search']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/search_src_text']");
                setText(driver, by, WAIT_TIME, "Aaronson");

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_name_text' and @index=1]");
                click(driver, by, WAIT_TIME);

                scroll(driver, DIRECTION.UP, 1);

                by = By.xpath("//android.widget.TextView[@text='donations']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@text='tasks']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@text='notes']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_note_text_view']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_note_editable']");
                setText(driver, by, WAIT_TIME, "Some notes");
                driver.pressKey(new KeyEvent(AndroidKey.ENTER));

                sleep(5);

                by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/btn_save_note']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@text='info']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contacts_edit']");
                click(driver, by, WAIT_TIME);

                scroll(driver, DIRECTION.UP, 1);

                scroll(driver, DIRECTION.DOWN, 1);

                by = By.xpath("//android.widget.Spinner[@resource-id='org.mpdx:id/likely_spinner']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Least Likely']");
                click(driver, by, WAIT_TIME);

                scroll(driver, DIRECTION.UP, 2);

                by = By.xpath("//android.widget.EditText[@text='(407) 555-1212']/following-sibling::android.widget.RadioButton");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contacts_add']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_detail_call_action']");
                click(driver, by, WAIT_TIME);

                driver.activateApp("org.mpdx");
                sleep(3);

                by = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_detail_text_action']");
                click(driver, by, WAIT_TIME);

                sleep(3);
                driver.pressKey(new KeyEvent(AndroidKey.BACK));

                by = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_detail_email_action']");
                click(driver, by, WAIT_TIME);

                driver.pressKey(new KeyEvent(AndroidKey.BACK));

                by = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_detail_directions_action']");
                click(driver, by, WAIT_TIME);

                driver.activateApp("org.mpdx");
                sleep(3);

                by = By.xpath("//android.widget.TextView[@text='contacts']/preceding-sibling::android.widget.ImageButton");
                click(driver, by, WAIT_TIME);

                driver.pressKey(new KeyEvent(AndroidKey.BACK));

                by = By.xpath("//android.widget.TextView[@text='Dashboard']");
                click(driver, by, WAIT_TIME);

                by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/settings']");
                click(driver, by, WAIT_TIME);

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
