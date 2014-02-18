Feature: Developer creates an App
As a developer of an organization
I want to create a new App
Which can be used by end Users

Scenario Outline:Developer has access to API matrix
Given the developer has logged in the API matrix
And the user is on My Apps Page
When the developer clicks on create a new App
And enters the app name <app name>
And enters the app description <description>
And enters the callback url <callback URL>
And clicks on Register App
Then a new app is created
And a valid key is displayed
And a valid secret is displayed

Examples:
|app name    |description|callback URL         |
|dt_test_apprandomnumber999|testapp    |http://www.google.com|