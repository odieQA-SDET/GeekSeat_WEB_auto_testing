package starter.Pages_Object;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class DemoSignUp_Object extends PageObject {

//input first name
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement Inputname;
    public void inputname() {
        Inputname.sendKeys("Odie");
    }

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement InputLast;
    public void inputlastname() {
        InputLast.sendKeys("Testing");
    }

    @FindBy(id = "sex-0")
    WebElement ClickgenderRB;
    public void clickgenderRB() {
        ClickgenderRB.click();
    }

    @FindBy(id = "exp-4")
    WebElement ClickexperienceRB;
    public void clickexperienceRB() {
        ClickexperienceRB.click();
    }

    @FindBy(id = "datepicker")
    WebElement Enterdate;
    public void enterdate() {
        Enterdate.sendKeys("26-03-2022");
    }

    @FindBy(id = "profession-1")
    WebElement ClickprofessionRB;
    public void clickprofessionCB() {
        ClickprofessionRB.click();
    }

    @FindBy(id = "tool-2")
    WebElement ClicktoolmultipleCB;
    public void clicktoolmultipleCB() {
        ClicktoolmultipleCB.click();
    }

    @FindBy(id = "continents")
    WebElement ClickcontinenSB;
    public void clickcontinenSB() {
        ClickcontinenSB.click();
    }

    @FindBy(xpath = "//*[@id=\"continents\"]/option[1]")
    WebElement ClickoptionSB;
    public void clickoptionSB() {
        ClickoptionSB.click();
    }

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

    By chooseFile = (By) By.id("photo");
   // @FindBy(id = "photo")
  //  WebElement Clickuploadimage;
    public void uploadimage() {
        upload("C:\\Users\\WhiteCode\\Pictures\\Picture1.jpg").to(find(chooseFile));

    }
}


