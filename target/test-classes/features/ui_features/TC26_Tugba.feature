Feature: TC26

  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given user goes to the url "https://www.automationexercise.com"
    Then user verify home page is visibly
    And user scroll down the page
    Then verify 'Subscription' visibility
    When user scroll up the page
    Then verify 'Full-Fledged practice website for Automation Engineers' text





