Feature: Logout User

  @logoutUser
  Scenario Outline:
    Given user goes to the url "https://www.automationexercise.com"
    And user verify home page is visibly
    Then user click 'Signup/Login' button
    Then verify login to your account is visible
    And user enter correct email and password as "<emailAddress>" , "<password>"
    And user click login button
    Then verify Logged in as username
    When user click Logout button
    Then verify that user is navigated to login page
    Examples:
      |emailAddress         |password|
      |alexprit345@gmail.com|abc321  |