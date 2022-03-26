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

    @Given("I was on the homepage of techlistic.com")
    public void iWasOnTheHomepageOfTechlisticCom() {
        DemoSignUpSteps.openHomePage();
        
    }

    @When("I clicked textbox to Enter first name and Enter last name")
    public void iClickedTextboxToEnterFirstNameAndEnterLastName() {
        DemoSignUpSteps.InputRegister();
    }

    @And("I selected gender \\(radio button)")
    public void iCLickedAndSelectGenderRadioButton() {
        DemoSignUpSteps.ClickGenderRB();
    }

    @And("I selected years of experience \\(radio button)")
    public void iSelectYearsOfExperienceRadioButton() {
        DemoSignUpSteps.ClickExperienceRB();
    }

    @And("I entered the date")
    public void iEnteredTheDate() {
        DemoSignUpSteps.EnterDate();
    }

    @And("I selected Profession \\(Checkbox)")
    public void iSelectProfessionCheckbox() {
        DemoSignUpSteps.ClickProfessionCB();

    }

    @And("I selected Automation tools you are familiar with \\(multiple checkboxes)")
    public void iSelectAutomationToolsYouAreFamiliarWithMultipleCheckboxes() {
        DemoSignUpSteps.ClickToolMultipleCB();
    }


    @And("I selected Continent \\(Select box)")
    public void iSelectContinentSelectBox() throws InterruptedException {
        DemoSignUpSteps.ClickContinentSB();
        DemoSignUpSteps.ClickOptionSB();

    }

    @And("I selected multiple commands from a multi select box")
    public void iSelectedMultipleCommandsFromAMultiSelectBox() throws InterruptedException {
        DemoSignUpSteps.ClickMultipleCommandsMultipleSB();
        DemoSignUpSteps.ClickMultipleSB();
    }

    @And("I handled Upload image")
    public void iHandledUploadImage() {
        DemoSignUpSteps.UploadImage();
    }

    @And("I clicked on Download file link and handle the download file pop-up")
    public void iClickedOnDownloadFileLinkAndHandleTheDownloadFilePopUp() {
        DemoSignUpSteps.ClickDownloadFile();
        
    }

    @Then("I Click on {string} button")
    public void iClickOnSubmitButton(String string) {
     //   DemoSignUpSteps.ClickSubmitButton();

    }

}
