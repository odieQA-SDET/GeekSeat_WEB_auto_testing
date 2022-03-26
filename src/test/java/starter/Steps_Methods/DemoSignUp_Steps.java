package starter.Steps_Methods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Tests_Class.DemoSIgnUp_Test;

public class DemoSignUp_Steps {
    @Steps
    DemoSIgnUp_Test DemoSignUpSteps;


    @When("I clicked and Mouseover {string} button Icon to shop by category based")
    public void iClickedAndMouseoverScrollMenuButtonIconToShopByCategoryBased(String string) {
        ProductViaCategorySteps.clickedscrollmenu();
    }

    @And("I cLicked {string} maincategory of Electronics")
    public void iCLickedCellPhonesAccessoriesMaincategoryOfElectronics(String string) {
        ProductViaCategorySteps.clickedmaincategory();
    }

    @And("After the page loads, I clicked {string} in the left hand side navigation section")
    public void afterThePageLoadsIClickedCellPhonesSmartphonesInTheLeftHandSideNavigationSection(String string) {
        ProductViaCategorySteps.clickedleftnavigation();
    }

    @And("Now, click - More refinements \\(appears on the left at the end of all filters)")
    public void nowClickMoreRefinementsAppearsOnTheLeftAtTheEndOfAllFilters() {
        ProductViaCategorySteps.clickedallfilter();

    }

    @And("Add First Filter is screen size appearing in the pop-up")
    public void addFirstFilterIsScreenSizeAppearingInThePopUp() {
        ProductViaCategorySteps.clikcedscreensize();
        ProductViaCategorySteps.clickedscreensizecontent();

    }

    @And("Add Second Filter is Price appearing in the pop-up")
    public void addSecondFilterIsPriceAppearingInThePopUp() {
        ProductViaCategorySteps.clickedprice();
        ProductViaCategorySteps.clickedpricecontent();

    }

    @And("Add Third Filter is Item Location appearing in the pop-up and click apply")
    public void addThirdFilterIsItemLocationAppearingInThePopUpAndClickApply() {
        ProductViaCategorySteps.clickeditemlocation();
        ProductViaCategorySteps.clikceditemloccontent();
        ProductViaCategorySteps.clickedapply();

    }

    @And("Verify that the filter tags are applied also counting tags are applied that equals with integer result")
    public void verifyThatTheFilterTagsAreAppliedAlsoCountingTagsAreAppliedThatEqualsWithIntegerResult() {
        ProductViaCategorySteps.clickedverifytagapplied();

    }

    @Given("I was on the homepage of techlistic.com")
    public void iWasOnTheHomepageOfTechlisticCom() {
        DemoSignUpSteps.openHomePage();
        
    }

    @When("I clicked and Enter first and last name \\(textbox)")
    public void iClickedAndEnterFirstAndLastNameTextbox() {
    }

    @And("I selected gender \\(radio button)")
    public void iCLickedAndSelectGenderRadioButton() {
    }

    @And("I selected years of experience \\(radio button)")
    public void iSelectYearsOfExperienceRadioButton() {
    }

    @And("I selected Profession \\(Checkbox)")
    public void iSelectProfessionCheckbox() {

    }

    @And("I selected Automation tools you are familiar with \\(multiple checkboxes)")
    public void iSelectAutomationToolsYouAreFamiliarWithMultipleCheckboxes() {
    }


    @And("I selected Continent \\(Select box)")
    public void iSelectContinentSelectBox() {

    }

    @And("I selected multiple commands from a multi select box")
    public void iSelectedMultipleCommandsFromAMultiSelectBox() {
    }

    @And("I handled Upload image")
    public void iHandledUploadImage() {
    }

    @And("I clicked on Download file link and handle the download file pop-up")
    public void iClickedOnDownloadFileLinkAndHandleTheDownloadFilePopUp() {
        
    }

    @Then("I Click on {string} button")
    public void iClickOnSubmitButton() {
    }
}
