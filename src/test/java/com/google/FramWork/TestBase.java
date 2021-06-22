package com.google.FramWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	protected WebDriver driver;
	
	public void openChrome(String url)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup(); // حيروح يشوف الكروم المناسب لجهازي ويسطبه ويشتغل عليه بدل ما كنت بتحطه في الفولدر
		driver = new ChromeDriver();
		driver.navigate().to(url);
	}

}
