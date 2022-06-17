#@smokeTest
Feature: TC15

<<<<<<< HEAD
=======

>>>>>>> master
  Scenario Outline:
    Given Launch browser Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    And User Click ' Signup / Login' button
    Then Fill all details in Signup and create account
    Then Verify 'ACCOUNT CREATED!' and click 'Continue' button
    Then Verify "<Name>" at top
    And Add products to cart
    Then Click 'View Cart' button Verify that cart page is displayed
    Then Click Proceed To Checkout Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    Then Enter payment details: "<NameCard>","<CardNumber>","<cvc>", "<ExpirationDate>", "<ExpirationYear>"
    Then User Click Pay and Confirm Order button
    And Verify success message 'Your order has been placed successfully!'
    And User Click 'Delete Account' button in the payment page
    Then User Verify 'ACCOUNT DELETED!' and click 'Continue' button


  Examples:
    | NameCard      | CardNumber      | cvc | ExpirationDate | ExpirationYear | Name |
    | Mike Williams | 123456789123456 | 123 | 12             | 2025           | accountName |








#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Signup / Login' button
#5. Fill all details in Signup and create account
#6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#7. Verify ' Logged in as username' at top
#8. Add products to cart
#9. Click 'Cart' button
#10. Verify that cart page is displayed
#11. Click Proceed To Checkout
#12. Verify Address Details and Review Your Order
#13. Enter description in comment text area and click 'Place Order'
#14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#15. Click 'Pay and Confirm Order' button
#16. Verify success message 'Your order has been placed successfully!'
#17. Click 'Delete Account' button
#18. Verify 'ACCOUNT DELETED!' and click 'Continue' button