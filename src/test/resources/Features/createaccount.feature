@CreateAccount
Feature: As a End User I should able to Create Account in MyStore Application

@ValidEmail
Scenario: User Trying to Create Account with Valid Email Id
Given I am in MyStore Home Page
When I Enter "Valid" Email
Then I should see the Create Account Page
And I should able to Create an Account with "Valid" details
Then I should able to see the My Account Page