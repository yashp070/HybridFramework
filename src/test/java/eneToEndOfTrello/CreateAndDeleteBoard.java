package eneToEndOfTrello;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trello.qsp.genericutility.BaseClass;
import com.trello.qsp.pomrepo.TrelloHomePage;
import com.trello.qsp.pomrepo.TrelloLoginPage;
import com.trello.qsp.pomrepo.TrelloLoginToContinuePage;
import com.trello.qsp.pomrepo.TrelloLogoutPage;
import com.trello.qsp.pomrepo.TrelloStudyPage;
import com.trello.qsp.pomrepo.TrelloUserWorkSpacePage;

public class CreateAndDeleteBoard extends BaseClass {
@Test
	public void oneEndToEndUponTrello() throws IOException, InterruptedException {
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getLoginOption().click();
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getEmailTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
		loginPage.getContinueButton().submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		TrelloLoginToContinuePage loginToContinuePage = new TrelloLoginToContinuePage(driver);
		loginToContinuePage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		loginToContinuePage.getLoginToContinueButton().submit();
		TrelloUserWorkSpacePage userWorkSpacePage = new TrelloUserWorkSpacePage(driver);
		userWorkSpacePage.getCreateNewBoardOption().click();
		userWorkSpacePage.getBoardTitleTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("boardtitle"));
		wait.until(ExpectedConditions.elementToBeClickable(userWorkSpacePage.getCreateBoardButton()));
		if (userWorkSpacePage.getCreateBoardButton().isEnabled()) {
			//userWorkSpacePage.getCreateBoardButton().submit();
			userWorkSpacePage.getCreateBoardButton().click();
		}
		TrelloStudyPage studyPage = new TrelloStudyPage(driver);
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(studyPage.getStudyBoard()).perform();
		studyPage.getThreeDotOption().click();
		studyPage.getCloseBoardOption().click();
		studyPage.getCloseOption().click();
		Thread.sleep(5000);
		studyPage.getAccountOption().click();
		studyPage.getLogoutOption().click();
		TrelloLogoutPage logoutPage = new TrelloLogoutPage(driver);
		logoutPage.getLogoutButton().submit();
	}
}
