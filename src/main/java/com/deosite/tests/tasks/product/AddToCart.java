package com.deosite.tests.tasks.product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.Alert.ALERT_BOX;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AddToCart implements Task {

    @Override
    @Step("{0} adds product to cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ADD_TO_CART_BUTTON, isPresent()).forNoMoreThan(100).seconds(),
                WaitUntil.the(ADD_TO_CART_BUTTON, isClickable()).forNoMoreThan(100).seconds(),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(ALERT_BOX, isPresent()).forNoMoreThan(100).seconds()
        );
    }
}
