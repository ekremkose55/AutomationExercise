@TC13
Feature: TC13

  Scenario: Verify Product Quantity in Cart
    Given Launch browser Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible 'Automation Exercise' successfully
    And Click View Product for any product on home page
    And Verify 'product_details/1' is opened
    When Increase quantity to 4
    Then Click 'Add to cart' button in the Product Details Page
    And Click 'View Cart' button in Product Details Page
    Then Verify that product is displayed in cart page with exact quantity
    Then close the WebPage

