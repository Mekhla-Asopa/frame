package org.qsp.genericmethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
	static{
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_key,chrome_value);
		}
		else{
			System.out.println("browser cannot launched");
		}
	}
	
	public WebDriver driver;
	
 @BeforeMethod
 public void openApp(){
	 driver = new ChromeDriver();
	 Reporter.log("launching Browser", true);
	 driver.manage().window().maximize();     // to maximize the window
	 driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
	 driver.get(url);
 }
 
 @AfterMethod
	public void closeApp(ITestResult test_result) throws IOException{
	 String name = test_result.getName();
	 int status = test_result.getStatus();
	 
	 if (status ==1) {
		 Reporter.log("Test" + name + "is passed", true);		
	}
	 else{
		 Reporter.log("Test" + name + "is not passed", true);
		 //Take a screen shot 
		 String path = ss_path + name + ss_ext;
		 FW_Utils.ScreenShot(driver, path);
	 }
	 driver.close();
 }
 
}
