package com.deosite.tests.actions;

import net.serenitybdd.core.steps.Instrumented;

public class Open {

    public static OpenMiniCart miniCart() {
        return new OpenMiniCart();
    }

    public static OpenCheckoutPage checkoutPage() {
        return new OpenCheckoutPage();
    }

    public static OpenProductPage productPageByPosition(int position) {
        return Instrumented.instanceOf(OpenProductPage.class).withProperties(position);
    }

    public static OpenLoginPage loginPage() {
        return new OpenLoginPage();
    }

    public static OpenCategoryPage categoryPage() {
        return new OpenCategoryPage();
    }

    public static OpenAccountPage accountPage() {
        return new OpenAccountPage();
    }
}
