package com.deosite.tests.tasks.homePage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.HomePage.SELECT_LANGUAGE_LIST;

public class SelectLanguage implements Task {
    private final int number;
    public SelectLanguage(int number){
        this.number = number;
    }
    @Override
    @Step("{0}selcts #language")

    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(
            Click.on(SELECT_LANGUAGE_LIST.resolveAllFor(actor).get(number))
    );
    }
    public static SelectLanguage byIndexNumber(int number){
        return Instrumented.instanceOf(SelectLanguage.class).withProperties(number);
    }
}
