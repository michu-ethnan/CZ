package com.deosite.tests.features.creating_orders;

import com.deosite.tests.actions.Open;
import com.deosite.tests.pages.PaymentPage;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.basic.MoveMouseToTop;
import com.deosite.tests.tasks.brandPage.ClickBrand;
import com.deosite.tests.tasks.categoryPage.OpenInspirations;
import com.deosite.tests.tasks.categoryPage.SelectCategory;
import com.deosite.tests.tasks.mainMenu.ClickCategory;
import com.deosite.tests.tasks.order.FillInBillingData;
import com.deosite.tests.tasks.product.AddProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.CategoryPage.CATEGORY_HEADER;
import static com.deosite.tests.pages.CheckoutPage.EMAIL_INPUT;
import static com.deosite.tests.pages.CheckoutPage.SUBMIT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class OrderProductsFromCategories {
    @Steps
    SetupSteps setupSteps;

@Given("that {word} wants to order products from {word}")
    public void alex_wants_to_order_from_categories(String actor, String categoryName){
    theActorCalled(actor).wasAbleTo(
            Setup.site(),
            SelectCategory.byName(categoryName),
            WaitUntil.the(CATEGORY_HEADER, isPresent())
    );
}
    @Given("that {word} wants to order products from Marki page")
    public void alex_wants_to_order_from_marki(String actor){
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                ClickCategory.byCategoryNumber(8),
                WaitUntil.the(CATEGORY_HEADER, isPresent()),
                ClickBrand.byBrand(0)
        );
}


@When("she adds a product from category page")
    public void alex_adds_product_from_category_page(){
    theActorInTheSpotlight().attemptsTo(
            Open.productPageByPosition(2),
            AddProduct.toCart(),
            Open.miniCart()

    );

}
@And("goes to checkout as a {word}")
    public void alex_goes_to_checkout_as_a_person(String userType){
           theActorInTheSpotlight().attemptsTo(
                   Open.checkoutPage(),
                   WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                   FillInBillingData.type(userType),
                   WaitUntil.the(SUBMIT_BUTTON, isClickable()),
                   Click.on(SUBMIT_BUTTON)
           );
}
@Then("she should be able to see that she on payment page")
    public void alex_should_see_that_she_is_on_payment_page(){
    theActorInTheSpotlight().attemptsTo(
            Ensure.that(PaymentPage.PLACE_ORDER_BUTTON).isDisplayed(),
            Click.on(PaymentPage.DELETE_PRODUCT_BUTTON_ON_PAYMENT_PAGE_AFTER_ORDER)
    );
}
}

