package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class tes {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://hub-staging.liquibase.com/landing-page");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//span[.='Log In']"));
        login.click();
        WebElement loginIn = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
        loginIn.sendKeys("raksanao");
        WebElement passIn = driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
        passIn.sendKeys("Hubbase87@");
        BrowserUtils.wait(3);
        WebElement signIn = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
        signIn.submit();


        BrowserUtils.wait(5);
        WebElement x = driver.findElement(By.xpath("//button[.='close']"));
        x.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-icon[contains(text(),'settings')]"))).click();


        WebElement setting = driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]"));
        //  setting.click();


        if (driver.findElement(By.xpath("//mat-icon[contains(text(),'settings")).isDisplayed()) {
            {
                WebDriverWait waitForElement = new WebDriverWait(driver, 10);
                waitForElement.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//mat-icon[contains(text(),'settings"))));
            }
            setting.click();

        }
    }
}
