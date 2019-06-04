package com.mpdx.Helper;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "androidDevicesList")
    public static Object[][] androidDevicesList() {
        return new Object[][] {{"U11"}, {"Galaxy S8"}, {"Galaxy S7"}, {"LG G5"}, {"Moto Z (2) Play"}, {"Nexus 5X"}};
    }
}
