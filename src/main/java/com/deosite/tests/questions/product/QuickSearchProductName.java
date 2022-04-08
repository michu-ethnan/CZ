package com.deosite.tests.questions.product;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Question;

public class QuickSearchProductName {

    public static Question<String> nameOfAProductOnQuickSearchBoxByPosition(int position) {
        return Instrumented.instanceOf(QuickSearchProduct.class).withProperties(position);
    }
}
