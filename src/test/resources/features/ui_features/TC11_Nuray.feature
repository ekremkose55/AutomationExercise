Feature:US011

  Scenario:Verify Subscription in Cart page

   Given Launch browser Navigate to url 'http://automationexercise.com'
   Then User Verify that home page is visible 'Automation Exercise' successfully
   And User Click ' Cart' button
   Then Scroll down to footer
   Then Verify text 'SUBSCRIPTION'
  And Enter email address in input and click arrow button
   Then Verify success message 'You have been successfully subscribed!' is visible



















#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Cart' button
#5. Scroll down to footer
#6. Verify text 'SUBSCRIPTION'
#7. Enter email address in input and click arrow button
#8. Verify success message 'You have been successfully subscribed!' is visible