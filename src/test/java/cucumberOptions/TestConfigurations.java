package cucumberOptions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;


public class TestConfigurations {
    private AppiumDriver driver;


    public void driverSetup(String platform) throws Exception {
        switch (platform) {
            case "androidlocal":
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getAndroidCapabilities());
                break;


            case "ioslocal":
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), getIOSCapabilities());
                break;
        }
    }

    private DesiredCapabilities getAndroidCapabilities() throws Exception {
        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        androidCapabilities.setCapability("device","Android Device");
        androidCapabilities.setCapability("autoDismissAlerts", true);
        androidCapabilities.setCapability("os_version", "os version");
        androidCapabilities.setCapability("app", "app.name");
        return androidCapabilities;
    }


    private DesiredCapabilities getIOSCapabilities() throws Exception {
        DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        iosCapabilities.setCapability("device", "iOS Device");
        iosCapabilities.setCapability("os_version", "");
        iosCapabilities.setCapability("app", "bundleid");
        iosCapabilities.setCapability("bundleId", "bundleid");
        return iosCapabilities;
    }


    public AppiumDriver getDriver() {
        try {
            if ((this.driver == null))
                this.driverSetup("android");
        } catch (Exception exp) {
            System.exit(0);
        }
        return driver;
    }

}