package com.qwinix.onlinetimesheet.qa.steps;

import com.qwinix.onlinetimesheet.qa.page.SigninPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps {
	CommonUtil objCOM = new CommonUtil();
	public SigninPage signInPage = new SigninPage();
	
	@Given("^I am on MyStore Home Page$")
	public void i_am_on_MyStore_Home_Page() throws Throwable {
		signInPage.openUrl();
	}

	@When("^I Enter \"([^\"]*)\" Email and Password$")
	public void i_Enter_Email_and_Password(String valid) throws Throwable {
		signInPage.signIn(valid);
	}

	@Then("^I should able to see the MyAccount Page$")
	public void i_should_able_to_see_the_MyAccount_Page() throws Throwable {
	    signInPage.verifySignIn();
	}
	
	@When("^I Enter \"([^\"]*)\" and Valid Password$")
	public void i_Enter_and_Valid_Password(String invalidEmail) throws Throwable {
	   signInPage.signIn(invalidEmail);
	}

	@Then("^Verified validation for Message \"([^\"]*)\"$")
	public void verified_validation_for_Message(String errorMsg) throws Throwable {
	   signInPage.verifyErrorMessage(errorMsg);
	}
	
	@When("^I Enter Valid Email and \"([^\"]*)\"$")
	public void i_Enter_Valid_Email_and(String invalidPassword) throws Throwable {
	    signInPage.signIn(invalidPassword);
	}
	
	@When("^I Enter \"([^\"]*)\" and valid Password$")
	public void i_Enter_and_valid_Password(String blankEmail) throws Throwable {
	    signInPage.signIn(blankEmail);
	}
	
	@When("^I Enter valid Email and \"([^\"]*)\"$")
	public void i_Enter_valid_Email_and(String blankPassword) throws Throwable {
	    signInPage.signIn(blankPassword);
	}
}
