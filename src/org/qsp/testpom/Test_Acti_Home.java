package org.qsp.testpom;

import org.qsp.genericmethod.BaseTest;
import org.qsp.genericmethod.XL;
import org.qsp.pom.Acti_Home;
import org.qsp.pom.Verification;
import org.testng.annotations.Test;

public class Test_Acti_Home extends BaseTest  {
@Test
public void run(){

	Acti_Home ah = new Acti_Home(driver);
	ah.unTxt(XL.data(xl_path, sheet_name, 1, 0));
	ah.pwdTxt(XL.data(xl_path, sheet_name, 1, 1));
	ah.clickB();
	
	Verification vf = new Verification(driver);
	vf.verify(XL.data(xl_path, sheet_name, 1, 2), ETO, driver);
	}
}
