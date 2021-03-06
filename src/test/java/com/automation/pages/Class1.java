package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

   // WebElement vihcleModel = Driver.getDriver().findElement(By.xpath("//div[@id='dropdown-vehicle-make-0']"));
     //   BrowserUtils.wait(2);
      //  vihcleModel.sendKeys("Acura");

  @Test
    public void setup()  {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
//      driver = new ChromeDriver(chromeOptions);
        Driver.getDriver().get("https://www.thezebra.com/insurance/car/prefill/vehicles/select/");
        Driver.getDriver().manage().window().maximize();
      WebElement ele=  Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Select vehicle year')]"));

      BrowserUtils.wait(4);
Driver.getDriver().findElement(By.xpath("//div[contains(text(),'2021')]")).click();
      //ele.click();
     // ele.


    }

}
