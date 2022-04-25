package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.tasks.basic.RefreshPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.CategoryPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ApplyFilters implements Task {

    private final String filterName;
    public ApplyFilters(String  filterName){
        this.filterName = filterName;
    }

    @Override
    @Step("{0} applies #Filters")
    public <T extends Actor> void performAs(T actor){
        if (filterName.contains("Marka")){
            actor.attemptsTo(
                    ClickFilterButton.number(0),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()


            );

        }
        if (filterName.contains("Kolekcja")){
            actor.attemptsTo(
                    ClickFilterButton.number(1),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }

        if (filterName.contains("Cena")){
            actor.attemptsTo(
                    ClickFilterButton.number(2),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("50").into(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }



        if (filterName.contains("Kolor")){
            actor.attemptsTo(
                    ClickFilterButton.number(3),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }
        if (filterName.contains("Material")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(4),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER)
            );


        }

        if (filterName.contains("Shape")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(5),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }

        if (filterName.contains("Pojemność")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(7),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }

        if (filterName.contains("Wysokość")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(8),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }
        if (filterName.contains("Szerkość")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(9),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(CategoryPage.PRICE_FILTER_INPUT),
                    WaitUntil.the(CategoryPage.FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }

        if (filterName.contains("Irlość_osób")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(11),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CategoryPage.CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()

            );

        }

        if (filterName.contains("Zastosowanie")) {
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(12),
                    ClickSelectedFilter.number(0),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(CategoryPage.APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh()
            );
        }
        actor.attemptsTo(

        );
    }

    public static ApplyFilters byFilterName(String filterName){
        return Instrumented.instanceOf(ApplyFilters.class).withProperties(filterName);
    }
}
