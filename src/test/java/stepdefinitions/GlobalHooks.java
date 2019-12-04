package stepdefinitions;

import cucumberOptions.TestConfigurations;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import java.io.IOException;

public class GlobalHooks {

    private AppiumDriver driver;
    private Scenario scenario;


    public GlobalHooks(TestConfigurations testConfigs) {
        this.driver = testConfigs.getDriver();
    }

    @Before
    public void beforeTest() {

    }

    @After
    public void afterTest(Scenario scenario) throws IOException {
        this.scenario = scenario;
        this.driver.quit();
    }

}