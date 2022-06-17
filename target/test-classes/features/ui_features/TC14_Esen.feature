@TC14
Feature: TC14

  Scenario:
    Given Launch browser Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible 'Automation Exercise' successfully
    Then Verify that home page is visible successfully
    When Add 1 product to cart
    When User Click 'Continue Shopping' button
    And Add 2 product to cart
    When User Click 'Continue Shopping' button
    And Add 3 product to cart
    And User Click 'View Cart' button
    And Verify that 'Checkout' is displayed
    And Click Proceed To Checkout
    And Click 'Register / Login' button in the Checkout page
    And Fill all details in Signup and create account in the Checkout page
    When Verify 'ACCOUNT CREATED!' and click 'Continue' button in the Checkout Page
    And Verify Logged in as username at top
    And User Click ' Cart' button
    And Click Proceed To Checkout
    Then Verify 'Address Details' and 'Review Your Order'
    When Enter description in comment text area and click 'Place Order'
    And Enter payment details: 'Name on Card', 'Card Number', 'CVC', 'Expiration date'
    And Click 'Pay and Confirm Order' button in the payment page
    And Verify success message 'Your order has been placed successfully!'
    And User Click 'Delete Account' button in the payment page
    Then User Verify 'ACCOUNT DELETED!' and click 'Continue' button
    Then close the WebPage

