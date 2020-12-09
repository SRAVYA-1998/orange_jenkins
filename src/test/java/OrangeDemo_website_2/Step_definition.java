package OrangeDemo_website_2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.Login_Page;
import com.pages.PIM_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_definition {
	WebDriver driver = null;
	Login_Page loginpg;
	PIM_Page pimPg;
	
	@Given("^User is on OrangeHRM login page$")
	public void user_is_on_OrangeHRM_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpg = new Login_Page(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("User is on OrangeHRM login page");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		loginpg.enterUsername(arg1);
		loginpg.enterPassword(arg2);
		Thread.sleep(1000);
		System.out.println("User enters username and password");
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
		loginpg.clickLogin();
		System.out.println("User clicks on login");
	}

	@Then("^User should be able to see alert message as Invalid Credentials$")
	public void user_should_be_able_to_see_alert_message_as_Invalid_Credentials() throws Throwable {
		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		if(title.contentEquals("Invalid credentials")) System.out.println("******Title Matched");
		else System.out.println("*****Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		System.out.println("User should be able to see alert message as Invalid Credentials");
		driver.close();
	}

	@When("^User leaves username blank$")
	public void user_leaves_username_blank() throws Throwable {
		loginpg.enterUsername("");
		loginpg.enterPassword("admin123");  
		System.out.println("User leaves username blank");
	}

	@When("^Clicks the button$")
	public void clicks_the_button() throws Throwable {
		loginpg.clickLogin();
	    System.out.println("Clicks the button");
	}

	@Then("^User should be able to see username alert message$")
	public void user_should_be_able_to_see_username_alert_message() throws Throwable {
		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		if(title.contentEquals("Username cannot be empty")) System.out.println("******Title Matched");
		else System.out.println("*****Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		System.out.println("User should be able to see username alert message");
		driver.close();

	}

	@When("^User leaves password blank$")
	public void user_leaves_password_blank() throws Throwable {
		loginpg.enterUsername("Admin");
		loginpg.enterPassword("");
	    System.out.println("User leaves password blank");
	}

	@When("^Clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		loginpg.clickLogin();
	    System.out.println("Clicks the login button");
	}

	@Then("^User should be able to see password alert message$")
	public void user_should_be_able_to_see_password_alert_message() throws Throwable {
		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		if(title.contentEquals("Password cannot be empty")) System.out.println("******Title Matched");
		else System.out.println("*****Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		System.out.println("User should be able to see password alert message");
	    driver.close();

	}

	@When("^User leaves username and password fields blank$")
	public void user_leaves_username_and_password_fields_blank() throws Throwable {
		loginpg.enterUsername("");
		loginpg.enterPassword("");
	    System.out.println("User leaves username and password fields blank");

	}

	@Then("^User should be able to see alert message$")
	public void user_should_be_able_to_see_alert_message() throws Throwable {
		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		if(title.contentEquals("Username cannot be empty")) System.out.println("******Title Matched");
		else System.out.println("*****Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		System.out.println("User should be able to see alert message");
		driver.close();

	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		loginpg.enterUsername("Admin");
	    loginpg.enterPassword("admin123");
	    System.out.println("User enters username and password");

	}

	@Then("^User is navigated to Dashboard page$")
	public void user_is_navigated_to_Dashboard_page() throws Throwable {
		System.out.println("User is navigated to Dashboard page");
	    driver.close();

	}

	@Given("^User is on Dashboard page$")
	public void user_is_on_Dashboard_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpg = new Login_Page(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		loginpg.enterUsername("Admin");
		loginpg.enterPassword("admin123");
		loginpg.clickLogin();
		pimPg = new PIM_Page(driver);
		pimPg.checkDashboardIsDisplayed();

	}

	@When("^User is navigated to PIM Module$")
	public void user_is_navigated_to_PIM_Module() throws Throwable {
		pimPg.clickPimModule();
		
	}

	@When("^User clicks on Optional feilds module in Configuration Module$")
	public void user_clicks_on_Optional_feilds_module_in_Configuration_Module() throws Throwable {
		pimPg.clickconfiguration();
		pimPg.clickoptional();

	}

	@Then("^User can view the Configure PIM Module$")
	public void user_can_view_the_Configure_PIM_Module() throws Throwable {
		System.out.println("User can view the Configure PIM Module");
		driver.close();
	}

	@When("^User clicks on Custom feilds module in Configuration Module$")
	public void user_clicks_on_Custom_feilds_module_in_Configuration_Module() throws Throwable {
		pimPg.clickconfiguration();
		pimPg.clickcustom();
	}

	@Then("^User can view the Defined Custom Fields$")
	public void user_can_view_the_Defined_Custom_Fields() throws Throwable {
		String title=driver.findElement(By.xpath("//*[@id='customFieldListPane']/div[1]/h1")).getText();
		if(title.contentEquals("Defined Custom Fields")) System.out.println("Title Matched");
		else System.out.println("Title NOT Matched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		System.out.println("User can view the Defined Custom Fields");
		driver.close();
	}

	@Then("^User can view details of all employees$")
	public void user_can_view_details_of_all_employees() throws Throwable {
		System.out.println("User can view details of all employees");
		Thread.sleep(1000);
		driver.close();
	}

	@Then("^User clicks Add Employee in PIM Module$")
	public void user_clicks_Add_Employee_in_PIM_Module() throws Throwable {
		pimPg.clickaddEmployee();

	}

	@Then("^User should be able to add details of new employee$")
	public void user_should_be_able_to_add_details_of_new_employee() throws Throwable {
		pimPg.enterfirstname("sweety");
		pimPg.entermiddlename("s");
		pimPg.enterlastname("sirlapu");
		pimPg.clickCheckBox();
		pimPg.enterUserName("ssravya");
		pimPg.enterPassWord("7995365351");
		pimPg.enterConfirmPassword("7995365351");
		pimPg.clickSave();
		Thread.sleep(1000);
		driver.close();

	}

	@Then("^User clicks on Reports in PIM Module$")
	public void user_clicks_on_Reports_in_PIM_Module() throws Throwable {
		pimPg.clickReports();
		pimPg.enterReportsName("PIM Sample Report");
		Thread.sleep(3000);
	}

	@Then("^User searches for Employee reports$")
	public void user_searches_for_Employee_reports() throws Throwable {
		pimPg.clickSearch();
		Thread.sleep(2000);
		driver.close();

	}

	@When("^User clicks on My Info Module$")
	public void user_clicks_on_My_Info_Module() throws Throwable {
		pimPg.clickMyInfo();

	}

	@Then("^User Should be able view his personal details$")
	public void user_Should_be_able_view_his_personal_details() throws Throwable {
		System.out.println("User Should be able view his personal details");
		driver.close();
	}

	@Given("^User is on OrangeHRM login page to enter data of employee$")
	public void user_is_on_OrangeHRM_login_page_to_enter_data_of_employee() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpg = new Login_Page(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("User is on OrangeHRM login page");
 
	}

	@When("^User enters username and password of the employee$")
	public void user_enters_username_and_password_of_the_employee() throws Throwable {
		loginpg.enterUsername("ssravya");
		loginpg.enterPassword("7995365351");
	}

	@Then("^User clicks on login and is navigated to Dashboard page$")
	public void user_clicks_on_login_and_is_navigated_to_Dashboard_page() throws Throwable {
		loginpg.clickLogin();

	}

	@Then("^User clicks on My Info Module and can view his personal details only$")
	public void user_clicks_on_My_Info_Module_and_can_view_his_personal_details_only() throws Throwable {
		pimPg = new PIM_Page(driver);
		pimPg.clickMyInfo();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^User should clicks on Logout in Welcome Menu$")
	public void user_should_clicks_on_Logout_in_Welcome_Menu() throws Throwable {
		pimPg.clickWelcomeMenu();
		pimPg.clickLogout();
	}

	@Then("^User should be able to see OrangeHRM Login Page$")
	public void user_should_be_able_to_see_OrangeHRM_Login_Page() throws Throwable {
		System.out.println("User should be able to see OrangeHRM Login Page");
		driver.close();
	}

	

}
