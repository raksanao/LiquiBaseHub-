package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarPage {

    @FindBy(xpath = "//div[2]/div[3]/div")
    protected WebElement settings;
    @FindBy(xpath = "//span[.='close']")
    protected  WebElement popupX;


    public void clickToSetting() {
        BrowserUtils.wait(2);
        settings.click();
        BrowserUtils.wait(4);
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void switchToIframe(){
        Driver.getDriver().switchTo().frame("us-entrypoint-button");
        BrowserUtils.wait(2);

     //Driver.getDriver().switchTo().defaultContent();
     BrowserUtils.wait(3);
        popupX.click();
    }
}
