package com.qwinix.onlinetimesheet.qa.steps;

import com.qwinix.onlinetimesheet.qa.page.CreateAccountPage;
import com.qwinix.onlinetimesheet.qa.page.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountSteps {
	
	CommonUtil objCOM = new CommonUtil();
	CreateAccountPage objCRE = new CreateAccountPage();
	SigninPage objSP = new SigninPage();
	
	@Given("^I am in MyStore Home Page$")
	public void i_am_in_MyStore_Home_Page() throws Throwable {
	   objCOM.openUrl();
	}

	@When("^I Enter \"([^\"]*)\" Email$")
	public void i_Enter_Email(String validEmail) throws Throwable {
		objCRE.createAccount(validEmail);
	}

	@Then("^I should see the Create Account Page$")
	public void i_should_see_the_Create_Account_Page() throws Throwable {
	   objCRE.verifyCreateForm();
		 
	}

	@Then("^I should able to Create an Account with \"([^\"]*)\" details$")
	public void i_should_able_to_Create_an_Account_with_details(String validDetails) throws Throwable {
	    objCRE.createForm(validDetails);
	}
	
	@Then("^I should able to see the My Account Page$")
	public void i_should_able_to_see_the_My_Account_Page() throws Throwable {
	    objSP.verifySignIn();
	}
}
