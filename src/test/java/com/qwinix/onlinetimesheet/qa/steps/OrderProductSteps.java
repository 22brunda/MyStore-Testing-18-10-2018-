package com.qwinix.onlinetimesheet.qa.steps;

import com.qwinix.onlinetimesheet.qa.page.OrderProductPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderProductSteps {

	CommonUtil objCOM = new CommonUtil();
	OrderProductPage objPRO = new OrderProductPage();

	@When("^I click on women tab$")
	public void i_click_on_women_tab() throws Throwable {
		objPRO.womentabclick();
	}

	@Then("^I should see the option to select dress type$")
	public void i_should_see_the_option_to_select_dress_type() throws Throwable {
		objPRO.selectdresstype();
	}
	
	@Then("^I add the selected dress to the cart$")
	public void i_add_the_selected_dress_to_the_cart() throws Throwable {
	    
	}

	@Then("^I should see the successfull message with proceding to checkout$")
	public void i_should_see_the_successfull_message_with_proceding_to_checkout() throws Throwable {
	    
	}
}