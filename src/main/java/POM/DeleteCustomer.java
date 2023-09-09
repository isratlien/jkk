package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DeleteCustomer {
    WebDriver driver;

   // By deleteriously = By.xpath("//button[@ng-class=\"btnClass3\"]");
    By deleteriously = By.xpath("//button[@ng-click=\"showCust()\"]");
    By customizations = By.xpath("//input");
    By determinable  = By.xpath("//td/button[text()=\"Delete\"]");



    public DeleteCustomer(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void CustomerDelTabb() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(deleteriously).click();

    }
    public void CustomerSearchTab(String firstname) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(customizations).sendKeys(firstname);
    }
    public void CustomerDelBtn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(determinable).click();

    }

}

