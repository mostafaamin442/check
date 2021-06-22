package com.google.FramWork;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.ExcelDataReader;

public class RegTest extends TestBase {
	
	@DataProvider(name="data")
	public Object[][] getTestData() throws IOException
	{
		ExcelDataReader obj = new ExcelDataReader();
		return obj.getExcelData();
	}
	
	@BeforeTest
	public void openBrowser()
	{
		openChrome("https://www.performancetestingpractice.com/register.php");
	}
	
	@Test(dataProvider="data")
	public void testReg(String firstname, String secondname , String email , String confirmemail , String username , String pass , String phone , String address , String city, String zipcode) throws InterruptedException
	{
		RegPage RegObj = new RegPage(driver); 
		RegObj.RegMethod(firstname, secondname , email , confirmemail, username  , pass, phone ,address,city,zipcode);
		
		assertEquals("User / email id not available. Please try another", "User / email id not available. Please try another");

	}  
	
	@AfterTest
	public void CloeDriver() throws InterruptedException  
	{
		Thread.sleep(9000);
		driver.close();
	}
	
	}

