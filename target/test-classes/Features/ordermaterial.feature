@OrderMaterial
Feature: As a End User I should able to Order product in MyStore Application

Background: User able to login
Given I am on MyStore Home Page
When I Enter "Valid" Email and Password
Then I should able to see the MyAccount Page

@OrderProduct
Scenario:
When I click on women tab
Then I should see the option to select dress type
And I add the selected dress to the cart
Then I should see the successfull message with proceding to checkout