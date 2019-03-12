import android.view.*;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by khanhdo on 10/24/18.
 */
public class CRUTest {

    public static AndroidDriver driver = null;
    int timeout = 15;

    public static final URL kobitonServerUrl(){
        try {
//            String kobitonServerUrl = "https://kobiton-org-demo:0e43710e-a251-40d1-9c72-2f17ed3b098a@api.kobiton.com/wd/hub";
            String kobitonServerUrl = "https://bufordr1:84fd0f29-23e8-47f4-8ba2-223f737ba768@api.kobiton.com/wd/hub";
//            String kobitonServerUrl = "https://kobiton-org:<APIKey>@api.kobiton.com/wd/hub";
//            String kobitonServerUrl = "http://127.0.0.1:4723/wd/hub";
            return new URL(kobitonServerUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final DesiredCapabilities desiredCapabilitiesAndroidApp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("sessionName", "Automation test session");
        capabilities.setCapability("sessionDescription", "Test run 1");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("app", "kobiton-store:27296");
        capabilities.setCapability("groupId", 421); // Group: MissionHub
        capabilities.setCapability("deviceGroup", "KOBITON");
        capabilities.setCapability("deviceName", "Galaxy S7*");
        capabilities.setCapability("platformVersion", "8.*");
//        capabilities.setCapability("udid", "9887fc41594630315a");
        capabilities.setCapability("appWaitActivity", "org.mpdx.features.onboarding.OnboardingActivity");
        capabilities.setCapability("appPackage", "org.mpdx");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", true);
        return capabilities;
    }

    View decorView = getWindow().getDecorView();
    // Hide both the navigation bar and the status bar.
    // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
    // a general rule, you should design your app to hide the status bar whenever you
    // hide the navigation bar.
    int uiOptions = Window.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_FULLSCREEN;
    decorView.setSystemUiVisibility(uiOptions);

    @BeforeTest
    public void Setup() {
        driver = new AndroidDriver<WebElement>(kobitonServerUrl(), desiredCapabilitiesAndroidApp());
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterTest
    public void Teardown() {
        try {
            if (driver != null)
                driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAndroidApp() {
//        try {
//            if (driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).isEnabled())
//                driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
//        } catch (Exception ex){}

        String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
        System.out.println("Kobiton Session: https://portal.kobiton.com/sessions/" + kobitonSessionId);

        StringBuilder sb = new StringBuilder();
        sb.append("Step 1: Click get start\n" +
                "Step 2: Enter a 4 digit mobile unlock code\n" +
                "Step 3: Click confirm pin\n" +
                "Step 4: Enter email address \n" +
                "Step 5: Enter password\n" +
                "Step 6: Click Sign In button\n" +
                "Step 7: Click Authorize button\n" +
                "Step 8: Enter your mobile unlock code\n" +
                "Step 9: Click unlock with pin button\n" +
                "Step 9: Click add new contact\n" +
                "Step 10: Enter contact info\n" +
                "Step 11: Enter primary address\n" +
                "Step 12: Enter communications info\n" +
                "Step 12: Click add person info\n" +
                "Step 13: Enter search person\n" +
                "Step 14: Email to a person\n" +
                "Step 15: Log task\n" +
                "Step 16: Back to dashboard\n" +
                "Step 17: Sign out\n" +
                "Note: To run automation on device S8 & S9, we need to enable the navigation bar (To be shown always at the bottom of the screen - No Automatic hide). Once this is done, appium is able to pick it up and tap it.\n" +
                "");
        System.out.println(sb.toString());
        By by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/get_started_button']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/enroll_pin_edittext']");
        setText(driver, by, timeout, "1111");

        by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/confirm_pin_button']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.EditText[@resource-id='username']");
        setText(driver, by, timeout, "test@test.com");

        by = By.xpath("//android.widget.EditText[@resource-id='password']");
        setText(driver, by, timeout, "Test1234");

        by = By.xpath("//android.widget.Button[@text='SIGN IN']");
        click(driver, by, timeout);

        sleep(3);

        by = By.xpath("//android.widget.Button[@text='AUTHORIZE']");
        click(driver, by, timeout);
        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/unlock_pin_edittext']");
        setText(driver, by, timeout, "1111");

        by = By.xpath("//android.widget.Button[@resource-id='org.mpdx:id/unlock_pin_button']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.ProgressBar");
        waitElement(driver, by, 60);

        by = By.xpath("//android.widget.TextView[@text='dashboard']");
        waitElement(driver, by, 60);
        waitElement(driver, by, 60);
        waitElement(driver, by, 60);
        waitElement(driver, by, 60);
        waitElement(driver, by, 60);

        by = By.xpath("//android.widget.ImageButton[@resource-id='org.mpdx:id/fab']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/title_view' and @text='new contact']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/edit_name']");
        setText(driver, by, timeout, "Smith, Kris");

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Both']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Email']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Least Likely']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Likely']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/address_text']");
        click(driver, by, timeout);

        // address and details
        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_address_street']");
        setText(driver, by, timeout, "2942 Burning Tree Ct");

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_address_city']");
        setText(driver, by, timeout, "Winter Park");

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_address_state']");
        setText(driver, by, timeout, "FL");

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_address_postalCode']");
        driver.findElement(by).sendKeys("32000");

        scroll(400, 1500, 400, 400);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/contact_address_country']");
        setText(driver, by, timeout, "US");

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Business']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Home']");
        click(driver, by, timeout);

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        scroll(400, 1500, 400, 400);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/greeting']");
        setText(driver, by, timeout, "Dear Kris and Julie");

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/envelopeName']");
        setText(driver, by, timeout, "Kris and Julie Smith");

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/commitment_done']");
        click(driver, by, timeout);

        by = By.xpath("//*[@resource-id='org.mpdx:id/add_person']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='ADD MANUALLY']");
        click(driver, by, timeout);


        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/person_name' and @text='Last Name, First Name']");
        click(driver, by, timeout);
        setText(driver, by, timeout, "Smith, Kris");

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/phone' and @text='add phone']");
        click(driver, by, timeout);
        sleep(3);
        setText(driver, by, timeout, "4044040404");
        if (driver.isKeyboardShown()) driver.hideKeyboard();

        scroll(400, 1500, 400, 400);
        sleep(3);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/email' and @text='add email']");
        click(driver, by, timeout);
        sleep(3);
        setText(driver, by, timeout, "kris.smith@test.com");

        if (driver.isKeyboardShown()) driver.hideKeyboard();
        scroll(400, 1500, 400, 400);
        sleep(3);

        by = By.xpath("//*[@resource-id='org.mpdx:id/add_person']");
        click(driver, by, timeout);

        by = By.xpath("//*[@resource-id='android:id/button1' and @text='ADD MANUALLY']");
        click(driver, by, timeout);
        sleep(3);
        scroll(400, 1500, 400, 400);
        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/person_name' and @text='Last Name, First Name']");
        setText(driver, by, timeout, "Smith, Julie");

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/phone' and @text='add phone']");
        click(driver, by, timeout);
        driver.findElement(by).clear();
        sleep(3);
        setText(driver, by, timeout, "4044040405");
        if (driver.isKeyboardShown()) driver.hideKeyboard();

        scroll(400, 1500, 400, 400);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/email' and @text='add email']");
        setText(driver, by, timeout, "julie.smith@test.com");

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contacts_add' and @text='DONE']");
        click(driver, by, timeout);

        sleep(3);

        // Search Contacts
        by = By.xpath("//android.widget.TextView[@text='Contacts']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/search']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/search_src_text']");
        setText(driver, by, timeout, "Smith, Kris");

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_name_text' and @index=1]");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/contact_detail_email_action']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Gmail']");
        click(driver, by, timeout);

        sleep(3);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        sleep(5);

        by = By.xpath("//android.widget.Button[@resource-id='android:id/button3' and @text='ADD INFO']");
        click(driver, by, timeout);

        // Log Task
        by = By.xpath("//android.widget.EditText[@resource-id='org.mpdx:id/add_task_subject']");
        setText(driver, by, timeout, "Send welcome email");

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        scroll(400, 1500, 400, 400);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/set_time_text']");
        click(driver, by, timeout);

        by = By.xpath("//*[@content-desc='12' and @index=11]");
        click(driver, by, timeout);

        sleep(2);

        by = By.xpath("//*[@content-desc='5']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.Button[@text='OK']");
        click(driver, by, timeout);

        sleep(2);
        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/set_date_text']");
        click(driver, by, timeout);

        by = By.xpath("//*[@text='OK']");
        click(driver, by, timeout);

        sleep(2);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/new_task_add']");
        click(driver, by, timeout);

        sleep(5);

        by = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
        click(driver, by, timeout);

        if (driver.isKeyboardShown()) driver.hideKeyboard();

        by = By.xpath("//android.widget.TextView[@text='Tasks']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@text='Dashboard']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/settings']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.TextView[@resource-id='org.mpdx:id/logout']");
        click(driver, by, timeout);

        sleep(3);

        by = By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='YES']");
        click(driver, by, timeout);

        by = By.xpath("//android.widget.EditText[@resource-id='username']");
        waitElement(driver, by, 60);
    }

    public void click(AndroidDriver driver, By by, int timeoutInSeconds) {
        waitElement(driver, by, timeoutInSeconds);
        System.out.println("Click on element: " + by.toString());
        driver.findElement(by).click();

    }

    public void setText(AndroidDriver driver, By by, int timeoutInSeconds, String value) {
        waitElement(driver, by, timeoutInSeconds);
        System.out.println("Enter value: " + by.toString());
        driver.findElement(by).sendKeys(value);
    }

    public void waitElement(AndroidDriver driver, By by, int timeoutInSeconds) {
        try{
            System.out.println("Wait for element by: " + by.toString());
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception ex){}

    }

    private void scroll(int fromX, int fromY, int toX, int toY) {
        System.out.println("Scroll from {" + fromX + ":" + fromY + "} to {" + toX + ":" + toY + "}");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }
}
