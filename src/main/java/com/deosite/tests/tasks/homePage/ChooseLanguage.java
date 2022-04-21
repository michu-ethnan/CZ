package com.deosite.tests.tasks.homePage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

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
                    SelectLanguage.byIndexNumber(1)
            );

        }
        if (chooseLanguage.contains("Poland")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(4)
            );


        }
        if (chooseLanguage.contains("Spanish")){
            actor.attemptsTo(SelectLanguage.byIndexNumber(2));


        }
        if (chooseLanguage.contains("France")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(3)
            );


        }
        if (chooseLanguage.contains("Italy")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(5)
            );


        }
        if (chooseLanguage.contains("GB")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(6)
            );


        }
        if (chooseLanguage.contains("Romania")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(7)
            );


        }
        if (chooseLanguage.contains("Sweden")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(8)
            );


        }
        if (chooseLanguage.contains("Slovakia")){
            actor.attemptsTo(
SelectLanguage.byIndexNumber(9)
            );

        }

    }

    public static ChooseLanguage byLanguage(String deliveryType) {
        return Instrumented.instanceOf(ChooseLanguage.class).withProperties(deliveryType);
    }
}
