package com.deosite.tests.tasks.product;

import com.deosite.tests.actions.Open;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCartFromSubCategory implements Task {
    @Override
    @Step("{0} adds product from sub catrgory")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                        Open.productPageByPositionRandomly()
        );
                actor.attemptsTo(
                        Check.whether(ADD_TO_CART_BUTTON.resolveFor(actor).isClickable()).andIfSo(AddProductToCart.toCart()).otherwise(ReturnAndAddAnotherProduct.toCart())

        );
    }
    public static Task add(){
        return instrumented(AddToCartFromSubCategory.class);
    }
}
