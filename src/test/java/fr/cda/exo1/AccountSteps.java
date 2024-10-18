package fr.cda.exo1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSteps {

        private Account account;

        @Given("Customer who want to input id for create account :  {string}")
        public void customerWhoWantToInputIdForCreateAccount(String id) {
            account  = new account();
            account.setFrom(name);
        }

        @When("a id is make for account")
        public void aIdIsMakeForAccount() {
            account.setTo("");
        }


}
