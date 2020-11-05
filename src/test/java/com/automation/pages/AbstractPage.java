package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    public AbstractPage() {
        PageFactory.initElements(driver, this);
    }



    public void clickToSettings(String settings, String userInfo ) {

        String settingXpath = "//*[text()='" + settings + "']";
        String userInfoXpath = "//*[text()='" + userInfo + "']";

        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//*[text()='settings']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //use executeScript
        jse.executeScript("arguments[0].click();", settingBtn);

        WebElement settingElement = driver.findElement(By.xpath(settingXpath));
        WebElement userNameElement = driver.findElement(By.xpath(userInfoXpath));


    }



    }
