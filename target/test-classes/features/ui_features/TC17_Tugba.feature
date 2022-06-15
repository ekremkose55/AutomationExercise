Feature: TC17

  Scenario:Remove Products from cart
    Given user goes to the url "https://www.automationexercise.com"
    Then user verify home page is visibly
    And user click Products button
    And user add product to cart
    Then verify cart page displayed
    When user click 'X' button to the particular product
   Then verify product is removed from cart









