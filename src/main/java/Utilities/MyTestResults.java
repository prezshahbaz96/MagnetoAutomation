package Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

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
	
	

	
}
