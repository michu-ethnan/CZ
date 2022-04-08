package com.deosite.tests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/navigating_website_1"},
        glue = {"com.deosite"}
)

public class NavigatingWebsiteSuite_1 {
}
