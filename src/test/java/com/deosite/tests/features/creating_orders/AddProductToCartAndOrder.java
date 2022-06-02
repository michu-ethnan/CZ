package com.deosite.tests.features.creating_orders;

import com.deosite.tests.actions.Open;
import com.deosite.tests.pages.MiniCart;
import com.deosite.tests.pages.PaymentPage;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.mainMenu.ClickCategory;
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
import static com.deosite.tests.pages.CheckoutPage.EMAIL_INPUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddProductToCartAndOrder {

    @Steps
    SetupSteps setupSteps;

    @Given("that {word} adds product to cart")
    public void that_actor_adds_product_to_cart(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                ClickCategory.byCategoryNumber(5),
                Open.productPageByPositionRandomly(),
                AddProduct.toCart()

        );
    }

    @When("he attempts to order it as {word} using courier delivery")
    public void actor_attempts_to_order_it_as_selected_user_type_using_selected_delivery_type(String userType) {
        theActorInTheSpotlight().attemptsTo(
                Open.miniCart(),
                Open.checkoutPage(),
                WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                FillInBillingData.type(userType)
        );
    }

    @And("he enters shipping address as {word}")
    public void actor_enters_shipping_address_as_selected_user_type(String userType) {
        theActorInTheSpotlight().attemptsTo(
                FillInShippingData.type(userType)
        );
    }

    @And("he attempts to pay using {word}")
    public void actor_attempts_to_pay_using_selected_payment_method(String paymentType) {
        theActorInTheSpotlight().attemptsTo(
                Pay.by(paymentType)
        );
    }

    @Then("he should be on the payment page")
    public void actor_should_see_that_he_is_on_the_payment_page() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PaymentPage.PLACE_ORDER_BUTTON, isPresent()),
                Ensure.that(PaymentPage.PLACE_ORDER_BUTTON).isDisplayed(),
                Click.on(PaymentPage.DELETE_PRODUCT_BUTTON_ON_PAYMENT_PAGE_AFTER_ORDER)
        );
    }
}
