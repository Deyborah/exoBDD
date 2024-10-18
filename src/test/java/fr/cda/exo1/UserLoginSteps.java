package fr.cda.exo1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserLoginSteps {
    @Given("A new user want to create a account")
    public void aUserCreateaAcount() {
        user = new User();

    }

    @When("a user send is 'toto@toto.com' 'Toto' and 'Pa$$word'")
    public void aUserSendIs(String userMail, String userName, String userPassword) {
        user.setUserMail(userMail);
        user.setUsername(userName);
        user.setPassword(userPassword);
    }
    @And ("the new user is add to the app")

    public void theUserIsAddToTheApp() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("toto@toto.com","Toto","Pa$$word"));

    }
   // Then there is a message who validate Register
}
