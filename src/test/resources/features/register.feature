Feature: User registration or sign up

Scenario: Register a user with valid details
Given User navigates to the application url
When User clicks on the Signup/login button
And User should be navigated to the login page
And User enters Name and email in the Sign up section
And User clicks on the signup button
And User should be on the Signup page
And User enters the Account Information
And User selects the Title, Date Of Birth, Checkboxes and Country
And User clicks on Create Account button	
Then Verify Account created page is displayed
