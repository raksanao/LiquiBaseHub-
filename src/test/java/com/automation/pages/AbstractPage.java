package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
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

   // public void navigateTo(String moduleName, String subModuleName ) {

       // String moduleNameXpath = "(//*[contains(text(),'"+moduleName+"')])[1]";
        //String subModuleXpath = "(//*[contains(text(),'"+subModuleName+"')])[1]";

        //WebElement moduleElement = driver.findElement(By.xpath(moduleNameXpath));
       // WebElement subModuleElement = driver.findElement(By.xpath(subModuleXpath));

//        Actions actions = new Actions(driver);
//
//        BrowserUtils.wait(4);
//
//        actions.moveToElement(moduleElement).
//                pause(2000).
//                click(subModuleElement).
//                build().perform();
//
//        //increase this wait rime if still failing
        //BrowserUtils.wait(4);
   // }


//    public void navigateTo(String moduleName) {
//        String tabNameXpath = "(//*[contains(text(),'"+moduleName+"')])[1]";
//
//        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
//
//        BrowserUtils.wait(4);
//        tabElement.click();
////        actions.moveToElement(tabElement).
//                pause(2000).
//                perform();


        //increase this wait rime if still failing
      //  BrowserUtils.wait(4);


   // }
    }
