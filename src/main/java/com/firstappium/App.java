package com.firstappium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "11");
        capabilities.setCapability("deviceName", "R");
        
        capabilities.setCapability("udid","PZIROR5DDACMQWU8");
        capabilities.setCapability("platformName","Android");
        // This package name of your app (you can get it from apk info app)
        capabilities.setCapability("capabilityType.BROWSER_NAME", "chrome");
        capabilities.setCapability("capabilityType.VERSION", "103.0");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    
    }
}

