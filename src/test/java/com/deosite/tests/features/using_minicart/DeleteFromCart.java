package com.deosite.tests.features.using_minicart;

import com.deosite.tests.actions.Search;
import com.deosite.tests.actions.Open;
import com.deosite.tests.pages.*;
import com.deosite.tests.questions.minicart.EmptyCartMessage;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.basic.MoveMouseToTop;
import com.deosite.tests.tasks.product.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.abilities.Load.as;
import static com.deosite.tests.pages.Alert.ALERT_BOX;
import static com.deosite.tests.pages.Alert.CLOSE_ALERT_BOX_BUTTON;
import static com.deosite.tests.pages.LoginPage.SUBMIT_BUTTON;
import static com.deosite.tests.pages.MiniCart.MINICART_BUTTON;
import static com.deosite.tests.pages.MiniCart.DELETE_PRODUCT_BUTTON;
import static com.deosite.tests.pages.MiniCart.EMPTY_CART_MESSAGE;
import static com.deosite.tests.pages.SearchPage.PRODUCTS_TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class DeleteFromCart {

    @Steps
    SetupSteps setupSteps;

    @Given("that {word} has a {word} in minicart")
    public void that_actor_has_a_product_in_minicart(String actor, String product) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                Search.forProductByTranslatedKeyword(product),
                MoveMouseToTop.move(),
                WaitUntil.the(PRODUCTS_TITLE, isPresent()).forNoMoreThan(50).seconds(),
                Open.productPageByPosition(0),
                AddProduct.toCart(),
                Click.on(CLOSE_ALERT_BOX_BUTTON),
                Click.on(MINICART_BUTTON)
        );
    }

    @When("she deletes it")
    public void actor_deletes_it() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DELETE_PRODUCT_BUTTON, isClickable()),
                Click.on(DELETE_PRODUCT_BUTTON),
                WaitUntil.the(EMPTY_CART_MESSAGE, isPresent()).forNoMoreThan(100).seconds(),
                Ensure.that(SUBMIT_BUTTON).isNotDisplayed()
        );
    }

    @Then("she should see the cart is empty message")
    public void actor_should_see_that_the_cart_is_empty() {
        theActorInTheSpotlight().should(seeThat(EmptyCartMessage.value(), containsString("V košíku nemáte žádné produkty")
        ));

    }
}
