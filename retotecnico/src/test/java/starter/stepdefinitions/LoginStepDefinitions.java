package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import starter.builders.Login;
import starter.navigation.NavigateTo;
import starter.questions.dashboard.OverviewData;
import starter.ui.dashboard.DashboardPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    String name;

    @Given("(.*) wants to register an account.")
    public void has_an_active_account(String name) {
        this.name = name;
    }

    @When("she sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                DoLogin.withCredentials(
                        name = "Maira",
                        lastname = "González",
                        email = "gonzalez12an12@gmail.com",
                        birthmonth = "July",
                        birthday = "11", birthyear = "1999", zip = "0000",
                        password = "seguridad",
                        conpassword = "Seguridad22"
                )
        );
    }

    @Then("she should be able to create her account.")
    public void he_should_have_access_to_manage_his_account() {
        theActorInTheSpotlight().should(
                seeThat("The displayed", OverviewData.creditAvailable(), equalTo("Welcome to the world's largest community of freelance software testers!")),
                seeThat("The displayed", OverviewData.creditAvailable(), equalTo("Welcome to the world's largest community of freelance software testers!"))
        );

        theActorInTheSpotlight().attemptsTo(
                Click.on(DashboardPage.LEFT_MENU.NAME_TITLE)
        );
    }
}
