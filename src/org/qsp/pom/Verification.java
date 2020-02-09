package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verification {

	public Verification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verify(String title, int ETO, WebDriver driver){
		WebDriverWait ww = new WebDriverWait(driver, ETO);
		ww.until(ExpectedConditions.titleContains(title));
		
	}
}
