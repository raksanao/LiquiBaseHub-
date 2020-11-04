package com.automation.tests;
import com.automation.pages.LoginPage;
import com.automation.pages.SideBarPage;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class Login_TestCase1 extends AbstractTestBase {
     @Test
     public void login() {
          LoginPage login = new LoginPage();
          login.login();
          BrowserUtils.wait(4);
          login.closePopUp();

          SideBarPage side=new SideBarPage();
          side.clickToSetting();

     }
}
