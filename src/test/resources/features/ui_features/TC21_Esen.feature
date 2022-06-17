@TC21

  Feature: TC21

    Scenario: Add review on product
      Given Launch browser Navigate to url 'http://automationexercise.com'
      When Click on 'Products' button in the homepage
      And Verify user is navigated to ALL PRODUCTS page successfully
      And User Click on 'View Product' button in the products page
      Then Verify 'Write Your Review' is visible in the products page
      When Enter 'name', 'email' and 'review'
      And Click 'Submit' button in the product page
      Then Verify success message 'Thank you for your review.' in the product page
      Then close the WebPage