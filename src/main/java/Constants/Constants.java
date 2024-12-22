package Constants;

import java.io.File;

public class Constants {

	public static final String EXTENTREPORTPATH=System.getProperty("user.dir")+"\\ExtentReports\\index.html"; 
	public static final String JSONPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\config.json";
	public static final Integer IMPLICITWAIT=8;
	public static final Integer EXPLICITWAIT=8;
	public static final String SCREENSHOTPATH=System.getProperty("user.dir")+"\\Screenshots";
	public static final String TESTDATAPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	public static final String EXTENTCONFIGFILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\extentreport.xml";
	public static final String DOWNLOADFILEPATH=System.getProperty("user.dir")+"\\target\\Cucumberreports";
	public static final String CONFIGFILEPATH=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	
	public static final String ACPEXCELDATA=System.getProperty("user.dir")+"\\src\\main\\resources\\ACP_TESTING_DATA.xlsx";
	public static final String ARTIFACTS=System.getProperty("user.dir")+"\\target\\Cucumberreports\\artifacts\\";
	public static final String FAILEDTAGS=System.getProperty("user.dir")+"\\target\\Cucumberreports\\failedTags.xlsx";
	public static final String TESTSTUB=System.getProperty("user.dir")+"\\src\\main\\resources\\TestingStub\\";
	public static final String DEBUGFILE=System.getProperty("user.dir")+"\\target\\Cucumberreports\\artifacts\\Debug.txt";
	
	public static final String DRIVER=System.getProperty("user.dir")+"\\externalFiles\\chromedriver.exe";

	public static final String localDownload = System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "localDownload\\";


}