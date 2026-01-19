Feature: Check Title of the application

Background:
Given Open the browser
When User enters the URL

@smoke
Scenario: Check Logo
Then User verifies the title "Smartbazaar - Home"

@system
Scenario Outline:
And User enters the data "<searchData>" of the product
Then User verifies the product name "<product>"
Then User verifies the result
Examples:
|searchData|product|
|Rice|Kerala Taste Ghee Rice (2kg)|