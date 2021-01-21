package com.org.impl;

import org.junit.Assert;

import com.org.base.Property;
import com.org.locat.XpathLocat;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Impl extends Property {
	Property prop;
	XpathLocat locat;

	@Given("^User open policytray site$")
	public void user_open_policytray_site() {
		driver=prop.getdriver("chrome");
	}

	@When("^User selects sumassured$")
	public void user_selects_sumassured() {
		locat=new XpathLocat();
		locat.setSumassured("100000");
		Assert.assertEquals("100000", locat.getSumassured());
	}

	@When("^User selects policyplan$")
	public void user_selects_policyplan() {
		locat=new XpathLocat();
		select(locat.getPolicyplan(),"Amulya Jeevan - 2");
	}

	@After(order=3)
	@Then("^User selects term$")
	public void user_selects_term() {
	}

	@After(order=2)
	@Then("^user enter name and mobile$")
	public void user_enter_name_and_mobile() {
	}

	@After(order=1)
	@Then("^user enter dob$")
	public void user_enter_dob() {
	}

	@After(order=0)
	@Then("^user clicks getpremium$")
	public void user_clicks_getpremium() {
		button(locat.getSubmit());	
	}

	@When("^User selects AnmolJeevan$")
	public void user_selects_AnmolJeevan() throws Throwable {

	}

	@When("^User selects Bima$")
	public void user_selects_Bima() throws Throwable {

	}

	@When("^User selects Akshay$")
	public void user_selects_Akshay() throws Throwable {

	}


	@When("^User selects Labh$")
	public void user_selects_Labh() throws Throwable {
		
	}

	@When("^User selects Lakshay$")
	public void user_selects_Lakshay() throws Throwable {
		
	}

	@When("^User selects Pragati$")
	public void user_selects_Pragati() throws Throwable {
		
	}

	@When("^User selects Rakshat$")
	public void user_selects_Rakshat() throws Throwable {
		
	}
	@After
	@Then("^user quit window$")
	public void user_quit_window() throws Throwable {
	    driver.quit();
	}

}