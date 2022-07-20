package com.firstappium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{       
    static  WebDriver driver;
    public static void main( String[] args )
    {
        try {
            
            calc();
            System.out.println( "Hello World!" );

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void calc() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R");
capabilities.setCapability(MobileCapabilityType.UDID, "PZIROR5DDACMQWU8");
URL url = new URL("http://127.0.0.1:4723/wd/hub");
AppiumDriver driver = new AppiumDriver(url, capabilities);
driver.get("http://saucelabs.com/test/guinea-pig");
    }
}

