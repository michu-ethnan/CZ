package com.deosite.tests.features.navigating_website;

import com.deosite.tests.actions.Search;
import com.deosite.tests.pages.SearchPage;
import com.deosite.tests.questions.product.Product;
import com.deosite.tests.questions.product.QuickSearchProductName;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.categoryPage.SelectProductFromQuickSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Keys;

import static com.deosite.tests.abilities.Load.as;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static com.deosite.tests.pages.SearchPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.containsString;

public class QuickSearch {
    @Steps
    SetupSteps setupSteps;

    @Given("that {word} attempts to search for a product")
    public void allen_attempts_to_search_for_a_product(String actor){
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                WaitUntil.the(SEARCH_BAR, isPresent())
        );
    }
    @When("he enters the first two keys of the product he is searching for")
    public void allen_enters_the_first_two_keys(){
        theActorInTheSpotlight().attemptsTo(
              Enter.keyValues("zah").into(SEARCH_BAR)
        );
    }
    @And("he chooses one product from the list")
    public void allen_picks_one_product(){
        theActorInTheSpotlight().attemptsTo(
                SelectProductFromQuickSearch.select(0),
                WaitUntil.the(ADD_TO_CART_BUTTON, isPresent())
        );

    }
    @Then("she should see the results contain the search keyword")
    public  void allen_should_see_that_the_results_contain_the_keyword(){
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(QUICK_SEARCH_PRODUCTS_TITLE, isPresent())
        );
        theActorInTheSpotlight().should(seeThat(QuickSearchProductName.nameOfAProductOnQuickSearchBoxByPosition(0), containsString("Zah")
        ));
    }

    @Then("she should see the quick search list")
    public void allen_should_see_the_quick_search_list(){
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(SearchPage.QUICK_SEARCH_LIST).isEnabled()
        );
    }
    @Then("he should be on pdp")
    public void allen_should_be_on_pdp(){
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ADD_TO_CART_BUTTON).isEnabled()
        );
    }
}
