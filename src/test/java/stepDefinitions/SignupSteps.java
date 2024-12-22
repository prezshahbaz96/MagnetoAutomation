package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import PageFactoryElements.Magento_HomePage;
import PageFactoryElements.Magneto_CreateAccount;
import io.cucumber.java.en.*;
//import org.junit.Assert;


public class SignupSteps {

	Magento_HomePage homePage = new Magento_HomePage();
	Magneto_CreateAccount createAccount = new Magneto_CreateAccount();

	

	@Given("User opened {string} url")
	public void iAmOnTheHomePage(String url) {
		homePage.openUrl(url);	 
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page title is not displayed.");
        Assert.assertEquals(homePage.getHomePageTitle(), "Home Page", "Home Page title text does not match.");
    
	}
	
	@When("I click on the {string} link")
    public void iClickOnTheLink(String linkText) {
        if (linkText.equalsIgnoreCase("Create an Account")) {
            homePage.clickCreateAccount();
        } else {
            throw new IllegalArgumentException("Invalid link text: " + linkText);
        }
    }
	
	@Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String expectedPage) {
        if (expectedPage.equalsIgnoreCase("Create New Customer Account")) {
            boolean isDisplayed = createAccount.isCreateAccountPageDisplayed();
            Assert.assertTrue(isDisplayed, "The 'Create New Customer Account' page is not displayed!");
        } else {
            throw new IllegalArgumentException("Unexpected page: " + expectedPage);
        }
    }

	
	


}
