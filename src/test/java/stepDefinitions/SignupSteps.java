package stepDefinitions;

import Utilities.DriverInitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import PageFactoryElements.Magento_HomePage;
import io.cucumber.java.en.*;
//import org.junit.Assert;


public class SignupSteps {

	Magento_HomePage homePage = new Magento_HomePage();
	

	@Given("User opened {string} url")
	public void iAmOnTheHomePage(String url) {
		homePage.openUrl(url);	 
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home Page title is not displayed.");
        Assert.assertEquals(homePage.getHomePageTitle(), "Home Page", "Home Page title text does not match.");
    
	}



}
