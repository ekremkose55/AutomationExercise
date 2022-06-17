@category_page_verify
Feature: Contact Us Form
  Scenario: TC06 Contact Us Form
    Given Navigate to url 'http://automationexercise.com'
    When Verify that categories are visible on left side bar
    When Click on 'Women' category
    When Click on any category link under 'Women' category, for example: Dress
    When Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    When On left side bar, click on any sub-category link of 'Men' category
    Then Verify that user is navigated to that category page



