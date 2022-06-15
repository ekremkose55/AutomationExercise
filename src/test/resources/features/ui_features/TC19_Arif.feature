Feature: View Cart Brand Products

  @ViewBrandProducts
  Scenario: Login with incorrect credentials
    Given user goes to the url "https://www.automationexercise.com"
    Then user clicks on 'Products' button
    And verify that Brands are visible on left side bar
    Then user clicks on any brand name
    And verify that user is navigated to brand page and brand products are displayed
    Then on left side bar, user clicks on any other brand link
    And verify that user is navigated to that brand page and can see products

