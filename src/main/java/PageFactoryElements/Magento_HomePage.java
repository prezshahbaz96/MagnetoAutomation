package PageFactoryElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.DriverInitialization;

public class Magento_HomePage {
	   WebDriver driver;

	    
	    public Magento_HomePage() {
	        try {
				this.driver = DriverInitialization.initializeDriver();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        PageFactory.initElements(driver, this); 
	    }
	    
	    @FindBy(xpath = "//span[@class='base' and text()='Home Page']")
	    private WebElement homePageTitle;

	    public String getHomePageTitle() {
	        return homePageTitle.getText();
	    }

	    public boolean isHomePageDisplayed() {
	        return homePageTitle.isDisplayed();
	    }
	    
	    public void openUrl(String url) {
	    	driver.get(url);
	    }

	    
	    
}
