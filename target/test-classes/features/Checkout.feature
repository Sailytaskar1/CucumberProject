Feature: Place the order for the products
@CheckoutPage
Scenario Outline: Search experience for product search in both home and offer page
Given User is on GreenCart landing page
When user searched with short name <Name> and extract actual name of product
And Added "3" items of selected product to cart
Then user proceed to Checkout and validate items in checkout page
And verify user has ability to enter promo code and place order

Examples:
|Name|
|Tom|
