package stepDefinations;

import org.testng.Assert;

import PageObject.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPageStepDefination {

	String landingPageproductName;
	String offerPageProductName;
	LandingPage landingPage;
	TestContextSetup testContextSetup;

	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage=testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingPage.getTitleOfthePage().contains("GreenKart")); ;
	}

	@When("^user searched with short name (.+) and extract actual name of product$")
	public void user_searched_with_short_name_and_extract_actual_name_of_product(String string) throws InterruptedException {
	   
	   landingPage.searchItem(string);
	   Thread.sleep(2000);
	   testContextSetup.landingPageproductName=landingPage.getProductName();
	   System.out.println(testContextSetup.landingPageproductName +" is extracted from Home page");
	}
	
	@When("Added {string} items of selected product to cart")
	public void added_items_of_selected_product_to_cart(String string) {
		landingPage.productIncrement(Integer.parseInt(string));
		landingPage.addToCart();
	}

}
