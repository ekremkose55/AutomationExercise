@error_email

Feature: Register User with existing email
  Scenario: TC05 Register User with existing email
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Signup / Login' button
    When Verify 'New User Signup!' is visible
    When Enter name and already registered email address
    When Click 'Signup' button
    Then Verify error 'Email Address already exist!' is visible

@contactUs_verify
Feature: Contact Us Form
  Scenario: TC06 Contact Us Form
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Contact Us' button
    When Verify 'GET IN TOUCH' is visible
    When Enter name, email, subject and message
    When Upload file
    When Click 'Submit' button
    When Click OK button
    When Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then Click 'Home' button and verify that landed to home page successfully




