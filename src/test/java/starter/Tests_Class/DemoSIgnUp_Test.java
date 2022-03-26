package starter.Tests_Class;

import starter.Pages_Object.DemoSignUp_Object;

public class DemoSIgnUp_Test {
    DemoSignUp_Object DemoSignUpTest;

    public void openHomePage() {
        DemoSignUpTest.openUrl("https://www.techlistic.com/p/selenium-practice-form.html");
    }


    public void InputName(String name) {
        DemoSignUpTest.inputname();

    }

    public void InputLastName(String last) {
        DemoSignUpTest.inputlastname();
    }

    public void ClickGenderRB() {
        DemoSignUpTest.clickgenderRB();
    }

    public void ClickExperienceRB() {
        DemoSignUpTest.clickexperienceRB();
    }

    public void EnterDate() {
        DemoSignUpTest.enterdate();
    }

    public void ClickProfessionCB() {
        DemoSignUpTest.clickprofessionCB();
    }

    public void ClickToolMultipleCB() {
        DemoSignUpTest.clicktoolmultipleCB();
    }

    public void ClickContinentSB() {
        DemoSignUpTest.clickcontinenSB();
    }

    public void ClickOptionSB() {
        DemoSignUpTest.clickoptionSB();
    }

    public void ClickMultipleCommandsMultipleSB() {
        DemoSignUpTest.clickcommandmultipleSB();
    }

    public void ClickMultipleSB() {
        DemoSignUpTest.clickmultipleSB();
    }

    public void UploadImage() {
        DemoSignUpTest.uploadimage();
    }

    public void ClickDownloadFile() {
    }

    public void ClickSubmitButton() {
    }

}
