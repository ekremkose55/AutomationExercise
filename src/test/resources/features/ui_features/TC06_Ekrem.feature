@contactUs_verify
Feature: Contact Us Form
  Scenario: TC06 Contact Us Form
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When User Click on 'Contact Us' button
    When User Verify 'GET IN TOUCH' is visible
    When Enter name, email, subject and message
    When Upload file
    When User Click 'Submit' button
    When Click OK button
    When Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then Click 'Home' button and verify that landed to home page successfully

