package com.actitime.yash.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtilityA {

public void implicitlyWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
