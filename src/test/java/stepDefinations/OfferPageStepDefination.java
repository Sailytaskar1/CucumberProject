package stepDefinations;

import org.testng.Assert;
import PageObject.LandingPage;
import PageObject.OfferPage;
import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class OfferPageStepDefination {
	
	String landingPageproductName;
	String offerPageProductName;
	TestContextSetup testContextSetup;
	
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@Then("^user go an search for the (.+) short name in offer page$")
	public void user_go_an_search_for_the_same_short_name(String shortName) throws InterruptedException {
		SwitchToOfferPage();
		OfferPage offerPage=testContextSetup.pageObjectManager.getOfferPage();		
		offerPage.searchItem(shortName);			
		Thread.sleep(2000);
		offerPageProductName=offerPage.getProductName();
		System.out.println(offerPageProductName +" is extracted from offer page");

	}
	
	@Then("Validate Product name in offer page matches with Landing page")
	public void Validate_Product_name_in_offer_page_matches_with_Landing_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageproductName);
	}
	
	public void SwitchToOfferPage() {
		LandingPage landPage=testContextSetup.pageObjectManager.getLandingPage();
		landPage.SelectTopDeals();
		testContextSetup.genericUtils.SwitchToChildWindow();
	}

}



