package com.deosite.tests.features.creating_orders;

import com.deosite.tests.actions.Open;
import com.deosite.tests.actions.Search;
import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.pages.CheckoutPage;
import com.deosite.tests.pages.MiniCart;
import com.deosite.tests.pages.PaymentPage;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.login.FillInLoginForm;
import com.deosite.tests.tasks.login.SubmitLoginForm;
import com.deosite.tests.tasks.order.*;
import com.deosite.tests.tasks.product.AddProduct;
import com.deosite.tests.tasks.product.MoveMouseDown;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.abilities.Load.as;
import static com.deosite.tests.pages.CheckoutPage.SHIPPING_ADDRESS_IS_THE_SAME_CHECKBOX;
import static com.deosite.tests.pages.LoginPage.*;
import static com.deosite.tests.pages.MainMenu.MINI_CART_BUTTON_AFTER_LOGIN;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class OrderProductsLoggedIn {

    @Steps
    SetupSteps setupSteps;

    @Given("that {word} is logged in 1")
    public void that_actor_is_logged_in_1(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(LOGIN_BUTTON, isPresent()),
                Open.loginPage(),
                WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                FillInLoginForm.type("login to order_1"),
                SubmitLoginForm.submitLoginForm(),
                WaitUntil.the(SEARCH_BAR, isPresent())
        );
    }
    @Given("that {word} is logged in 2")
    public void that_actor_is_logged_in_2(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(LOGIN_BUTTON, isPresent()),
                Open.loginPage(),
                WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                FillInLoginForm.type("login to order_2"),
                SubmitLoginForm.submitLoginForm(),
                WaitUntil.the(SEARCH_BAR, isPresent())
        );
    }
    @Given("that {word} is logged in 3")
    public void that_actor_is_logged_in_3(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(LOGIN_BUTTON, isPresent()),
                Open.loginPage(),
                WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                FillInLoginForm.type("login to order_3"),
                SubmitLoginForm.submitLoginForm(),
                WaitUntil.the(SEARCH_BAR, isPresent())
        );
    }

    @When("he orders {string} using courier delivery")
    public void actor_orders_product_using_chosen_delivery(String product) {
        theActorInTheSpotlight().attemptsTo(
                Search.forProductByTranslatedKeyword(product),
                WaitUntil.the(CategoryPage.PAGINATION_ARROW, isPresent()),
                Open.productPageByPositionRandomly(),
                AddProduct.toCart(),
                Open.miniCart(),
                Open.checkoutPage(),
                WaitUntil.the(CheckoutPage.EMAIL_INPUT, isPresent()).forNoMoreThan(100).seconds(),
                WaitUntil.the(CheckoutPage.SUBMIT_BUTTON, isPresent()).forNoMoreThan(50).seconds()
        );
    }

    @And("he changes billing address")
    public void actor_changes_billing_address() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CheckoutPage.BILLING_ADDRESS_SELECT),
                SelectBillingAddress.byBillingAddress(1));
    }

    @And("he clicks the same shipping address checkbox")
    public void actor_clicks_the_same_shipping_address_checkbox() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SHIPPING_ADDRESS_IS_THE_SAME_CHECKBOX, isPresent()),
                Click.on(SHIPPING_ADDRESS_IS_THE_SAME_CHECKBOX)
        );
    }

    @And("he changes shipping address")
    public void actor_changes_shipping_address() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CheckoutPage.SHIPPING_ADDRESS_CHECKBOX),
                Click.on(CheckoutPage.SHIPPING_ADDRESS_SELECT),
                SelectShippingAddress.byShippingAddress(1),
                WaitUntil.the(CheckoutPage.SUBMIT_BUTTON, isClickable()).forNoMoreThan(50).seconds()
        );
    }

    @And("he selects {word} payment")
    public void actor_pays_using_selected_payment(String paymentType) {
        theActorInTheSpotlight().attemptsTo(
                PayAfterLogin.by(paymentType)
        );
    }

    @Then("he should ensure that he is on the payment page")
    public void actor_should_place_order() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PaymentPage.PLACE_ORDER_BUTTON, isPresent()),
                Ensure.that(PaymentPage.PLACE_ORDER_BUTTON).isDisplayed(),
                Click.on(PaymentPage.DELETE_PRODUCT_BUTTON_ON_PAYMENT_PAGE_AFTER_ORDER)
        );
    }
}
