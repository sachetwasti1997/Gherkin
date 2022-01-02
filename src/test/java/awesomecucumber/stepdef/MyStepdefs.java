package awesomecucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @When("I do dummy testing")
    public void iDoDummyTesting() {
        
    }

    @Given("I'm dummy")
    public void iMDummy() {
        
    }

    @Then("dummy things happen to me")
    public void dummyThingsHappenToMe() {
    }

    @Given("my account balance is ${int}")
    public void myAccountBalanceIs$(int arg0) {
    }

    @When("I withdraw ${int}")
    public void iWithdraw$(int arg0) {
    }

    @Then("the account balance should be ${int}")
    public void theAccountBalanceShouldBe$(int arg0) {
    }

    @Given("I'm exploring something")
    public void iMExploringSomething() {
    }
}
