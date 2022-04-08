package com.deosite.tests.questions.product;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.Subject;

import java.math.*;

import static com.deosite.tests.pages.ProductPage.DISCOUNTED_PRODUCT_PRICE;


@Subject("Product price")

public class DiscountedProductPrice implements Question<BigDecimal> {

    @Override
    public BigDecimal answeredBy(Actor actor) {
        String discountedProductPrice = DISCOUNTED_PRODUCT_PRICE.resolveFor(actor).getText();
        String discountedPriceAfterTrim = discountedProductPrice.replace(",", ".").trim();
        BigDecimal price = new BigDecimal(discountedPriceAfterTrim);
        return price;
    }

    public static Question<BigDecimal> discountedPrice() {
        return new DiscountedProductPrice();
    }
}
