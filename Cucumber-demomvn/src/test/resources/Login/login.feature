Feature: To Validate Login Application

Scenario: To Validate Login Application with Valid credentials

Given If User is on login screen 

When User enters name "Admin" 

And User enters password "admin123"

And click on Submit

Then I should see user name "Welcome Paul"
