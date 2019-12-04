package cucumberOptions;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        tags = {"@wip"},
        glue = "stepdefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        monochrome = true,
        strict = true
)

public class TestRunner extends AbstractTestNGCucumberTests{

}