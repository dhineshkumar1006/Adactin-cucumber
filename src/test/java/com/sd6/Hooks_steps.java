package com.sd6;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_steps {
	
	
	@Given("^I Am Going To School$")
	public void i_Am_Going_To_School() throws Throwable {
		System.out.println("I Am Going To School");
	}

	@When("^I Completed my Sslc$")
	public void i_Completed_my_Sslc() throws Throwable {
		System.out.println("I Completed my Sslc");
	}

	@When("^I completed my hsc$")
	public void i_completed_my_hsc() throws Throwable {
		System.out.println("I completed my hsc");
	}

	@Then("^I Joined B\\.e$")
	public void i_Joined_B_e() throws Throwable {
		System.out.println("I Joined B.E");
	}



}
