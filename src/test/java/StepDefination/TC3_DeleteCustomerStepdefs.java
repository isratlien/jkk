package StepDefination;

import POM.DeleteCustomer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.TC1_AddcustomersStepdefs.driver;

public class TC3_DeleteCustomerStepdefs{


    DeleteCustomer delete;

    @Given("manager clicks on customer tab")
    public void managerClicksOnCustomerTab() throws InterruptedException {
        delete = new DeleteCustomer(driver);
        delete.CustomerDelTabb();

    }


    @When("Manager identify the customer by name {string}")
    public void managerIdentifyTheCustomerByNameFirstnameAndLastname(String firstname) throws InterruptedException {
        delete.CustomerSearchTab(firstname);
    }

    @And("Delete customer")
    public void deleteCustomer() throws InterruptedException {
        delete.CustomerDelBtn();
    }

    @Then("customer deleted")
    public void customerDeleted() {
    }



}
