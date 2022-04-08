package com.deosite.tests.tasks.order;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.CheckoutPage.*;

public class ChooseDelivery implements Task {

    private final String deliveryType;

    public ChooseDelivery(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    @Step("{0} chooses #deliveryType as order delivery")
    public <T extends Actor> void performAs(T actor) {
        if (deliveryType.contains("pickup")) {
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("1");
        }
        if (deliveryType.contains("courier")) {
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_COURIER)
            );
        }
    }

    public static ChooseDelivery byType(String deliveryType) {
        return Instrumented.instanceOf(ChooseDelivery.class).withProperties(deliveryType);
    }
}
