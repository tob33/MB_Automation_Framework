package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import pageObjects.ConfirmAllocationPage;


public class ConfirmAllocation_steps {

    private AppiumDriver driver;
    private ConfirmAllocationPage confirmAllocation;

    public ConfirmAllocation_steps(AppiumDriver driver, ConfirmAllocationPage confirmAllocation) {
        this.driver = driver;
        this.confirmAllocation = confirmAllocation;
    }

    @Given("the user is on the Confirm Allocation screen")
    public void the_user_is_on_the_Confirm_Allocation_screen() {
        confirmAllocation.navConfirmAllocationScreen();
    }

    @When("the user taps on the Cautious tab")
    public void the_user_taps_on_the_Cautious_tab() {
        confirmAllocation.clickCautiousTab();
    }

    @Then("the allocations are “{int}%”, “{int}%”, “{int}%”")
    public void the_allocations_are(String str1, String str2, String str3) {
        Assert.assertTrue(confirmAllocation.expectedPercentages(str1, str2, str3));
    }


    @When("the user taps on the Balanced tab")
    public void the_user_taps_on_the_Balanced_tab() {
        confirmAllocation.clickBalancedTab();
    }

    @When("the user taps on the Adventurous tab")
    public void the_user_taps_on_the_Adventurous_tab() {
        confirmAllocation.clickAdventurousTab();
    }
}
