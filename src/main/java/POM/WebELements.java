package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebELements {

    WebDriver driver;

    By bankManagerLogin= By.xpath("//button[text()=\"Bank Manager Login\"]");

    By addCustomerTab= By.xpath("(//button)[3]");

    By firstNameXpath= By.xpath("(//input)[1]");

    By lastNameXpath= By.xpath("(//input)[2]");

    By postCodeXpath= By.xpath("(//input)[3]");

   By addCustomerFinal= By.xpath("(//button)[6]");

   By nextPage = By.xpath( "//button)[4]");

   public WebELements(WebDriver driver){
       this.driver = driver;
       this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   }
   public void BankManagerLogin() throws InterruptedException {
       Thread.sleep(2000);
       driver.findElement(bankManagerLogin).click();
   }
    public void AddCustomerTab(){

        driver.findElement(addCustomerTab).click();
    }

    public void customerData(String firstName,String lastName, String PostCode){

        driver.findElement(firstNameXpath).sendKeys(firstName);

        driver.findElement(lastNameXpath).sendKeys(lastName);

        driver.findElement(postCodeXpath).sendKeys(PostCode);
    }
    public void setAddCustomerFinal(){

        driver.findElement(addCustomerFinal).click();
    }


}
