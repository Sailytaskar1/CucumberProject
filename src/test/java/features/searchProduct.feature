Feature: Search and place the order for the products
@OffersPage
Scenario Outline: Search experience for product search in both home and offer page
Given User is on GreenCart landing page
When user searched with short name <Name> and extract actual name of product
Then user go an search for the <Name> short name in offer page 
And Validate Product name in offer page matches with Landing page

Examples:
|Name|
|Tom|
|Beet|