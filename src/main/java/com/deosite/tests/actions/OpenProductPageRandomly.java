package com.deosite.tests.actions;

import com.deosite.tests.tasks.basic.ReturnToPreviousPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Random;

import static com.deosite.tests.pages.ProductPage.PRODUCT_NAME;
import static com.deosite.tests.pages.SearchPage.PRODUCT_LIST;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenProductPageRandomly implements Interaction {




    @Override
    @Step("{0} opens product page")
    public <T extends Actor> void performAs(T actor) {


        int size = PRODUCT_LIST.resolveAllFor(actor).size();
        List<WebElementFacade> products = PRODUCT_LIST.resolveAllFor(actor);

        Random r = new Random();
        int productsList = r.nextInt(products.size());
        products.get(productsList).click();

        if (PRODUCT_NAME.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    WaitUntil.the(PRODUCT_NAME, isVisible())
            );
        }
        else {
            actor.attemptsTo(
                    ReturnToPreviousPage.goToPreviousPage(),
                    Open.productPageByPositionRandomly()
            );

        }


    }
}
