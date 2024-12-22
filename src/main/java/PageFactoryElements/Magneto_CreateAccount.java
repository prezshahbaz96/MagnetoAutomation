package PageFactoryElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverInitialization;

public class Magneto_CreateAccount {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	@FindBy(xpath = "//span[@class='base' and text()='Create New Customer Account']")
	public WebElement pageTitle;

	public boolean isCreateAccountPageDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Wait for the page title element to be visible
            wait.until(ExpectedConditions.visibilityOf(pageTitle));
            return pageTitle.isDisplayed();
        } catch (Exception e) {
            System.out.println("Page Title element not found: " + e.getMessage());
            return false;
        }
	}

}
