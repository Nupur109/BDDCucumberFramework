Feature: Login Account functionality

Background:
Given User navigates to the application url
When User clicks on the Signup/login button
And User should be navigated to the login page


Scenario: User logins with invalid details  

When User enters invalid Email and Password in the login section
And User clicks on login button
Then Error message should be displayed

Scenario: User logins with valid details successfully 

When User enters valid Email and Password in the login section
And User clicks on login button
And User should be navigated to the homePage
And User should verify that Logged in as username is displayed