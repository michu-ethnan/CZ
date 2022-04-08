package com.deosite.tests.features.navigating_website;

import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.pages.HomePage;
import com.deosite.tests.pages.MainMenu;
import com.deosite.tests.questions.homeapge.PageTitle;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.HomePage.*;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.containsString;

public class BrowseHomePage {
    @Steps
    SetupSteps setupSteps;

    @Given("that {word} opens the main page")
    public void alex_wants_to_open_the_main_page(String actor){
        theActorCalled(actor).wasAbleTo(
                Setup.site()
        );
    }
    @When("she opens the url")
    public void alex_opens_the_url(){
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SEARCH_BAR, isPresent())
        );
    }
    @Then ("she should be on the homepage and make sure the objects are present")
    public void alex_should_be_on_the_home_page(){
        theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.cz - zahradní nábytek a nádobí")));
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.DAJAR_LOGO).isDisplayed(),
                Ensure.that(HomePage.MAIN_BANNER).isDisplayed(),
                Ensure.that(SEARCH_BAR).isDisplayed(),
                Ensure.that(MainMenu.CATEGORY_LIST).isEnabled(),
                Ensure.that(MainMenu.MINI_CART_BUTTON).isEnabled(),
                Ensure.that(MainMenu.MINI_CART_BUTTON).isDisplayed(),
                Ensure.that(MainMenu.FIRST_MAIN_CATEGORY).isEnabled(),
                Ensure.that(POPULAR_PRODUCTS_LIST).isDisplayed(),
                Scroll.to(POPULAR_PRODUCTS_LIST),
                WaitUntil.the(LEFT_ARROW_POPULAR_PRODUCTS, isPresent()),
                Ensure.that(HomePage.LEFT_ARROW_POPULAR_PRODUCTS).isEnabled(),
                Ensure.that(SECOND_BANNER).isDisplayed(),
                Ensure.that(OKAZJE).isDisplayed(),
                Ensure.that(OKAZJE).isEnabled(),
                Scroll.to(THIRD_BANNER),
                Ensure.that(THIRD_BANNER).isEnabled(),
                Ensure.that(THIRD_BANNER).isDisplayed(),
                Ensure.that(NEW_PRODUCTS).isEnabled(),
                Ensure.that(NEW_PRODUCTS).isDisplayed(),
                Scroll.to(HOMEPAGE_INSPIRATIONS),
                Ensure.that(HOMEPAGE_INSPIRATIONS).isEnabled(),
                Ensure.that(HOMEPAGE_INSPIRATIONS).isDisplayed(),
                Scroll.to(FOURTH_BANNER),
                Ensure.that(FOURTH_BANNER).isEnabled(),
                Ensure.that(FOURTH_BANNER).isEnabled(),
                Scroll.to(RECOMMENDED_CATEGORIES),
                Ensure.that(RECOMMENDED_CATEGORIES).isEnabled(),
                Ensure.that(RECOMMENDED_CATEGORIES).isDisplayed(),
                Scroll.to(FIFTH_BANNER),
                Ensure.that(FIFTH_BANNER).isDisplayed(),
                Ensure.that(FIFTH_BANNER).isEnabled(),
                Scroll.to(INSTAGRAM),
                Ensure.that(INSTAGRAM).isEnabled(),
                Ensure.that(INSTAGRAM).isDisplayed(),
                Scroll.to(NEWS_LETTER),
                Ensure.that(NEWS_LETTER).isDisplayed(),
                WaitUntil.the(NEWS_LETTER, isClickable()),
                Ensure.that(NEWS_LETTER).isEnabled(),
                Scroll.to(FOOTER),
                Ensure.that(FOOTER).isDisplayed(),
                Ensure.that(FOOTER_ELEMENTS).isEnabled(),
                Ensure.that(FOOTER_ELEMENTS).isDisplayed()

                );
    }
}
