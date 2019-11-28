package com.iLABWebsite.testCase;

import com.iLABWebsite.testCase.BaseClass;
import com.iLABWebsite.utilities.XLUtils;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iLABWebsite.pageObjects.HomePage;

public class TC_TesterApplicationTest_001 extends BaseClass {

	@Test(dataProvider = "Applicant")
	public void ApplicationTest(String name, String email) throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		logger.info("URL has been entered successfully");
		HomePage homepage = new HomePage(driver);
		
		Thread.sleep(3000);
		logger.info("User clicks on Careers link");
		homepage.clickCarrers();
		
		Thread.sleep(3000);
		scrollFunction(homepage.lnkSouthAfrica);
		
		Thread.sleep(3000);
		logger.info("User choose open positions in South Africa");
		homepage.clickSouthAfrica();
		
		Thread.sleep(3000);
		logger.info("User clicks on the first available vacancy");
		homepage.clickFirstOPening();
		
		Thread.sleep(3000);
		scrollFunction(homepage.lnkApplyNow);
		
		Thread.sleep(3000);
		logger.info("User clicks on apply now button");
		homepage.clickApplyNow();
		
		Thread.sleep(3000);
		logger.info("User enters his/her name");
		homepage.captureName(name);
		
		Thread.sleep(3000);
		logger.info("User capture email addrees");
		homepage.captureEmail(email);
		
		Thread.sleep(3000);
		logger.info("User enters phone number");
		homepage.capturePhoneNumber(generatePhoneNumber());
		
		Thread.sleep(3000);
		scrollFunction(homepage.btnSendApplication);
		
		Thread.sleep(3000);
		logger.info("User submit the application");
		homepage.clickSendApplication();
		
		if(homepage.getTextValidation().equals("You need to upload at least one file."))
		{
			Assert.assertTrue(true);
			logger.info("Application test case PASSED");
		}
		else
		{
			captureScreen(driver, "ApplicantTest");
			Assert.assertTrue(false);
			logger.info("Application test case FAILED");
		}
		
	}
	
	@DataProvider(name="Applicant")
	String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir") + "/src/test/java/com/iLABWebsite/testData/Applicant.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 0);
		
		String Applicant[][] = new String[rownum][colcount];
		
		
		  for(int i= 1; i<=rownum; i++) 
		  { 
			  for(int j =0; j< colcount; j++)
			  {
				  Applicant[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			  } 
		  }
		 
		
		return Applicant;
	}
	
}
