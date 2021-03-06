@categoryTest
Feature: Verify category page
  Scenario: TC18 User verify category page
    Given Navigate to url 'http://automationexercise.com'
    When Verify that categories are visible on left side bar
    When Click on 'Women' category
    When Click on any category link under 'Women' category, for example: Dress
    When Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    When On left side bar, click on any sub-category link of 'Men' category
    Then Verify that user is navigated to that category page



