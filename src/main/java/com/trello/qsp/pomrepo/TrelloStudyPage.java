package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloStudyPage {

	WebDriver driver;
	public TrelloStudyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[contains(@class,'frrHNIWnTojsww tRO84OJZ6FM3qm')]")
	private WebElement ThreeDotOption;
	
	public WebElement getThreeDotOption() {
		return ThreeDotOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseOption() {
		return closeOption;
	}
	@FindBy(xpath = "//div[@class='jv7QDCKI8FPToj']")
	private WebElement studyBoard;
	
	public WebElement getStudyBoard() {
		return studyBoard;
	}
	@FindBy(xpath = "//button[@title='Close board']")
	private WebElement closeBoardOption;
	
	@FindBy(xpath = "//button[@title='Close']")
	private WebElement closeOption;
	
	
	@FindBy(xpath = "//button[@aria-label='Open member menu']")
	private WebElement accountOption;
	
	public WebElement getAccountOption() {
		return accountOption;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}
	@FindBy(xpath = "//button/span[text()='Log out']")
	private WebElement logoutOption;
	
}
