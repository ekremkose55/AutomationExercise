@contactUs_verify @wip
Feature: Contact Us Form
  Scenario: TC06 Contact Us Form
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Contact Us' button
    When Verify 'GET IN TOUCH' is visible
    When Enter name, email, subject and message
<<<<<<< HEAD
#    When Upload file
    When Click 'Submit' button sign
    When Users Click OK button
=======
    When Upload file
    When Click 'Submit' button
    When Click OK button
>>>>>>> master
    When Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then Click 'Home' button and verify that landed to home page successfully

