package com.deosite.tests.tasks.order;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.CheckoutPage.DELIVERY_TYPE_PICKUP_POINT;
import static com.deosite.tests.pages.CheckoutPage.PICKUP_POINT_SELECT;

public class SelectPickupLocationByName implements Task {
    private final String locationName;
    public SelectPickupLocationByName (String locationName){
        this.locationName = locationName;
    }
    @Override
    @Step("{0} selects #pickup_location_by_name")

    public <T extends Actor> void performAs(T actor){


        actor.attemptsTo(
                Click.on(DELIVERY_TYPE_PICKUP_POINT),
                Click.on(PICKUP_POINT_SELECT)
        );
        if (locationName.contains("Koszalin")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(0)

            );
        }

        if (locationName.contains("Słupsk")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(1)
            );
        }

        if (locationName.contains("Szczecin")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(2)
            );
        }

        if (locationName.contains("Piła")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(3)
            );
        }

        if (locationName.contains("Toruń")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(4)
            );
        }

        if (locationName.contains("Bydgoszcz")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(5)
            );
        }

        if (locationName.contains("Wrocław")){
            actor.attemptsTo(
                    SelectPickUpLocation.byLocation(6)
            );
        }
    }
    public static SelectPickupLocationByName byLocationName(String locationName){
        return Instrumented.instanceOf(SelectPickupLocationByName.class).withProperties(locationName);
    }
}
