package com.qwinix.onlinetimesheet.qa.page;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlinetimesheet.qa.BaseDriver;
import com.qwinix.onlinetimesheet.qa.steps.CommonUtil;

public class CreateAccountPage extends CommonUtil {

	public static final String FilePath = "./ReadExcel/mystoreexcel.xlsx";
	public static final String SheetName = "Sign_In";
	public static final String Sheet =  "CreateAccount";

	public static WebDriver driver = BaseDriver.driver;
	CommonUtil objCU = new CommonUtil();
	SigninPage objSP = new SigninPage();

	public CreateAccountPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}

	@FindBy(id = "email_create")
	public WebElement emailAddress;

	@FindBy(id = "SubmitCreate")
	public WebElement createAccSubmit;
	
	@FindBy(id = "uniform-id_gender1")
	public WebElement male;

	@FindBy(id = "uniform-id_gender2")
	public WebElement female;

	@FindBy(id = "customer_firstname")
	public WebElement firstName;

	@FindBy(id = "customer_lastname")
	public WebElement lastName;

	@FindBy(id = "passwd")
	public WebElement password;

	@FindBy(id = "company")
	public WebElement company;

	@FindBy(id = "address1")
	public WebElement address1;

	@FindBy(id = "address2")
	public WebElement address2;

	@FindBy(id = "city")
	public WebElement city;

	@FindBy(id = "id_state")
	public WebElement state;

	@FindBy(id = "postcode")
	public WebElement postcode;

	@FindBy(id = "phone_mobile")
	public WebElement mobileNumber;

	@FindBy(id = "alias")
	public WebElement myAddress;

	@FindBy(id = "submitAccount")
	public WebElement submitAccount;

	public void createAccount(String caseName) throws IOException {
		try {
			objSP.signIn.click();
			WebElement scrollforAuthentication = driver.findElement(By.xpath("//h1[text()='Authentication']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollforAuthentication);
			int rowNumber = getRowNumber(FilePath, Sheet, caseName);
//			System.out.println("Row Number = " + rowNumber);
			emailAddress.sendKeys(getCellData(FilePath, Sheet, rowNumber, "E-Mail"));
			CommonUtil.waitForElement(createAccSubmit);
			createAccSubmit.click();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void createForm(String caseName) throws IOException, InterruptedException {
		try {
			int rowNumber = getRowNumber(FilePath, Sheet, caseName);
			CommonUtil.waitForPageLoaded();
			Thread.sleep(5000);
			female.click();
			Thread.sleep(5000);
			firstName.sendKeys(getCellData(FilePath, Sheet, rowNumber, "FirstName"));
			Thread.sleep(5000);
			lastName.sendKeys(getCellData(FilePath, Sheet, rowNumber,  "LastName"));
			Thread.sleep(5000);
			password.sendKeys(getCellData(FilePath, Sheet, rowNumber, "Password"));
			Thread.sleep(5000);
			company.sendKeys(getCellData(FilePath, Sheet, rowNumber, "Company"));
			Thread.sleep(5000);
			address1.sendKeys(getCellData(FilePath, Sheet, rowNumber, "Address1"));
			Thread.sleep(5000);
			address2.sendKeys(getCellData(FilePath, Sheet, rowNumber, "Address2"));
			Thread.sleep(5000);
			city.sendKeys(getCellData(FilePath, Sheet, rowNumber, "City"));
			Thread.sleep(5000);
			CommonUtil.selectByIndex(state, 15);
			Thread.sleep(10000);
//			postcode.sendKeys("46001");
			postcode.sendKeys(getCellData(FilePath, Sheet, rowNumber, "ZipCode"));
			Thread.sleep(10000);
			mobileNumber.sendKeys(getCellData(FilePath, Sheet, rowNumber, "MobileNumber"));
			Thread.sleep(10000);
			myAddress.clear();
			Thread.sleep(5000);
			myAddress.sendKeys(getCellData(FilePath, Sheet, rowNumber, "UserAddress"));
			Thread.sleep(5000);
//			submitAccount.click();
//			Thread.sleep(5000);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void verifyCreateForm() {
		String accountForm = driver.findElement(By.xpath("//h1[contains(.,'Create an account')]")).getText();
		Assert.assertEquals("CREATE AN ACCOUNT", accountForm);
		System.out.println("actualvalue is = " + accountForm);
	}
}
 