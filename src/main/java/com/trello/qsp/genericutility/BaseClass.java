package com.trello.qsp.genericutility;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility webDriverUtils = new WebDriverUtility();
	public FileUtility fileUtils = new FileUtility();
@BeforeClass
	public void executeBeforeClass() throws IOException {
		String browser = fileUtils.readTheDataFromPropertyFile("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webDriverUtils.implicitlyWait(driver);
		driver.get(fileUtils.readTheDataFromPropertyFile("url"));
	}
@AfterClass
	public void executeAfterClass() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
