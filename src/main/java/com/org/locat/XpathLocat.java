package com.org.locat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.org.base.Property;

public class XpathLocat extends Property {
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_Calculator_TxtSumAssured']")
	private WebElement sumassured;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_Calculator_DDLPlan']")
	private WebElement policyplan;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_Calculator_DDLTerm']")
	private WebElement term;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_Calculator_TxtName']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_Calculator_TxtMobile']")
	private WebElement mobile;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_Calculator_DDLDate']")
	private WebElement date;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_Calculator_DDLMonth']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='ContentPlaceHolder1_Calculator_DDLYear']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@id='ContentPlaceHolder1_Calculator_BtnSave']")
	private WebElement submit;

	
	
	public String getSumassured() {
		return sumassured.getAttribute("value");
	}



	public void setSumassured(String sumassured) {
		this.sumassured.sendKeys(sumassured);
	}



	public WebElement getPolicyplan() {
		return policyplan;
	}



	public void setPolicyplan(WebElement policyplan) {
		this.policyplan = policyplan;
	}



	public WebElement getTerm() {
		return term;
	}



	public void setTerm(WebElement term) {
		this.term = term;
	}



	public WebElement getName() {
		return name;
	}



	public void setName(WebElement name) {
		this.name = name;
	}



	public WebElement getMobile() {
		return mobile;
	}



	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}



	public WebElement getDate() {
		return date;
	}



	public void setDate(WebElement date) {
		this.date = date;
	}



	public WebElement getMonth() {
		return month;
	}



	public void setMonth(WebElement month) {
		this.month = month;
	}



	public WebElement getYear() {
		return year;
	}



	public void setYear(WebElement year) {
		this.year = year;
	}



	public WebElement getSubmit() {
		return submit;
	}



	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}



	public XpathLocat(){
		PageFactory.initElements(driver, this);
	}
	
	
}
