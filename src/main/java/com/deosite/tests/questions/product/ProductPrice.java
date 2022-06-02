package com.deosite.tests.questions.product;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.Subject;

import java.math.*;

import static com.deosite.tests.pages.ProductPage.DISCOUNTED_PRODUCT_PRICE;
import static com.deosite.tests.pages.ProductPage.PRODUCT_PRICE;

@Subject("Product price")

public class ProductPrice implements Question<BigDecimal> {
    String ProductPrice;
    @Override
    public BigDecimal answeredBy(Actor actor) {
        if(DISCOUNTED_PRODUCT_PRICE.resolveFor(actor).isPresent()){
            ProductPrice = DISCOUNTED_PRODUCT_PRICE.resolveFor(actor).getText();
        }else {
            ProductPrice = PRODUCT_PRICE.resolveFor(actor).getText();
        }

        String priceAfterTrim = ProductPrice.replace(",", ".").trim();
        BigDecimal price = new BigDecimal(priceAfterTrim);
        return price;
    }

    public static Question<BigDecimal> price() {
        return new ProductPrice();
    }
}
