package stepDefinations;

import org.testng.Assert;

import PageObject.CheckoutPage;
import PageObject.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {

	public String landingPageproductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;

	public CheckoutPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("user proceed to Checkout and validate items in checkout page")
	public void user_proceed_to_checkout_and_validate_the_items_in_checkout_page() {
		checkoutPage.CheckoutItems();
	
	}
	
	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_order() {
		
		Assert.assertTrue(checkoutPage.VerifyPromobutton());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrderButton());
	}
	
	


}
