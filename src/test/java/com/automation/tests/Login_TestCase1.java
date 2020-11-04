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
          settings.setFirstName("Liqui");
          settings.setmidle("HUb");
          settings.setlastName("Base");
          settings.seturl("google.com");
          settings.setcompany("Liquibase");
          settings.setbio("Born in NYC");
          BrowserUtils.wait(2);
settings.cliktoUpdateInfo();
BrowserUtils.wait(5);

          login.logOut();
          BrowserUtils.wait(4);
          login.login();
          BrowserUtils.wait(3);
          settings.clickToSetting();

          settings.clicktoUserInfo();
BrowserUtils.wait(2);

     }
}
