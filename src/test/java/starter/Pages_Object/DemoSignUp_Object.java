package starter.Pages_Object;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;


public class DemoSignUp_Object extends PageObject {

//input first name
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement Inputname;

//input last name
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement InputLast;

    public void inputregister() {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("scroll(0,540)");
        Inputname.sendKeys("Odie");
        InputLast.sendKeys("Testing");
    }

//input gender
    @FindBy(id = "sex-0")
    WebElement ClickgenderRB;
    public void clickgenderRB() {
        ClickgenderRB.click();
    }
//input experience
    @FindBy(id = "exp-4")
    WebElement ClickexperienceRB;
    public void clickexperienceRB() {
        ClickexperienceRB.click();
    }
//input tgl
    @FindBy(id = "datepicker")
    WebElement Enterdate;
    public void enterdate() {
        Enterdate.sendKeys("26-03-2022");
    }
//input profession
    @FindBy(id = "profession-1")
    WebElement ClickprofessionRB;
    public void clickprofessionCB() {
        ClickprofessionRB.click();
    }
//input tool
    @FindBy(id = "tool-2")
    WebElement ClicktoolmultipleCB;
    public void clicktoolmultipleCB() {
        ClicktoolmultipleCB.click();
    }
//input continents
    @FindBy(id = "continents")
    WebElement ClickcontinenSB;
    public void clickcontinenSB() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("scroll(0,500)");
        sleep(3000);
        ClickcontinenSB.click();
    }

    @FindBy(xpath = "//*[@id=\"continents\"]/option[1]")
    WebElement ClickoptionSB;
    public void clickoptionSB() {
        ClickoptionSB.click();
    }
//choice selenium commands
    @FindBy(id = "selenium_commands")
    WebElement ClickcommandSB;
    public void clickcommandmultipleSB() {
        ClickcommandSB.click();
    }

    @FindBy(xpath = "//*[@id=\"selenium_commands\"]/option[5]")
    WebElement ClickmutipleSB;
    public void clickmultipleSB() {
        ClickmutipleSB.click();
    }
//upload photo
    By chooseFile = By.id("photo");
   // @FindBy(id = "photo")
  //  WebElement Clickuploadimage;
    public void uploadimage() {
        upload("C:\\Users\\WhiteCode\\Pictures\\Picture1.jpg").to(find(chooseFile));

    }


    @FindBy(xpath ="//button[@id='submit']")
    WebElement Clicksubmit;
    public void clicksubmit() {
        Clicksubmit.click();
    }


}


