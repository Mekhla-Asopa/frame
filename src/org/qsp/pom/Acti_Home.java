package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Home {

	@FindBy(xpath= "//input[@placeholder=\"Username\"]")
	private WebElement un;
	@FindBy(xpath= "//input[@placeholder=\"Password\"]")
	private WebElement pwd;
	@FindBy(xpath= "//a[@id=\"loginButton\"]")
	private WebElement button;

	public Acti_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void unTxt(String v){
		un.sendKeys(v);
	}
	public void pwdTxt(String v){
		pwd.sendKeys(v);
	}
	public void clickB() 
	{
		button.click();
	}
}
