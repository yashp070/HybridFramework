package com.actitime.yash.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

	WebDriver driver;
	public ActitimeHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "logoutLink")
	private WebElement logoutOption;
	
	public WebElement getLogoutOption() {
		return logoutOption;
	}
	
	
}
