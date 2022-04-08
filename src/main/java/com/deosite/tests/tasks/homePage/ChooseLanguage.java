package com.deosite.tests.tasks.homePage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


import static com.deosite.tests.pages.HomePage.SELECT_LANGUAGE;

public class ChooseLanguage implements Task {

    private final String chooseLanguage;
    public ChooseLanguage(String chooseLanguage){
        this.chooseLanguage = chooseLanguage;
    }
    @Override
    @Step("{0} chooses #Language")

    public <T extends Actor> void performAs(T actor){
        if (chooseLanguage.contains("German")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("de");
        }
        if (chooseLanguage.contains("Poland")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("pl");

        }
        if (chooseLanguage.contains("Spanish")){
            actor.attemptsTo();
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("es");

        }
        if (chooseLanguage.contains("France")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("fr");

        }
        if (chooseLanguage.contains("Italy")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("it");

        }
        if (chooseLanguage.contains("GB")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("gb");

        }
        if (chooseLanguage.contains("Romania")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("ro");

        }
        if (chooseLanguage.contains("Sweden")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("se");

        }
        if (chooseLanguage.contains("Slovakia")){
            actor.attemptsTo(

            );
            SELECT_LANGUAGE.resolveFor(actor).selectByValue("sk");
        }

    }

    public static ChooseLanguage byLanguage(String deliveryType) {
        return Instrumented.instanceOf(ChooseLanguage.class).withProperties(deliveryType);
    }
}
