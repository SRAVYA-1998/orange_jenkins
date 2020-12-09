package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PIM_Page {
	@FindBy(id="menu_dashboard_index")             			//dashBoard
	//@CacheLookup
	WebElement dasboard;
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")		//PIM Module
	//@CacheLookup
	WebElement pim;

	@FindBy(how=How.XPATH, using="//*[@id='menu_pim_Configuration']")
	//@CacheLookup											//configuration module
	WebElement config; 

	@FindBy(xpath="//*[@id='menu_pim_configurePim']")		//optional fields in configure fields
	//@CacheLookup
	WebElement optfields;

	@FindBy(id="menu_pim_listCustomFields")					//custom fields in configure fields
	//@CacheLookup
	WebElement cusfields;

	@FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']")	//employee list module
	//@CacheLookup
	WebElement emplist;

	@FindBy(id="menu_pim_addEmployee")						//add employee module
	//@CacheLookup
	WebElement addemp;
	
				//webelements for "Add Employee" Module
	
	
	@FindBy(name="firstName")								//firstname
	//@CacheLookup
	WebElement fname;

	@FindBy(name="middleName")								//MiddleName
	//@CacheLookup
	WebElement mname;

	@FindBy(name="lastName")								//LastName
	//@CacheLookup
	WebElement lname;

	@FindBy(xpath="//*[@id='chkLogin']")					//checkbox
	//@CacheLookup
	WebElement checkbox;

	@FindBy(name="user_name") 								//username for credentials
	//@CacheLookup
	WebElement cname;

	@FindBy(name="user_password")							//password for credentials
	//@CacheLookup
	WebElement cpswd;

	@FindBy(name="re_password")								//confirm password for credentials
	//@CacheLookup
	WebElement conpswd;

	@FindBy(id="btnSave")									//save button
	//@CacheLookup
	WebElement savebutton;

				//Webelements for "Reports" Module
	
	
	@FindBy(xpath="//*[@id='menu_core_viewDefinedPredefinedReports']")
	//@CacheLookup
	WebElement reports;
	
	@FindBy(id="search_search")
	//@CacheLookup
	WebElement reportname;

	@FindBy(xpath="//*[@id='searchForm']/fieldset/p/input[1]")	//search button
	//@CacheLookup
	WebElement search;

	//Webelements for "My Info" Module
	@FindBy(id="menu_pim_viewMyDetails")						//My Info Module
	//@CacheLookup
	WebElement myinfo;

	@FindBy(id="welcome")										//Welcome Menu in Dashboard page
	//@CacheLookup
	WebElement welcomemenu;

	@FindBy(linkText="Logout")									//logout button
	//@CacheLookup
	WebElement logoutbtn;

	
					//constructor for PIM Module
	
	
	WebDriver driver;
	
	public PIM_Page(WebDriver driver){							

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkDashboardIsDisplayed(){
		dasboard.click();
	}

	public WebElement clickPimModule(){
		pim.click();											//PIM Module
		return pim;

	}

	public WebElement clickconfiguration(){
		config.click();											//configuration
		return config;
	}

	public WebElement clickoptional(){
		optfields.click();										//optional fields
		return optfields;

	}
	public void clickcustom(){
		cusfields.click();										//custom fields
	}

	public void employeeList(){
		emplist.click();										//employee list
	}

	public void clickaddEmployee(){
		addemp.click();
	}

	public void enterfirstname(String fstname){
		fname.sendKeys(fstname);								//firstname
	}

	public void entermiddlename(String midname){
		mname.sendKeys(midname);								//middlename
	}
	
	public void enterlastname(String laname){
		lname.sendKeys(laname);									//lastname
	}
	
	public void clickCheckBox(){
		checkbox.click();										//check box
	}

	public void enterUserName(String usname){
		cname.sendKeys(usname);									//username
	}
	
	public void enterPassWord(String pswd){
		cpswd.sendKeys(pswd);									//password
	}
	
	public void enterConfirmPassword(String conpaswd){
		conpswd.sendKeys(conpaswd);								//confirm password
	}
	
	public void clickSave(){
		savebutton.click();										//save button
	}
	
	public void clickReports(){
		reports.click();										//Reports
		
	}
	
	public void enterReportsName(String rname){
		reportname.sendKeys(rname);								//report name
	}
	
	public void clickSearch(){
		search.click();											//search button
	}
	
	public void clickMyInfo(){
		myinfo.click();											//My Info 
	}
	
	public void clickWelcomeMenu(){
		welcomemenu.click();									//welcome menu
	}
	
	public void clickLogout(){
		logoutbtn.click();										//logout button
	}

}
