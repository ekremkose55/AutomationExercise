@delete_account_verify
Feature: Account delete verify
  Scenario: TC23 User account delete verify
    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    When Click on 'Signup / Login' button
    When Fill all details in Signup and create account
    When Verify 'ACCOUNT CREATED!' and click 'Continue' button
    When Verify ' Logged in as username' at top
    When Add products to cart
    When Verify that cart page is displayed
    When Click Proceed To Checkout
    When Verify that the delivery address is same address filled at the time registration of account
    When Verify that the billing address is same address filled at the time registration of account
    When Users Click 'Delete Account' button
    Then User Verify 'ACCOUNT DELETED!' and click 'Continue' button
