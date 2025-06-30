Feature: Sending email campaign
Scenario: Create campaign
Given User should be at campaign page
When user clicks on create campaign button
And user enters the information
Then campaign should get created

Scenario: update campaign
Given User should be at campaign page
When user updates the details
Then campaign should get updated

Scenario: Delete campaign
Given User should be at campaign page
When user click on delete button
Then campaign should get deleted
