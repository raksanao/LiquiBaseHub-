package com.automation.tests;
import com.automation.pages.LoginPage;
import com.automation.pages.SettingPage;
import com.automation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_TestCase1 extends AbstractTestBase {
     @Test
     public void login() {
          LoginPage login = new LoginPage();
          login.login();
          BrowserUtils.wait(4);
          login.closePopUp();

          SettingPage settings=new SettingPage();
          settings.clickToSetting();
          BrowserUtils.wait(2);
          settings.clicktoUserInfo();
          BrowserUtils.wait(3);
          settings.setFirstName("Ruxa");
          settings.setmidle("johnDoe");
          settings.setlastName("dilion");
          settings.seturl("google.com");
          settings.setcompany("Liquibase");
          settings.setbio("Born in NYC");
//settings.editUser("Rosa","Dilion","JohnDoe","Born in NY","www.google.com","Liquibase");
settings.cliktoUpdateInfo();

     }
}
