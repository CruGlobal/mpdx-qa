package com.mpdx.Helper;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "devicesList")
    public static Object[][] provideDevicesList() {
        return new Object[][] {{"iPhone 6 Plus"}, {"iPad Pro 9.7 (Wi-Fi)"}};
    }
}
