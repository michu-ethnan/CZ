package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.pages.CategoryPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.BrandPage.BRAND_LIST;
import static com.deosite.tests.pages.CategoryPage.*;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class EnsurePageContent implements Task {
    private final String categoryName;
    public EnsurePageContent(String categoryName){
        this.categoryName = categoryName;
    }

    @Override
    @Step("{0} ensures #categorContent")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent())
        );
        switch (categoryName) {

            case "Ogród":
            case "Jadalnia":
            case "Kuchnia":
            case "ŁazienkaIgarderoba":
            case "Dekoracje":
            case "ŚwiatDziecka":
            case "Nowości":
            case "Wyprzedaż":

                actor.attemptsTo(
                        Ensure.that(GO_TO_MAIN_PAGE_BUTTON).isEnabled(),
                        Ensure.that(FILTERS_LIST).isDisplayed(),
                        Ensure.that(SORTING_BUTTON).isDisplayed(),
                        Ensure.that(PAGINATION_ARROW).isDisplayed(),
                        Ensure.that(PAGINATION_SELECT).isDisplayed(),
                        Ensure.that( SIDE_MENU).isDisplayed(),
                        Ensure.that( SIDE_MENU).isEnabled(),
                        Scroll.to(PAGINATION_ARROW_BOTTOM),
                        Ensure.that(PAGINATION_ARROW_BOTTOM).isEnabled(),
                        Ensure.that(PAGINATION_SELECT_BOTTOM).isEnabled()
                );
                break;
            case "Marki":
                actor.attemptsTo(
                        Ensure.that(BRAND_LIST).isDisplayed()
                );
                break;

        }


        }

    public static EnsurePageContent by(String categoryName) {
        return Instrumented.instanceOf(EnsurePageContent.class).withProperties(categoryName);
    }
}
