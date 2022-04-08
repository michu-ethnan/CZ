package com.deosite.tests.questions.account;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.Subject;


import static com.deosite.tests.pages.AccountPage.ORDER_NUMBER;

@Subject("Is order number displayed")
public class OrderNumber implements Question<Boolean> {

    @Override
    public Boolean answeredBy (Actor actor) {
        return ORDER_NUMBER.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> isDisplayed() {
        return new OrderImage();
    }
}
