package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserWorkSpacePage {

	WebDriver driver;
	public TrelloUserWorkSpacePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Create new board']")
	private WebElement createNewBoardOption;
	
	public WebElement getCreateNewBoardOption() {
		return createNewBoardOption;
	}

	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}

	public WebElement getCreateBoardButton() {
		return createBoardButton;
	}
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	
	@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
	private WebElement createBoardButton;
}
