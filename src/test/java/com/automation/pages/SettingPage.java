package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SettingPage extends AbstractPage {

    @FindBy(xpath = "//div[2]/div[3]/div")
    protected WebElement settings;

    @FindBy(xpath = "//span[.='close']")
    protected  WebElement popupX;

    @FindBy(xpath="(//div[@class='settings-tree__item'])[1]")
    protected WebElement userInfo;
    @FindBy(css="input[id='mat-input-3']" )
    protected WebElement firstName;

    @FindBy(css="input[id='mat-input-4']" )
    protected WebElement middleName;

    @FindBy(css="input[id='mat-input-5']" )
    protected WebElement lastName;

    @FindBy(css="input[id='mat-input-8']" )
    protected WebElement url;

    @FindBy(css="input[id='mat-input-9']" )
    protected WebElement company;

    @FindBy(id="mat-input-10")
    protected WebElement bio;

    public void clickToSetting() {

        BrowserUtils.wait(4);
        PageFactory.initElements(Driver.getDriver(), this);

        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("//*[text()='settings']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //use executeScript
        jse.executeScript("arguments[0].click();", settingBtn);

    }

    public void closePopup(){
        BrowserUtils.wait(4);
        popupX.click();

    }


    public void setFirstName(String first){
        firstName.sendKeys(first);

    }
    public void setmidle(String middleName1) {
        middleName.sendKeys(middleName1);
    }

    public void setlastName(String lastName1) {
        lastName.sendKeys(lastName1);
    }

    public void seturl(String url1) {
        url.sendKeys(url1);
    }
    public void setcompany(String comp) {
        company.sendKeys(comp);

    }
    public void setbio(String bio1) {
        bio.sendKeys(bio1);

    }
public void cliktoUpdateInfo(){
    WebElement updateProfile = Driver.getDriver().findElement(By.xpath("//span[.='Update Profile']"));

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
   // use executeScript
    jse.executeScript("arguments[0].click();",updateProfile);



        }


    public void clicktoUserInfo() {
        userInfo.click();
    }


    public String getFirstName(){
        return  firstName.getText();
    }

public String  pageTitle(){
      return   driver.getTitle();
    }
    public String pageUrl(){
        return  driver.getCurrentUrl();
    }


    }

