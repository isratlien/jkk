package StepDefination;

import POM.OpenAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.TC1_AddcustomersStepdefs.driver;

public class TC2_OpenAccountStepdefs {

    OpenAccount open ;

    @Given("manager clicks on customer name tab")
    public void openAccountPage() throws InterruptedException {
        Thread.sleep(2000);
        open = new OpenAccount(driver);
        open.open1();

    }


    @When("clicks on add customer choose the name of the customer")
    public void managerClicksOnCustomerNameTab() throws InterruptedException {
        open.customer();

    }

    @And("Currency tab to choose the currency")
    public void currencyTabToChooseTheCurrency() throws InterruptedException {
        open.currency();
    }

    @And("clicks on process button")
    public void clicksOnProcessButton() throws InterruptedException {
        Thread.sleep(2000);
        open.process();
        driver.switchTo().alert().dismiss();
    }


    @Then("go to the next")
    public void goToTheNextPage(){
    }
}

