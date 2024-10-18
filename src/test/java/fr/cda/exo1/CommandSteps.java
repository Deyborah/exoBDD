package fr.cda.exo1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommandSteps {

    private Command command;

    @Given("Customer who want to command for Someone : {string}")
    public void customerWhoWantToCommandForSomeone(String name) {
        command = new Command();
        command.setFrom(name);
    }

    @When("a Command is make for Someone")
    public void aCommandIsMakeForSomeone() {
        command.setTo("tata");
    }

    @Then("there is no product in the Command")
    public void thereIsNoProductInTheCommand() {
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer")
    public void theCommandComeFromCustomer() {
        Assert.assertEquals("Toto", command.getFrom());
    }


}
