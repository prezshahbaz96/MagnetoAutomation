package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Properties;

public class DriverInitialization {
	private static final Logger logger = LogManager.getLogger(DriverInitialization.class);
	private static Properties properties;
	private static  WebDriver driver;


	// Initialize WebDriver based on config.properties
	public static WebDriver initializeDriver() throws Exception {

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\externalFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		maximizeWindow();
		setImplicitWait(Duration.ofSeconds(10));
		return driver;
	}

		// Set implicit wait
	private static void setImplicitWait(Duration duration) {
		driver.manage().timeouts().implicitlyWait(duration);
	}

	// Maximize browser window
	private static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// Close the WebDriver
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
		
		}
	}
}
