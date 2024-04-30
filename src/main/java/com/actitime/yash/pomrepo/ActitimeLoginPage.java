package com.actitime.yash.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	WebDriver driver;
	public ActitimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement usernameTextField;
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginOption() {
		return loginOption;
	}
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(id = "loginButton")
	private WebElement loginOption;
}
