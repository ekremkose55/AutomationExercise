Feature: Login with valid credentials

  Scenario Outline:
    Given user goes to the url "https://www.automationexercise.com"
    And user verify home page is visibly
    Then user click 'Signup/Login' button
    Then verify login to your account is visible
    And user enter correct email and password as "<emailAddress>" , "<password>"
    And user click login button
    Then verify Logged in as username
    When user click Delete Account button
    Then verify Account Deleted! is visible
  Examples:
  |emailAddress         |password|
  |alexprit345@gmail.com|abc321  |

#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'Login to your account' is visible
#6. Enter correct email address and password
#7. Click 'login' button
#8. Verify that 'Logged in as username' is visible
#9. Click 'Delete Account' button
#10. Verify that 'ACCOUNT DELETED!' is visible