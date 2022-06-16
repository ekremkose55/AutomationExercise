Feature: Login with incorrect credentials

  @incorrectVerify
  Scenario: Login with incorrect credentials
    Given user goes to the url "https://www.automationexercise.com"
    And user verify home page is visibly
    Then user click 'Signup/Login' button
    Then verify login to your account is visible
    Then user enters incorrect email and password as "<Email>" and "<Password>"
    Then user click login button
    Then verify error Your email or password is incorrect! is visible
