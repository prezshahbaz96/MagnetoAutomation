package Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
/*
**==========~~~~~~~~~~==========~~~~~~~~~~==========~~~~~~~~~~==========
*Author Name 		- DGovindhan
*Created on  		- 25-Dec-2019
*Description        - This implementation is for send email notification and future new implementation 
*Other Information 	- 
***==========~~~~~~~~~~==========~~~~~~~~~~==========~~~~~~~~~~==========
*/
public class MyTestResults {
	static int passed;
	static int failed;
	static int skipped;
	static int TotalTests;
	static Date startDate;
	static Date endDate;
	static String strPercentage;
	static int FeatureCount;

	public int getPassed() {
		return MyTestResults.passed;
	}

	public int getFailed() {
		return MyTestResults.failed;
	}

	public int getSkipped() {
		return MyTestResults.skipped;
	}

	public int getTotalTests() {
		TotalTests = MyTestResults.passed + MyTestResults.failed + MyTestResults.skipped;
		return (MyTestResults.passed + MyTestResults.failed + MyTestResults.skipped);
	}

	public void incrementPassed() {
		MyTestResults.passed++;
	}

	public void incrementFailed() {
		MyTestResults.failed++;
	}

	public void incrementSkipped() {
		MyTestResults.skipped++;
	}

	public void writeToTxtFile() throws IOException {
		File file = new File("target\\TestResult.txt");

		try (FileWriter fw = new FileWriter(file); BufferedWriter bWriter = new BufferedWriter(fw)) {
			bWriter.write("PASSED=" + MyTestResults.passed + "\n");
			bWriter.write("FAILED=" + MyTestResults.failed + "\n");
			bWriter.write("SKIPPED=" + MyTestResults.skipped + "\n");
			bWriter.write("TOTAL=" + this.getTotalTests() + "\n");
		}
	}

	public void writeToCSV() throws IOException {
		File file = new File("target\\TestResults.csv");
		try (FileWriter fw = new FileWriter(file); BufferedWriter bWriter = new BufferedWriter(fw)) {
			bWriter.write("PASSED," + MyTestResults.passed + "\n");
			bWriter.write("FAILED," + MyTestResults.failed + "\n");
			bWriter.write("SKIPPED," + MyTestResults.skipped + "\n");
			bWriter.write("TOTAL," + this.getTotalTests() + "\n");
		}
	}
	public void getPercentageOfPassCount() {
		strPercentage = new DecimalFormat("##.##").format(((float)MyTestResults.passed/(float)this.getTotalTests()*100));
		System.out.println("Total no of Test case passed Percentage - " + strPercentage);
	}
	
	/*public static String getFeatureFileNameFromScenarioId() {
	    String featureName = "Feature ";
	    Scenario txt = DriverIntialization.messageHandler;
	    String rawFeatureName2 = DriverIntialization.messageHandler.getId();
	    String rawFeatureName = DriverIntialization.messageHandler.getId().split("/")[3].replace("-"," ");
	    featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);

	    return featureName;
	}
	public void incrementFeatureCount() {
		MyTestResults.FeatureCount++;
	}*/

	
}
/*
 ** ==========~~~~~~~~~~==========~~~~~~~~~~==========~~~~~~~~~~==========
 ** Copyright (C) 2008-2019 Schlumberger,- All Rights Reserved Unauthorized
 * copying of this file, via any medium is strictly prohibited Proprietary and
 * confidential
 ** ==========~~~~~~~~~~==========~~~~~~~~~~==========~~~~~~~~~~==========
 */