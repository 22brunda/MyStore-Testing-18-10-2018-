@MyStore
Feature: As a End User I should able to purchase dress material in MyStore Application

@ValidSignin
Scenario: User Trying to Login to the MyStore Application
Given I am on MyStore Home Page
When I Enter "Valid" Email and Password
Then I should able to see the MyAccount Page

@InvalidEmail
Scenario: User Trying to Login to MyStore Application
Given I am on MyStore Home Page
When I Enter "InvalidEmail" and Valid Password
Then Verified validation for Message "Invalid email address."

@InvalidPassword
Scenario: User Trying to Login to MyStore Application
Given I am on MyStore Home Page
When I Enter Valid Email and "InvalidPassword"
Then Verified validation for Message "Authentication failed."

@BlankEmail
Scenario: User Trying to Login to MyStore Application
Given I am on MyStore Home Page
When I Enter "BlankEmail" and valid Password
Then Verified validation for Message "An email address required."

@BlankPassword
Scenario: User Trying to Login to MyStore Application
Given I am on MyStore Home Page
When I Enter valid Email and "BlankPassword"
Then Verified validation for Message "Password is required."

 