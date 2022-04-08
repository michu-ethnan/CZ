package com.deosite.tests.features.filtering;

import com.deosite.tests.actions.Search;
import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.tasks.homePage.CurrentUrl;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.basic.MoveMouseToTop;
import com.deosite.tests.tasks.categoryPage.ClickFilterButton;
import com.deosite.tests.tasks.categoryPage.ClickSelectedFilter;
import com.deosite.tests.tasks.mainMenu.ClickCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.CategoryPage.CATEGORY_HEADER;
import static com.deosite.tests.pages.CategoryPage.SUBMIT_FILTER_BUTTON;
import static com.deosite.tests.pages.CategoryPage.PAGINATION_ARROW;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;

public class ApplyFilterAndGoToNextPage {

    @Steps
    SetupSteps setupSteps;

    @Given("that {word} arrives to a category page")
    public void that_actor_arrived_to_a_category_page(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                ClickCategory.byCategoryNumber(0),
                MoveMouseToTop.move(),
                WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent())
        );
    }

    @Given("that {word} attempts to find a {word}")
    public void that_actor_arrived_to_the_search_results_page(String actor, String keyword) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                Search.forProductByTranslatedKeyword(keyword)
        );
    }

    @And("he arrives to the search results page")
    public void actor_arrives_to_the_search_results_page() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CATEGORY_HEADER, isPresent()).forNoMoreThan(50).seconds()
        );
    }

    @When("he applies some filter")
    public void actor_applies_some_filter() {
        theActorInTheSpotlight().attemptsTo(
                ClickFilterButton.number(0),
                ClickSelectedFilter.number(0),
                Click.on(SUBMIT_FILTER_BUTTON),
                WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent())
        );
    }

    @And("he goes to next page")
    public void actor_goes_to_next_page(){
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PAGINATION_ARROW, isClickable()),
                Click.on(PAGINATION_ARROW),
                WaitUntil.the(CATEGORY_HEADER, isPresent()),
                WaitUntil.the(PAGINATION_ARROW, isClickable())
        );
    }

    @Then("he should find himself on the next page")
    public void actor_should_find_himself_on_the_next_page() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ADD_TO_CART_BUTTON, isNotPresent())
        );
        theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("p=2")));
    }
}
