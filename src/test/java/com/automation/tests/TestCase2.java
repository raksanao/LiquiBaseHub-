package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.pages.ProjectPage;
import com.automation.pages.SettingPage;
import com.automation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends AbstractTestBase {
    @Test
    public void login() {
        LoginPage login = new LoginPage();
        login.login();
        BrowserUtils.wait(4);
        login.closePopUp();
        ProjectPage project = new ProjectPage();
        project.clicktoProjects();
        project.expandModule();
        project.clickToOperationTab();
        BrowserUtils.wait(3);
        project.clickToResult();

        project.clickPass();
        BrowserUtils.wait(2);
        project.clickDropDownOperat();




    }
}
