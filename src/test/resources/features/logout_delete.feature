Feature: Delete Account functionality

Background:
Given User navigates to the application url
When User clicks on the Signup/login button
And User enters valid Email and Password in the login section
And User clicks on login button
And User should be navigated to the homePage


Scenario: User logout from the account created

When User clicks on Logout Account button
Then User should be navigated to the login page
And Sigup/Login button should be displayed


Scenario: User deletes the account created

When User clicks on Delete Account button
Then User should be deleted and navigated to Account deleted page
And User should verify ACCOUNT DELETED! is displayed on the page