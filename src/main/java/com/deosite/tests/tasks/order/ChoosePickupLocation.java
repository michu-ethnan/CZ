package com.deosite.tests.tasks.order;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.CheckoutPage.DELIVERY_TYPE_PICKUP_POINT;
import static com.deosite.tests.pages.CheckoutPage.PICKUP_POINT_SELECT;

public class ChoosePickupLocation implements Task {

    private final String pickupLocation;
    public ChoosePickupLocation(String pickupLocation){
        this.pickupLocation = pickupLocation;
    }
    @Override
    @Step("{0} chooses #pickupLocation")
    public <T extends Actor> void performAs(T actor) {
        if (pickupLocation.contains("Koszalin")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("1");
        }
        if (pickupLocation.contains("Słupsk")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("2");
        }
        if (pickupLocation.contains("Szczecin")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("3");
        }
        if (pickupLocation.contains("Piła")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("4");
        }
        if (pickupLocation.contains("Toruń")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("5");
        }
        if (pickupLocation.contains("Bydgoszcz")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("6");
        }
        if (pickupLocation.contains("Wrocław")){
            actor.attemptsTo(
                    Click.on(DELIVERY_TYPE_PICKUP_POINT)
            );
            PICKUP_POINT_SELECT.resolveFor(actor).selectByValue("7");
        }

    }
    public static ChoosePickupLocation byLocation(String deliveryType) {
        return Instrumented.instanceOf(ChoosePickupLocation.class).withProperties(deliveryType);
    }
}
