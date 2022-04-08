package com.deosite.tests.questions.homeapge;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PageTitle implements Question<String> {

    public String answeredBy(Actor actor) {
        WebDriver driver = getDriver();
        return driver.getTitle();
    }

    public static PageTitle title() {
        return new PageTitle();
    }
}
