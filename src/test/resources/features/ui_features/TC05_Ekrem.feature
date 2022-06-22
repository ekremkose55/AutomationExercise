@verifytest

Feature: Register User with existing email
  Scenario: TC05 Register User with existing email
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Signup / Login' button
    When Verify 'New User Signup!' is visible
    When Enter name and already registered email address
    When Click 'Signup' button
    Then Verify error 'Email Address already exist!' is visible



