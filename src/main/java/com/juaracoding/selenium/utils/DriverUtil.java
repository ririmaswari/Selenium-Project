package com.juaracoding.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtil {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public WebDriver getDriverss() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}