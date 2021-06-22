package com.google.FramWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends PageBase {

	public RegPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")
	WebElement FirstName;

	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")
	WebElement SecondName;
	

	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")
	WebElement ConfirmEmail;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")
	WebElement UserName;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")
	WebElement Password;
	
	@FindBy(id="datepicker")
	WebElement BirthDate;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
	WebElement BackButton;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")
	WebElement Day;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")
	WebElement Phone;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")
	WebElement Address;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[10]/div/div/input")
	WebElement City;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/select")
	WebElement State;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/select/option[48]")
	WebElement Area;

	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[12]/div/div/input")
	WebElement ZipCode;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[14]/div/button")
	WebElement RegBt;

	
	
	
	public void RegMethod(String firstname, String secondname , String email , String confirmemail , String username , String pass , String phone , String address , String city, String zipcode) throws InterruptedException
	{
			FirstName.sendKeys(firstname);
			Thread.sleep(1000);
			
			SecondName.sendKeys(secondname);
			Thread.sleep(1000);
			
			Email.sendKeys(email);
			Thread.sleep(1000);
			
			ConfirmEmail.sendKeys(confirmemail);
			Thread.sleep(1000);
			
			UserName.sendKeys(username);
			Thread.sleep(1000);
			
			Password.sendKeys(pass);
			Thread.sleep(1000);
			
			BirthDate.click();
			Thread.sleep(1000);
			
			for (int i = 0; i < 10; i++){
				 //click the button
				  BackButton.click();
				 //wait 1 seconds
				  Thread.sleep(100);
				  //check that data is being generated correctly
				}
			Thread.sleep(1000);
			Day.click();
			Thread.sleep(1000);
			
			Phone.sendKeys(phone);
			Thread.sleep(1000);
			
			Address.sendKeys(address);
			Thread.sleep(1000);
			
			City.sendKeys(city);
			Thread.sleep(1000);
			
			State.click();
			Thread.sleep(1000);
			
			Area.click();
			Thread.sleep(1000);
			
			ZipCode.sendKeys(zipcode);
			Thread.sleep(1000);
			
			RegBt.click();
		
			
	}
}
