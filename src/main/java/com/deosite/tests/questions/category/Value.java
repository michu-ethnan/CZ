package com.deosite.tests.questions.category;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static com.deosite.tests.pages.CategoryPage.CATEGORY_HEADER;

@Subject("Value of my category header")
public class Value implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String categoryHeader = CATEGORY_HEADER.resolveFor(actor).getText();
        String categoryHeaderAfterRemovingDigits = categoryHeader.replaceAll("\\d", "");
        String categoryHeaderAfterRemovingTheFirstBracket = categoryHeaderAfterRemovingDigits.replace("(", "");
        String categoryHeaderAfterRemovingTheSecondBracket = categoryHeaderAfterRemovingTheFirstBracket.replace(")", "");

        String header = new String(categoryHeaderAfterRemovingTheSecondBracket);
        return header;
    }
}
