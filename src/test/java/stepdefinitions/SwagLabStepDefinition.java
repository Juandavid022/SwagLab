package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import questions.AnswerFinishPurchase;
import questions.AnswerLoginLocked;
import tasks.*;
import userinterface.CheckOutComplete;
import userinterface.CheckOutSecondStepPage;

public class SwagLabStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan wants login in SauceLab$")
    public void thatJuanWantsLoginInSauceLab() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }

    @When("^he click a (.*) change the page$")
    public void heSearchABackpack(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchItems.the(item));
    }

    @Then("^he finds the backpack (.*)$")
    public void heFindsTheBackpack(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

    @When("^click in the add to cart$")
    public void clickInTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.OnThePage());
    }

    @When("^click in the cart button$")
    public void clickInTheCartbutton() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenCart.OnThePage());
    }


    @When("^input name (.*) last name (.*) and postal code (.*) and click in continue$")
    public void inputNameLastNameAndPostalCode(String arg1, String arg2, String arg3) {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckOutSteps.OnThePage(arg1, arg2, arg3));

    }


    @Then("^must validate the text (.*)$")
    public void mustValidateTheText(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerFinishPurchase.toThe(question)));
    }


    @When("^click of button add to cart of backpack$")
    public void clickOfButtonAddToCartOfBackpack() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.OnThePage());
    }

    @When("^click in checkout$")
    public void clickInCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckOut.OnThePage());
    }


    @When("^click in finish$")
    public void clickInFinish() {
        OnStage.theActorInTheSpotlight().attemptsTo(FinishPurchase.OnThePage());

    }

    @Given("^that Juan wants login in SauceLab with credential locked$")
    public void thatJuanWantsLoginInSauceLabWithCredentialLocked() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (LoginLocked.OnThePage()));

    }

    @Then("^must report has been locked with the text (.*)$")
    public void mustreporthasbeenlocked(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLoginLocked.toThe(question)));

    }

//    @When("^verify element in the page and wait for it$")
//    public void verifyelementinthepageandwaitforit() {
//        OnStage.theActorInTheSpotlight().attemptsTo(.delaySecond());
//
//    }


}


