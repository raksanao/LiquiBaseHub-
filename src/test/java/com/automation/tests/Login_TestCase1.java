package com.automation.tests;
import com.automation.pages.LoginPage;
import com.automation.pages.SideBarPage;
import org.testng.annotations.Test;

public class Login_TestCase1 extends AbstractTestBase {
     @Test
     public void login() {
          LoginPage login = new LoginPage();
          login.login();
SideBarPage sb=new SideBarPage();
sb.switchToIframe();
//sb.clickToSetting();

     }
}
