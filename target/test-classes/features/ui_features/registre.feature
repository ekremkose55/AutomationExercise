@registre
Feature: Login page
  Scenario: TC01 Launch browser
    Given Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    And Verify 'New User Signup!' is visible
    And Enter name and email address
    And Click 'Signup' button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible