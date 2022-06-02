package com.deosite.tests.tasks.product;

import com.deosite.tests.actions.Open;
import com.deosite.tests.tasks.basic.ReturnToPreviousPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.Alert.ALERT_BOX;
import static com.deosite.tests.pages.MainMenu.SEARCH_BAR;
import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ReturnAndAddAnotherProduct implements Task {
    @Override
    @Step("{0} returns and adds another product")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                ReturnToPreviousPage.goToPreviousPage(),
                WaitUntil.the(SEARCH_BAR, isPresent()),
                Open.productPageByPosition(2),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(ALERT_BOX, isPresent()).forNoMoreThan(100).seconds()
        );
    }
    public static Task toCart() {
        return instrumented(ReturnAndAddAnotherProduct.class);
    }
}
