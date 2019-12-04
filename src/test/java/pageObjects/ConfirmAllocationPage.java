package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAllocationPage {

    private AppiumDriver driver;

    public ConfirmAllocationPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }
    @AndroidFindBy(xpath = "//*[contains(@text,\"Cautious\")]")
    public MobileElement CautiousTabElement;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Balanced\")]")
    public MobileElement BalancedTabElement;

    @AndroidFindBy(xpath = "//*[contains(@text,\"Adventurous\")]")
    public MobileElement AdventurousTabElement;

    public void navConfirmAllocationScreen(){
        //TODO code to navigate to confirm Allocation screen
    }

    public void clickCautiousTab() {
        CautiousTabElement.click();
    }

    public void clickBalancedTab() {
        BalancedTabElement.click();
    }

    public void clickAdventurousTab() {
        AdventurousTabElement.click();
    }

    public boolean expectedPercentages(String exPercent1,String exPercent2,String exPercent3) {
        WebElement element1 = driver.findElement(By.xpath("//*[contains(@text,\"+exPercent1+\")]"));
        WebElement element2 = driver.findElement(By.xpath("//*[contains(@text,\"+exPercent2+\")]"));
        WebElement element3 = driver.findElement(By.xpath("//*[contains(@text,\"+exPercent3+\")]"));
        try{
            if(element1.isDisplayed() && element2.isDisplayed()&& element3.isDisplayed()){
                return true;
            }else{
                return false;
            }
        } catch(NoSuchElementException e1){
            return false;
        }
    }

}