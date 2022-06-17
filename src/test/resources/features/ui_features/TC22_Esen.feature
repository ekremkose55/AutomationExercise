@TC22

  Feature: TC22
    Scenario: Add to cart from Recommended items
      Given Launch browser Navigate to url 'http://automationexercise.com'
      When Scroll to bottom of page
      And Verify 'RECOMMENDED ITEMS' are visible
      And Click on 'Add To Cart' on Recommended product
      And User Click 'View Cart' button
      Then Verify that product is displayed in cart page
      Then close the WebPage




