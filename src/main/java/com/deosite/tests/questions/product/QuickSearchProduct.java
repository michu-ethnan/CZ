package com.deosite.tests.questions.product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.deosite.tests.pages.SearchPage.QUICK_SEARCH_PRODUCTS_TITLE;

@Subject("the title of a product on search page")
public class QuickSearchProduct implements Question<String> {

    private final int position;

    public QuickSearchProduct(int position) {
        this.position = position;
    }

    @Override
    public String answeredBy(Actor actor) {
        return QUICK_SEARCH_PRODUCTS_TITLE.resolveAllFor(actor).get(position).getText();
    }
}
