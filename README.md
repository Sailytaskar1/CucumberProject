# CucumberProject
Project description: Shopping cart 
Test case scenario1:User search for product in landing page and offer page and validate by matching product name in offer page with landing page for this test case I have created 
searchProduct feature file.
Test case scenario2: User adds product in cart. proceeds for shoooing bag. User has ability to enter promo code, for this test case I have created Checkout feature file.

I have created separet pages to maintain object repository and actions (LandingPage,OfferPage,CheckoutPage).
PageObjectManager is handling initialization of each object i.e LandingPage,OfferPage,CheckoutPage

Hooks file runs pre-requisite test cases like before/after method

TestBase file handles driver initialization 

TestContext file is for dependency injection using picoContainer dependancy 

GenericUtils files for common methods
