package com.mpdx.Helper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import static com.mpdx.Helper.Utils.*;

public class Commons {
    public static void login(AndroidDriver driver,String username, String password) {
        By by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/get_started_button']");
        click(driver, by, WAIT_TIME);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/enroll_pin_edittext']");
        setText(driver, by, WAIT_TIME, "1111");

        by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/confirm_pin_button']");
        click(driver, by, WAIT_TIME);

        by = By.xpath("//android.widget.EditText[@resource-id='username']");
        setText(driver, by, WAIT_TIME*3, username);

        by = By.xpath("//android.widget.EditText[@resource-id='password']");
        setText(driver, by, WAIT_TIME, password);

        by = By.xpath("//android.widget.Button[@text='SIGN IN']");
        click(driver, by, WAIT_TIME);

        sleep(WAIT_TIME);

        by = By.xpath("//android.widget.Button[@text='AUTHORIZE']");
        click(driver, by, WAIT_TIME);
        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/unlock_pin_edittext']");
        setText(driver, by, WAIT_TIME, "1111");

        by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/unlock_pin_button']");
        click(driver, by, WAIT_TIME);
    }

    public static void logout(AndroidDriver driver) {
        By by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/logout']");
        click(driver, by, WAIT_TIME);

        by = By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='YES']");
        click(driver, by, WAIT_TIME);
    }
}
