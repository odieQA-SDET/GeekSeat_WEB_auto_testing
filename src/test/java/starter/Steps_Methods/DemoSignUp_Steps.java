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
