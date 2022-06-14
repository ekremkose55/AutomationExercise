@error_email

Feature: Login page
  Scenario: TC01 Launch browser
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Signup / Login' button
    When Verify 'New User Signup!' is visible
    When Enter name and already registered email address
    When Click 'Signup' button
    Then Verify error 'Email Address already exist!' is visible