Feature: Signup functionality

Scenario Outline: Sign up to application
Given User is at signup page
When user enter "<Name>" on signup page
When User select gender as "<Gender>" with weight as <Weight>
And User select slot number as <SlotNumber>
Then User is create

Examples:
|Name|Gender|Weight|SlotNumber|
|Anna|Female|55|101|
|Marry|Female|52|102|