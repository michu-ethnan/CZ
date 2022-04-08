package com.deosite.tests.questions.homeapge;

import com.deosite.tests.pages.HomePage;

import com.deosite.tests.tasks.homePage.CurrentUrl;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.containsString;



public class CountryUrl implements Task {
    private final String selectedCountry;

    public CountryUrl(String selectedCountry){
        this.selectedCountry = selectedCountry;
    }


    @Override

    @Step("{0} shows #countryUrl")
    public <T extends Actor> void performAs(T actor){


        if (selectedCountry.contains("Czech")){
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.cz")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.cz - zahradní nábytek a nádobí")));
        }


        if (selectedCountry.contains("Poland")){
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.pl")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("Sklep DAJAR.pl - meble ogrodowe i zastawa stołowa")));


        }

        if (selectedCountry.contains("Spanish")){
             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.es")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.es - Vajillas, cocina y muebles de jardín")));

        }


        if (selectedCountry.contains("France")){

             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.fr")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.fr - Meubles de jardin, cuisine et arts de la table")));
        }


        if (selectedCountry.contains("Italy")){

             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.it")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.it - Mobili da giardino, e stoviglie da tavola e cucina")));
        }


        if (selectedCountry.contains("GB")){
             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.co.uk")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.co.uk - garden furniture and tableware")));

        }



        if (selectedCountry.contains("Romania")){
             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.ro")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("Magazinul DAJAR.ro - mobilier de grădină")));

        }


        if (selectedCountry.contains("Sweden")){

             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.se")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.se - trädgårdsmöbler och porslin")));
        }


        if (selectedCountry.contains("Slovakia")){

             theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(HomePage.DAJAR_LOGO, isPresent()).forNoMoreThan(50).seconds()
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("dajar.sk")));
            theActorInTheSpotlight().should(seeThat(PageTitle.title(), containsString("DAJAR.sk - záhradný nábytok a riad")));
        }


    }
    public static CountryUrl bySelectedCountry(String deliveryType) {
        return Instrumented.instanceOf(CountryUrl.class).withProperties(deliveryType);
    }
}
