package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.actions.Open;
import com.deosite.tests.pages.CategoryPage;
import com.deosite.tests.questions.CategoryHeader;
import com.deosite.tests.questions.filters.FilterName;
import com.deosite.tests.tasks.basic.RefreshPage;
import com.deosite.tests.tasks.basic.ReturnToPreviousPage;
import com.deosite.tests.tasks.homePage.CurrentUrl;
import com.deosite.tests.tasks.product.MoveMouseDown;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.Matchers;


import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Locale;

import static com.deosite.tests.pages.CategoryPage.*;
import static com.deosite.tests.pages.MainMenu.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;

public class ApplyFilters implements Task {
    String filter;
    String url;
    String url2;

    String url3;
    String numberOfProductsInFilter;
    String url_filter;
    String selectedFilter;
    private final String filterName;
    public  ApplyFilters(String  filterName){
        this.filterName = filterName;
    }

    @Override
    @Step("{0} applies #Filters")
    public <T extends Actor> void performAs(T actor){

        /*MARKA*/


        if (filterName.contains("Marka")){
            actor.attemptsTo(
                    ClickFilterButton.number(0)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","").replaceAll("\\s+", "");
            url_filter = selectedFilter;
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );

                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );

            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString(url_filter.toLowerCase(Locale.ROOT))));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));

        }


        /*KOLEKCJA*/


        if (filterName.contains("Kolekcja")){
            int maxLength = 5;
            actor.attemptsTo(
                    ClickFilterButton.number(1)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());
            if(filter.length()>maxLength){
                url_filter = filter.substring(0,5).replace("(","").replace(")","").replaceAll("\\s+", "").replaceAll("[0-9]", "").replaceAll("[^\\x00-\\x7f]", "");
            }
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","");
            //url_filter = StringUtils.stripAccents(url_filter);
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );

                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );

            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString(url_filter.toLowerCase(Locale.ROOT))));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));



        }

        /*CENA*/


        if (filterName.contains("Cena")){
            actor.attemptsTo(
                    ClickFilterButton.number(2),
                    WaitUntil.the(PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(PRICE_FILTER_INPUT),
                    WaitUntil.the(PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("50").into(PRICE_FILTER_INPUT),
                    WaitUntil.the(FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())

            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("final_price-50")));


        }

        /*KOLOR*/


        if (filterName.contains("Kolor")){

            actor.attemptsTo(
                    ClickFilterButton.number(3)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","").replaceAll("\\s+", "");
            url_filter = (selectedFilter);
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );
                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER)

            );

            url2= CurrentUrl.information().answeredBy(theActorInTheSpotlight());
            try {
                url = new URI(url2).getPath();
                System.out.println("the converted url " + url);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            theActorInTheSpotlight().attemptsTo(Ensure.that(url).contains(url_filter.toLowerCase(Locale.ROOT)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));



        }

        /*MATERIAL*/


        if (filterName.contains("Material")){
            int maxLength = 8;
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(4)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());

            if(filter.length()>maxLength){
                url_filter = filter.substring(0,8).replace("(","").replace(")","").replaceAll("\\s+", "").replaceAll("[0-9]", "");
            }
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","");
            //url_filter = (url_filter);
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );

            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );
                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent()),
                    Click.on(ALL_FILTERS_BUTTON_AFTER_APPLYING_FILTER)
            );
            url2= CurrentUrl.information().answeredBy(theActorInTheSpotlight());
            try {
                url = new URI(url2).getPath();
                System.out.println("the converted url " + url);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            theActorInTheSpotlight().attemptsTo(Ensure.that(url).contains(url_filter.toLowerCase(Locale.ROOT)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));

        }


        /*KSZTAŁT*/


        if (filterName.contains("Shape")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(5)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","").replaceAll("\\s+", "");
            url_filter = selectedFilter;
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);
            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );
                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));

            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );
            url2= CurrentUrl.information().answeredBy(theActorInTheSpotlight());
            try {
                url = new URI(url2).getPath();
                System.out.println("the converted url " + url);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            theActorInTheSpotlight().attemptsTo(Ensure.that(url).contains(url_filter.toLowerCase(Locale.ROOT)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));

        }


        /*POJEMNOŚĆ*/

        if (filterName.contains("Pojemność")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(7),
                    WaitUntil.the(PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(PRICE_FILTER_INPUT),
                    WaitUntil.the(PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(PRICE_FILTER_INPUT),
                    WaitUntil.the(FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("capacity-10")));

        }

        /*WYSOKOŚĆ*/

        if (filterName.contains("Wysokość")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(8),
                    WaitUntil.the(PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(PRICE_FILTER_INPUT),
                    WaitUntil.the(PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(PRICE_FILTER_INPUT),
                    WaitUntil.the(FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("height-10")));


            /*SZERKOŚĆ*/

        }
        if (filterName.contains("Szerkość")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(9),
                    WaitUntil.the(PRICE_FILTER_INPUT, isPresent()).forNoMoreThan(50).seconds(),
                    Clear.field(PRICE_FILTER_INPUT),
                    WaitUntil.the(PRICE_FILTER_INPUT, isClickable()),
                    SendKeys.of("10").into(PRICE_FILTER_INPUT),
                    WaitUntil.the(FILTER_BUTTON, isPresent()).forNoMoreThan(50).seconds(),
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    WaitUntil.the(PAGINATION_ARROW, isClickable()),
                    Click.on(PAGINATION_ARROW),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("width-10")));



            /*IRLOŚĆ OSÓB*/

        }

        if (filterName.contains("Irlość_osób")){
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(11)
            );
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());

            String firstTwoCharacters = filter.substring(0,2);

            if (firstTwoCharacters.contains(" ")){
                selectedFilter = filter.replace("(","").replace(")","").replaceAll("\\s+", "").substring(0,1);
                url_filter = selectedFilter;
                numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "").substring(1);

            }
            else {
                selectedFilter = filter.replace("(","").replace(")","").replaceAll("\\s+", "").substring(0,2);
                url_filter = StringUtils.stripAccents(selectedFilter.replaceAll("\\s+", ""));
                numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "").substring(2);
            }

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            if (PAGINATION_ARROW.resolveFor(actor).isPresent()){
                actor.attemptsTo(
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        WaitUntil.the(PAGINATION_ARROW, isClickable()),
                        Click.on(PAGINATION_ARROW),
                        WaitUntil.the(CATEGORY_HEADER, isPresent()),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                        RefreshPage.refresh(),
                        Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
                );
                theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), Matchers.containsString("p=2")));
            }
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );

            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString(url_filter.toLowerCase(Locale.ROOT))));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));

        }

        /*ZASTOSOWANIE*/


        if (filterName.contains("Zastosowanie")) {
            actor.attemptsTo(
                    Click.on(ALL_FILTERS_BUTTON),
                    ClickFilterButton.number(12));
            filter = FilterName.filterName().answeredBy(theActorInTheSpotlight());
            selectedFilter = filter.replace("(","").replaceAll("[0-9]", "").replace(")","").replaceAll("\\s+", "");
            url_filter = selectedFilter;
            numberOfProductsInFilter = filter.replace("(","").replaceAll("[^\\d.]", "").replace(")","").replaceAll("\\/","").replaceAll("\\s+", "");

            System.out.println("The selected filter name: " + selectedFilter);
            System.out.println("Filter name in url: " + url_filter.toLowerCase(Locale.ROOT));
            System.out.println("Number of products in the selected filter: " + numberOfProductsInFilter);

            actor.attemptsTo(
                    Click.on(SUBMIT_FILTER_BUTTON),
                    WaitUntil.the(SUBMIT_FILTER_BUTTON, isNotPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed(),
                    RefreshPage.refresh(),
                    WaitUntil.the(CLOSE_NEWSLETTER_POPUP, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CLOSE_NEWSLETTER_POPUP),
                    WaitUntil.the(CATEGORY_HEADER, isPresent()),
                    Ensure.that(APPLIED_FILTER_BOX).isDisplayed()
            );
            actor.attemptsTo(
                    Open.productPageByPositionRandomly(),
                    MoveMouseDown.move(),
                    ReturnToPreviousPage.goToPreviousPage(),
                    WaitUntil.the(FILTER_BUTTONS, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString(url_filter.toLowerCase(Locale.ROOT))));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(selectedFilter)));
            theActorInTheSpotlight().should(seeThat(CategoryHeader.valueIs(), containsString(numberOfProductsInFilter)));
        }
    }

    public static ApplyFilters byFilterName(String filterName){
        return Instrumented.instanceOf(ApplyFilters.class).withProperties(filterName);
    }
}
