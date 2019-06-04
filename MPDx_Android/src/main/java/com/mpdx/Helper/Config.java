package com.mpdx.Helper;

public class Config {
    private static String KOBITON_CREDENTIAL = "https://<USER_NAME>:<API_KEY>@api.kobiton.com/wd/hub";
    private static String ANDROID_APP_URL="https://s3-ap-southeast-1.amazonaws.com/kobiton-devvn/asg_apps/mpdx.apk";
    private static String APP_USERNAME = "Test@test.com";
    private static String APP_PASSWORD = "Test1234";

    public static String getCredential() {
        return KOBITON_CREDENTIAL;
    }
    public static String getAndroidAppURL() {
        return ANDROID_APP_URL;
    }
    public static String getAppUserName() {
        return APP_USERNAME;
    }
    public static String getAppPassword() {
        return APP_PASSWORD;
    }
}
