package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	@FindBy(how=How.XPATH, using="//*[@id='txtUsername']")	//username
	WebElement username;

	@FindBy(xpath="//*[@id='txtPassword']")			//password
	WebElement password;

	@FindBy(name="Submit")					//login button
	WebElement login_btn;
	
	WebDriver driver;
	
	public Login_Page(WebDriver driver){			//constructor for login page
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}							
												//methods for each webelement
	public void enterUsername(String uname){

		username.sendKeys(uname);

	}

	public void enterPassword(String pwd){

		password.sendKeys(pwd);

	}

	public void clickLogin(){

		login_btn.click();

	}


}
