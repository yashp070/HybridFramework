package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogoutPage {

	WebDriver driver;
	public TrelloLogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "logout-submit")
	private WebElement logoutButton;
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
}
