package com.actitime.yash.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassA {

	public WebDriver driver;
	public WebDriverUtilityA webDriverUtils = new WebDriverUtilityA();
	public FileUtilityA fiileUtils = new FileUtilityA();
@BeforeClass
	public void executeBeforeClass() throws IOException {
		String browser = fiileUtils.readDataFromPropertyFile("browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webDriverUtils.implicitlyWait(driver);
		driver.get(fiileUtils.readDataFromPropertyFile("url"));
	}
@AfterClass
	public void executeAfterClass() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
