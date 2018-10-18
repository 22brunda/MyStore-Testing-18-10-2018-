package com.qwinix.onlinetimesheet.qa.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlinetimesheet.qa.BaseDriver;
import com.qwinix.onlinetimesheet.qa.steps.CommonUtil;

public class OrderProductPage {

	public static WebDriver driver = BaseDriver.driver;
	CommonUtil objCOM = new CommonUtil();

	public OrderProductPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}

	@FindBy(xpath="//a[text()='Women']")
	public WebElement Womenbutton;

	@FindBy(xpath="(//a[contains(.,'T-shirts')])[1]")
	public WebElement summerdress;

	@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")
	public WebElement summerdress1;

	@FindBy(xpath="(//span[contains(.,'Proceed to checkout')])[2]")
	public WebElement ptc;

	@FindBy(xpath="//button[@id='SubmitCreate']")
	public WebElement createaccount;

	@FindBy(xpath="//input[@id='email_create']")
	public WebElement summerdress5;

	@FindBy(xpath="//input[@id='customer_firstname']")
	public WebElement fname;

	@FindBy(xpath="//input[@id='customer_lastname']")
	public WebElement lname;

	@FindBy(xpath="//input[@id='passwd']")
	public WebElement pwd;

	@FindBy(xpath="//input[@id='address1']")
	public WebElement address;

	@FindBy(xpath="//input[@id='city']")
	public WebElement city;

	@FindBy(xpath="//input[@id='postcode']")
	public WebElement zipcode;

	@FindBy(xpath="//textarea[@id='other']")
	public WebElement txt;

	@FindBy(xpath="//select[@id='id_state']")
	public WebElement state;

	@FindBy(xpath="//button[@id='submitAccount']")
	public WebElement register;

	@FindBy(xpath="//input[@id='phone_mobile']")
	public WebElement mobnum;

	@FindBy(xpath="//button[@name='processAddress']")
	public WebElement pc;

	@FindBy(xpath="//a[@class='cheque']")
	public WebElement paybycheque;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement confirmorder;

	@FindBy(xpath="//p[text()='Your order on My Store is complete.']")
	public WebElement oderconfirmationmess;

	@FindBy(xpath="//button[@name='processCarrier']")
	public WebElement ptc2;

	public void userAccount() {
		String verifyAccount = driver.findElement(By.xpath("//div[@class='breadcrumb clearfix']//span[text()='My account']")).getText();
		Assert.assertEquals("My account", verifyAccount);
		System.out.println("actualvalue is = " + verifyAccount);
	}

	public void womentabclick() throws InterruptedException{
		//to click on the women tab with hover and click function	
		WebElement menu = driver.findElement(By.xpath("//a[text()='Women']"));
		WebElement parentMenu = driver.findElement(By.xpath("(//a[contains(.,'T-shirts')])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(parentMenu).moveToElement(menu).build().perform();
		objCOM.waitTillElementVisibility(By.xpath("(//a[contains(.,'T-shirts')])[1]"));
		parentMenu.click();
		WebElement element = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		objCOM.waitTillPresenceElement(By.xpath("(//a[@class='product-name'])[2]"));
	}

	public void selectdresstype() throws InterruptedException
	{
		//to select the dress and add to cart and proceed with checkout
		WebElement menu1 = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		WebElement parentMenu1 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(parentMenu1).moveToElement(menu1).build().perform();
		parentMenu1.click();
		//		String actual = driver.findElement(By.xpath("//h2//i[@class='icon-ok']")).getText();
		//		System.out.println("actualvalue is = "+actual);
		//		Assert.assertEquals("Product successfully added to your shopping cart", actual);
		objCOM.waitTillElementVisibility(By.xpath("//span[contains(.,'Proceed to checkout')]"));
		summerdress1.click();
		objCOM.waitTillPresenceElement(By.xpath("(//span[text()='Total'])[2]"));
		WebElement element1 = driver.findElement(By.xpath("(//span[text()='Total'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		objCOM.waitTillElementVisibility(By.xpath("//span[contains(.,'Proceed to checkout')])[2]"));
		ptc.click();
	}
}
