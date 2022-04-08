package com.deosite.tests.questions.category;

import com.deosite.tests.questions.category.Value;
import net.serenitybdd.screenplay.Question;

public class CategoryHeader {
    public static Question<String> Value() {
        return new Value();
    }
}
