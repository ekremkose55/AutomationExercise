Feature: Registration

  @UIregisteration
  Scenario Outline: Register new user
  Given user goes to the url "https://www.automationexercise.com"
  And user verify home page is visibly
  Then user click 'Signup/Login' button
  And user verify 'New User Signup!' is visible
  And user enter name and email as "<name>" , "<email>"
  Then user click Signup button
  And verify 'Enter Account Information' is visible
  And enter Title, Name, Email, Password, Date of Birth as "<title>" , "<name>" , "<email>" , "<password>" , "<day>" , "<month>" , "<year>"
  And user selects first checkbox
  Then user selects second checkbox
  And user fill details firstname,lastname,company,address1,address2,country,state,city,zipcode,mobile number as "<firstname>", "<lastname>" , "<company>" , "<address1>" , "<address2>" , "<country>" , "<state>" , "<city>" , "<zipcode>" , "<mobileNumber>"
  Then user click create account button
  Then verify 'Account created!" is visible
  And click continue button
  Then verify Logged in as username is visible
  When user click Delete Account button
  Then verify Account Deleted! is visible and click continue
 Examples:
 |name     |email                |title|password|day|month|year|firstname|lastname|company   |address1        |address2 |country|state|city  |zipcode     |mobileNumber|
 |Alex Prit|alexprit345@gmail.com|Mr  |abc321  |24 |July| 1996|Alex     |Prit    |Deeps Bank|60 grantbrook st|55 nepean|Canada |ON   |Ottawa|    35689   | 123456789  |
#   |name         |email                  |title|password|day|month|year|firstname|lastname|company   |address1        |address2 |country|state|city  |zipcode     |mobileNumber|
#   |Anna Karanina|annakaranina5@gmail.com|Mr  |abc321  |24 |July| 1996|Alex     |Prit    |Deeps Bank|60 grantbrook st|55 nepean|Canada |ON   |Ottawa|    35689   | 123456789  |



#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'New User Signup!' is visible
#  6. Enter name and email address
#  7. Click 'Signup' button
#  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#  9. Fill details: Title, Name, Email, Password, Date of birth
#  10. Select checkbox 'Sign up for our newsletter!'
#  11. Select checkbox 'Receive special offers from our partners!'
#  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#  13. Click 'Create Account button'
#  14. Verify that 'ACCOUNT CREATED!' is visible
#  15. Click 'Continue' button
#  16. Verify that 'Logged in as username' is visible
#  17. Click 'Delete Account' button
#  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
