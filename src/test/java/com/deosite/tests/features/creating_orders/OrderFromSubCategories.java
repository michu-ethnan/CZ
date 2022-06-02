package com.deosite.tests.features.creating_orders;

import com.deosite.tests.actions.Open;
import com.deosite.tests.questions.CategoryHeader;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.categoryPage.SelectSubCategory;
import com.deosite.tests.tasks.product.AddToCartFromPdp;
import com.deosite.tests.tasks.product.AddToCartFromSubCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrderFromSubCategories {

    @Steps
    SetupSteps setupSteps;
    String categoryHeader;

    @When("she selects one sub category from {word}")
    public void actor_selects_sub_category(String categoryName){
        theActorInTheSpotlight().attemptsTo(
                SelectSubCategory.byName(categoryName)
                //WaitUntil.the(CATEGORY_HEADER, isPresent()).forNoMoreThan(50).seconds()
        );
    }
    @And("she adds a product from sub category page")
    public void actor_adds_product_from_sub_category(){
        categoryHeader = CategoryHeader.valueIs().answeredBy(theActorInTheSpotlight());
    theActorInTheSpotlight().attemptsTo(
            Check.whether(categoryHeader.contains(categoryHeader)).andIfSo(AddToCartFromSubCategory.add()).otherwise(AddToCartFromPdp.toCart()),
            Open.miniCart()
            /*Check.whether(categoryHeader.isEmpty()).andIfSo(Open.productPageByPosition(1)).otherwise(AddProduct.toCart())*/
        );





    }
}
