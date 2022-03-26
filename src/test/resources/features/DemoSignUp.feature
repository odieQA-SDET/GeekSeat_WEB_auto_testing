@AutomationPracticeForm
Feature: As tester feature Access a Demo Sign-Up Selenium Automation Practice Form in techlistic.com
  Visit the following website https://www.techlistic.com/p/selenium-practice-form.html
  create an automation testing for the Form of Demo Sign-Up
  So that I can know some features of techlistic.com


    Scenario: Access a Demo Sign-Up Selenium Automation Practice Form in techlistic.com
    Given I was on the homepage of techlistic.com
    When I clicked textbox to Enter first name and Enter last name
    And I selected gender (radio button)
    And I selected years of experience (radio button)
    And I entered the date
    And I selected Profession (Checkbox)
    And I selected Automation tools you are familiar with (multiple checkboxes)
    And I selected Continent (Select box)
    And I selected multiple commands from a multi select box
    And I handled Upload image
    And I clicked on Download file link and handle the download file pop-up
    Then I Click on 'Submit' button

