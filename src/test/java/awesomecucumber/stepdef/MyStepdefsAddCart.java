package awesomecucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsAddCart {
    @Given("I'm on the Store page")
    public void iMOnTheStorePage() {
    }

    @When("I add a {string} in the cart")
    public void iAddAInTheCart(String arg0) {
        
    }

    @Then("I see {double} {string} in the cart")
    public void iSeeInTheCart(int arg0, int arg1, String arg2) {

    }
}
