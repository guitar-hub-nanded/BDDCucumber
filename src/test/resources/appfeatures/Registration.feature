Feature: Opening bank account
Scenario: Opening Bank Account by considering nominee information
Given User is at the accounts page
When  User enters the following data
| name | lastname | email | phone |
| Erin | Smith | erin.smith@gmail.com | 9876787654 |
| Robert | Jackson | robert.jackson@gmail.com | 7866547867 |
| ALex | Johnson | alex.jhonson@gmail.com | 9876876578|
And user clicks on submit button
Then user should get confirmed
