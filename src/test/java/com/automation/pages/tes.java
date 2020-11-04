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

import java.util.List;

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
//driver.switchTo().frame("cdk-overlay-0");
        BrowserUtils.wait(5);
   WebElement x=     driver.findElement(By.xpath("//button[.='close']"));
       x.click();
        System.out.println(driver.getTitle());
BrowserUtils.wait(4);
       WebElement seting=   driver.findElement(By.xpath("//div[2]/div[3]/div[1]"));
        //Actions action = new Actions(driver);
       // action.moveToElement(seting).click().perform();
        //WebDriverWait wait=new WebDriverWait(driver,20);
       /// wait.until(ExpectedConditions.visibilityOf(seting));
        BrowserUtils.wait(4);
     seting.click();
        List<WebElement>icons=driver.findElements(By.cssSelector("[role='img']"));
       // for (int i = 0; i <icons.size() ; i++) {
          //  System.out.println( icons.get(i).getText());
WebElement n=icons.get(5);
n.click();

    }
}
