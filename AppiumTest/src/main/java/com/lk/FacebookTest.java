package com.lk;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FacebookTest {

    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            MobileApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void MobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Logesh S21 FE");
        cap.setCapability("udid", "RZCWB04A9FZ");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.instagram.android");
        cap.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity");

        URL url = new URL("http://127.0.0.1:4723");

        // Initialize the Appium driver
        driver = new AndroidDriver(url, cap);

        // Add your test code here, e.g., interacting with the Facebook app
        System.out.println("Facebook app is started successfully");

        // Example: Perform some actions, e.g., clicking a button, etc.
        // MobileElement element = driver.findElement(By.id("some_element_id"));
        // element.click();

        // Close the driver after the test
        
    }
}
