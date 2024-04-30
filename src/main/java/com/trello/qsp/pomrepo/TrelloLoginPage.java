package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {

	WebDriver driver;
	public TrelloLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='username']")
	private WebElement emailTextField;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}
	@FindBy(id = "login-submit")
	private WebElement ContinueButton;
}
