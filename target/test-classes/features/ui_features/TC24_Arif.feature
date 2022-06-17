Feature: Download Invoice After Purchase Order

  @downloadInvoice
  Scenario Outline: User Downloads Invoice
    Given user goes to the url "https://www.automationexercise.com"
    And user verify home page is visibly
    Then user adds products to cart
    And User Click ' Cart' button
    Then verify that cart page is displayed
    And user clicks Proceed To Checkout
    Then user clicks 'Register / Login' button
    And user enters name and email as "<name>" , "<email>"
    Then user click Signup button
    And user enter Title, Name, Email, Password, Date of Birth as "<title>" , "<name>" , "<email>" , "<password>" , "<day>" , "<month>" , "<year>"
    And user selects first checkbox
    Then user selects second checkbox
    And user fills details firstname,lastname,company,address1,address2,country,state,city,zipcode,mobile number as "<firstname>", "<lastname>" , "<company>" , "<address1>" , "<address2>" , "<country>" , "<state>" , "<city>" , "<zipcode>" , "<mobileNumber>"
    Then user click create account button
    Then verify 'Account created!" is visible
    And click continue button
    Then verify Logged in as username is visible
    And User Click ' Cart' button
    And user clicks Proceed To Checkout
    Then verify Address Details and Review Your Order
    And user enters description in comment text area and click 'Place Order'
    Then user enters payment details: Name on Card, Card Number, CVC, Expiration date
    And user clicks Pay and Confirm Order button
    Then verify success message 'Your order has been placed successfully!'
    And user clicks 'Download Invoice' button and verify invoice is downloaded successfully.
    Then user clicks 'Continue' button
    When user click Delete Account button
    Then verify Account Deleted! is visible and click continue


    Examples:
      |name    |email            |title|password|day|month|year|firstname|lastname|company   |address1        |address2 |country|state|city  |zipcode     |mobileNumber|
      |Arif Gun|arifgun32233@gmail.com|Mr   |abc321  |24 |July| 1996|Arif     |Gun     |Ifix      |60 grantbrook st|55 nepean|Canada |ON   |Ottawa|    35689   | 123456789  |
