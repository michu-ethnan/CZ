package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.pages.SearchPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.apache.pdfbox.io.ScratchFile;

import static com.deosite.tests.pages.SearchPage.QUICK_SEARCH_LIST;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectProductFromQuickSearch implements Task {

    private final int number;
    public SelectProductFromQuickSearch(int number){
        this.number = number;
    }
    @Override
    @Step("{0} selects product from quick search list")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(QUICK_SEARCH_LIST, isPresent()),
                Click.on(QUICK_SEARCH_LIST.resolveAllFor(actor).get(number))
        );
    }
    public static SelectProductFromQuickSearch select(int number){
        return Instrumented.instanceOf(SelectProductFromQuickSearch.class).withProperties(number);
    }
}
