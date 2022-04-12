package com.deosite.tests.features.using_minicart;

import com.deosite.tests.actions.Open;
import com.deosite.tests.actions.Search;
import com.deosite.tests.questions.alert.Alert;
import com.deosite.tests.questions.minicart.ProductNameInMinicart;
import com.deosite.tests.questions.product.ProductName;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.basic.MoveMouseToTop;
import com.deosite.tests.tasks.mainMenu.ClickCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.Alert.ALERT_BOX;
import static com.deosite.tests.pages.Alert.CLOSE_ALERT_BOX_BUTTON;
import static com.deosite.tests.pages.CategoryPage.CATEGORY_HEADER;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static com.deosite.tests.pages.SearchPage.PRODUCTS_TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.containsString;

public class AddItemsToCart {

    @Steps
    SetupSteps setupSteps;
    String addedProduct;
    String productInMinicart;

    @Given("that {word} has opened product page of a(n) {word}")
    public void that_actor_has_opened_product_page(String actor, String product) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(SEARCH_BAR, isPresent()).forNoMoreThan(100).seconds(),
                Search.forProductByTranslatedKeyword(product),
                MoveMouseToTop.move(),
                WaitUntil.the(PRODUCTS_TITLE, isPresent()).forNoMoreThan(50).seconds(),
                Open.productPageByPosition(0)
        );
    }
    @Given("that {word} has clicked a product from a certain category")
    public void that_actor_has_opened_product_page_from_a_certain_category(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(SEARCH_BAR, isPresent()).forNoMoreThan(100).seconds(),
                ClickCategory.byCategoryNumber(0),
                WaitUntil.the(CATEGORY_HEADER, isPresent()),
                Open.productPageByPosition(0)
        );
    }

    @When("(s)he tries to add it to cart")
    public void actor_tries_to_add_product_to_cart() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ADD_TO_CART_BUTTON, isClickable()).forNoMoreThan(100).seconds(),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(ALERT_BOX, isPresent()).forNoMoreThan(100).seconds()
        );
        addedProduct = ProductName.productName().answeredBy(theActorInTheSpotlight());
    }


@Then("ensure that the product is in minicart")
    public void actor_should_ensure_that_the_product_is_in_minicart(){
    theActorInTheSpotlight().attemptsTo(
            Open.miniCart()
    );
    productInMinicart = ProductNameInMinicart.productNameInMinicart().answeredBy(theActorInTheSpotlight());
    theActorInTheSpotlight().attemptsTo();
    Ensure.that(addedProduct).isEqualTo(productInMinicart);
}

}
