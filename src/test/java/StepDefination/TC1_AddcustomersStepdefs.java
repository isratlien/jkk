package StepDefination;

import Core.Helper;
import POM.WebELements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TC1_AddcustomersStepdefs {
    public static WebDriver driver;
    WebELements eLements;

    @Given("^Manager lands on XYZ bank home page$")
    public void managerLandsOnXYZBankHomePage() throws InterruptedException {
        Helper helper = new Helper();
        driver = helper.chromeLaunch();
    }

    @When("manager clicks on bank manager login option")
    public void managerClicksOnBankManagerLoginOption() throws InterruptedException {
        System.out.println("testtttttttttttttttttt");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[text()=\"Bank Manager Login\"]")).click();
        eLements = new WebELements(driver);
        eLements.BankManagerLogin();

    }

    @And("clicks on add customer tab")
    public void clicksOnAddCustomerTab() throws InterruptedException {
        Thread.sleep(2000);
        eLements.AddCustomerTab();

    }

    @And("sends customer {string} and {string} and {string}")
    public void form(String firstName, String lastName, String PostCode) throws InterruptedException {
      /*  Thread.sleep(2000);
        driver.findElement(By.xpath("(//input)[1]")).sendKeys(firstName);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input)[2]")).sendKeys(LastName);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input)[3]")).sendKeys(PostCode);*/

        eLements.customerData(firstName, lastName, PostCode);

    }

    @And("clicks on add customer button")
    public void clicksOnAddCustomerButton() throws InterruptedException {
        Thread.sleep(2000);
        eLements.setAddCustomerFinal();
        driver.switchTo().alert().dismiss();

    }

    @Then("go to the next page")
    public void goToTheNextPage(){
        System.out.println(".............................");
    }

}


