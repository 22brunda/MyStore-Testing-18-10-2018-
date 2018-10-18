package com.qwinix.onlinetimesheet.qa.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlinetimesheet.qa.BaseDriver;
import com.qwinix.onlinetimesheet.qa.steps.CommonUtil;

public class SigninPage extends CommonUtil {

	public static final String FilePath = "./ReadExcel/mystoreexcel.xlsx";
	public static final String SheetName = "Sign_In";

	public static WebDriver driver = BaseDriver.driver;
	CommonUtil objCU = new  CommonUtil();

	public SigninPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signIn;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "passwd")
	public WebElement password;

	@FindBy(id = "SubmitLogin")
	public WebElement submitSignIn;

	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement signOut;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	public WebElement errorMessage;

	public void signIn(String caseName) throws Exception {		
		try {
			signIn.click();
			WebElement emailText = driver.findElement(By.xpath("(//div[@class='form-group']//label[text()='Email address'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailText);
			int rowNumber = getRowNumber(FilePath, SheetName, caseName);
			System.out.println("Row No = "+rowNumber);
			email.sendKeys(getCellData(FilePath, SheetName, rowNumber, "Email_Id"));
			CommonUtil.waitForElement(password);
			password.sendKeys(getCellData(FilePath, SheetName, rowNumber, "Password"));
			CommonUtil.waitForElement(submitSignIn);	
			submitSignIn.click();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

	public void verifySignIn() {
		//Verify for product add to cart successfully SignIn to MyStore
		String verifyAccount = driver.findElement(By.xpath("//div[@class='breadcrumb clearfix']//span[text()='My account']")).getText();
		Assert.assertEquals("My account", verifyAccount);
		System.out.println("actualvalue is = " + verifyAccount);
	}

	public void verifyErrorMessage(String errorMsg) {
		String errorMessage = driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText();
		Assert.assertEquals(errorMsg, errorMessage);
		System.out.println("actualvalue is = " + errorMessage);
	}
}
