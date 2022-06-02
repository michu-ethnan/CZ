package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.tasks.mainMenu.ClickSubcategory;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SelectSubCategory implements Task {
    private final String categoryName;

    public SelectSubCategory(String categoryName){
        this.categoryName = categoryName;
    }

    @Override
    @Step("{0} selects sub_category")
    public <T extends Actor> void performAs(T actor){
        if (categoryName.contains("Ogród")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );

        }
        if (categoryName.contains("Jadalnia")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(2)
            );

        }
        if (categoryName.contains("Kuchnia")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(2)
            );

        }
        if (categoryName.contains("ŁazienkaIgarderoba")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );

        }
        if (categoryName.contains("Dekoracje")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );

        }
        if (categoryName.contains("ŚwiatDziecka")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(2)
            );

        }
        if (categoryName.contains("Nowości")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(1)
            );

        }
        if (categoryName.contains("Wyprzedaż")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(3)
            );

        }
        if (categoryName.contains("Promocje")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );}
        if (categoryName.contains("Marki")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );

        }
        if (categoryName.contains("Inspiracje")){
            actor.attemptsTo(
                    ClickSubcategory.byNumber(0)
            );

        }
    }
    public static SelectSubCategory byName(String categoryName) {
        return Instrumented.instanceOf(SelectSubCategory.class).withProperties(categoryName);
    }

}
