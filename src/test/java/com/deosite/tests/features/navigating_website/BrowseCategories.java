package com.deosite.tests.features.navigating_website;

import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.questions.account.MyAccountHeader;
import com.deosite.tests.questions.category.CategoryHeader;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.basic.MoveMouseToTop;
import com.deosite.tests.tasks.categoryPage.EnsurePageContent;
import com.deosite.tests.tasks.categoryPage.SelectCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.abilities.Load.as;
import static com.deosite.tests.pages.CategoryPage.CATEGORY_HEADER;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.Matchers.equalTo;

public class BrowseCategories {
@Steps
    SetupSteps setupSteps;

@Given("that {word} wants to open a category page")
    public void wiktoria_wants_to_open_category_page(String actor){
    theActorCalled(actor).wasAbleTo(
            Setup.site(),
            WaitUntil.the(SEARCH_BAR, isPresent())
    );

    }
    @When("she selects category {word}")
    public void wiktoria_selects_category(String categoryName){
    theActorInTheSpotlight().attemptsTo(
            SelectCategory.byName(categoryName),
            MoveMouseToTop.move(),
            WaitUntil.the(CATEGORY_HEADER, isPresent())
    );
    }
@Then("she should see the {string}")
    public void wiktoria_should_see_the_category_header(String categoryName){
    theActorInTheSpotlight().attemptsTo(
            WaitUntil.the(CATEGORY_HEADER, isPresent()).forNoMoreThan(50).seconds()
    );
   theActorInTheSpotlight().should(seeThat(CategoryHeader.Value(), equalTo(as(theActorInTheSpotlight()).translate(categoryName))));

}
    @And("she should ensure that {word} contents are present")
    public void wiktoria_ensures_category_page_contents_are_present(String categoryName){
    theActorInTheSpotlight().attemptsTo(
            EnsurePageContent.by(categoryName)
    );

        }

}
