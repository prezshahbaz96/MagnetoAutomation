package PageFactoryElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverInitialization;

public class Magneto_CreateAccount {
	WebDriver driver;


	/*
	 * public Magneto_CreateAccount() { try { this.driver =
	 * DriverInitialization.initializeDriver(); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * PageFactory.initElements(driver, this); }
	 */


	@FindBy(xpath = "//span[@class='base' and text()='Create New Customer Account']")
	public WebElement pageTitle;

	public boolean isCreateAccountPageDisplayed() {
		return pageTitle.isDisplayed();
	}

}
