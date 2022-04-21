package com.deosite.tests.features.navigating_website;

import com.deosite.tests.pages.CookiesNotification;
import com.deosite.tests.pages.HomePage;
import com.deosite.tests.pages.MainMenu;
import com.deosite.tests.questions.homeapge.CountryUrl;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.homePage.ChooseLanguage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.HomePage.*;
import static com.deosite.tests.pages.HomePage.FOOTER_ELEMENTS;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectLanguage {
    @Steps
    SetupSteps setupSteps;
@Given("that {word} wants to change the language")
    public void neveah_wants_to_change_language(String actor){
    theActorCalled(actor).wasAbleTo(
            Setup.site(),
            WaitUntil.the(SEARCH_BAR, isPresent())
    );
}
@When("she selects {word} from the list")
    public void neveah_selects_the_language(String chooseLanguage){
    theActorInTheSpotlight().wasAbleTo(
            Scroll.to(HomePage.SELECT_LANGUAGE),
            Click.on(SELECT_LANGUAGE),
            WaitUntil.the(SELECT_LANGUAGE_LIST, isPresent()),
            ChooseLanguage.byLanguage(chooseLanguage),
            WaitUntil.the(CookiesNotification.ACCEPT_COOKIES_BUTTON, isPresent()),
            Click.on(CookiesNotification.ACCEPT_COOKIES_BUTTON),
            WaitUntil.the(SEARCH_BAR, isPresent())
    );
}
@Then("she should be on the {word} page")
    public void neveah_should_see_the_selected_language_page(String selectedCountry){
    theActorInTheSpotlight().attemptsTo(
            CountryUrl.bySelectedCountry(selectedCountry)
    );
}
@And("she should see that the homepage is working")
    public void neveah_should_see_the_homepage_elements(){
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
            Scroll.to(FOOTER),
            Ensure.that(FOOTER).isDisplayed(),
            Ensure.that(FOOTER_ELEMENTS).isEnabled(),
            Ensure.that(FOOTER_ELEMENTS).isDisplayed()

    );
}
}
