package awesomecucumber.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingMyStepdefs {
    @Given("I'm on the home page and I navigate to the Store page by pressing {string} menu option")
    public void iMOnTheHomePageAndINavigateToTheStorePageByPressingMenuOption(String arg0) {

    }

    @When("I click {string} button next to the product {string}")
    public void iClickButtonNextToTheProduct(String arg0, String arg1) {
    }

    @Then("the {string} button changes and a tick mark is shown on it")
    public void theButtonChangesAndATickMarkIsShownOnIt(String arg0) {
    }

    @Then("{string} link is shown")
    public void linkIsShown(String arg0) {
    }

    @When("I click on the {string} link")
    public void iClickOnTheLink(String arg0) {
    }

    @Then("I am navigated to cart page")
    public void iAmNavigatedToCartPage() {
    }

    @When("I fetch the product name and quantity")
    public void iFetchTheProductNameAndQuantity() {
    }

    @Then("the product name is {string}")
    public void theProductNameIs(String arg0) {
    }

    @And("the product quantity is {int}")
    public void theProductQuantityIs(int arg0) {
    }
}
