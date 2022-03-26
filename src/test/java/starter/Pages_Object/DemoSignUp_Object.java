package starter.Pages_Object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;


public class DemoSignUp_Object extends PageObject {


    @FindBy(xpath = "//*[@id='gh-shop-a']")
    WebElement opennscroll;

    public void openscrollmenunclick() {
        opennscroll.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Cell phones & accessories']")
    WebElement ClickedMaincategory;
    public void clickedMaincategory() {
        ClickedMaincategory.click();
    }

    @FindBy(xpath = "//a[text()='Cell Phones & Smartphones']")
    WebElement ClickedLeft;
    public void ClickedLeftnavigation() {
        ClickedLeft.click();
    }

    @FindBy(xpath = "//button[text()='All Filters']")
    WebElement Clickedallfilter;
    public void ClickedAllFilter() {
        Clickedallfilter.click();
        Clickedallfilter.isDisplayed();
    }

    @FindBy(xpath = "//span[text()='Screen Size']")
    WebElement Clickedscreensize;
    public void clickedScreensize() {
        Clickedscreensize.click();

    }

    @FindBy(xpath = "//span[text()='6 in or More']")
    WebElement ClickedScreenSize;
    public void ClickedscreensizeContent() {
        ClickedScreenSize.click();

    }

    @FindBy(xpath = "//*[@id='c3-mainPanel-price']")
    WebElement ClickedPrice;
    public void clickedPrice() {
        ClickedPrice.click();
    }

    @FindBy(xpath = "//*[@aria-label='Minimum Value, US Dollar']")
    WebElement ClickedPriceContent1;
    public void clickedPricecontent1() {
        ClickedPriceContent1.sendKeys("4500000");
    }

    @FindBy(xpath = "//*[@aria-label='Maximum Value, US Dollar']")
    WebElement ClickedPriceContent2;
    public void clickedPricecontent2() {
        ClickedPriceContent2.sendKeys("20000000");
    }

    @FindBy(xpath = "//*[@id='c3-mainPanel-location']")
    WebElement ClickedItem;
    public void Clickeditemlocation()  {
        ClickedItem.click();
    }

    @FindBy(xpath = "//span[text()='Asia']")
    WebElement ItemLocContent;
    public void itemlocationcontent() {
        ItemLocContent.click();
    }

    @FindBy(xpath = "//button[text()='Apply']")
    WebElement ClickedApply;
    public void Clickedapply() {
        ClickedApply.click();
    }

    @FindBy(xpath = "//*[@id='s0-27_1-9-0-1[0]-0-0-6-5-4[0]-flyout']//*[contains(@class, 'x-flyout__button')]")
    WebElement ClickedVerify;
    public void Clickedverifytagapplied() {
        ClickedVerify.click();
    }
        public static void main(String[] args) {
            List aList = new ArrayList();
            aList.add("Screen Size: 6 in or More");
            aList.add("Price: $4,500,000.00 to $20,000,000.00");
            aList.add("tem Location: Asia");
            System.out.println("The 3 of the Filter List is: " + aList.size());
    }
}


