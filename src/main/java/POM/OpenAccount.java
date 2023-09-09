package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpenAccount {

    WebDriver driver;

    By OpenAccountMain = By.xpath("//button[@ng-class=\"btnClass2\"]");

    //By customerSelect = By.xpath("//select[@id=\"userSelect\"]");
    By customerSelect= By.xpath("//select[@name=\"userSelect\"]");
  //  By getCustomerSelects = By.xpath("(//select/option[@class=\"ng-binding ng-scope\"])[6]");
    By getCustomerSelects = By.xpath("//select/option[@ng-repeat=\"cust in Customers\"][6]");
    By currencySelect = By.xpath("//select[@id='currency']");
    By getCurrencySelect = By.xpath("//select[@id=\"currency\"]/option[@value=\"Dollar\"]");
    By processButton = By.xpath("//button[text()='Process']");


    public OpenAccount(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void open1 () throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(OpenAccountMain).click();
}
    public void customer() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(customerSelect).click();
        driver.findElement(getCustomerSelects).click();

    }
    public void currency() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(currencySelect).click();
        Thread.sleep(2000);
        driver.findElement(getCurrencySelect).click();

    }
    public void process() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(processButton).click();

        }

    }

