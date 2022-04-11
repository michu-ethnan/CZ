package com.deosite.tests.pages;

import net.serenitybdd.screenplay.targets.Target;

public class Alert {

    public static Target ALERT_BOX = Target.the("Added to cart alert").locatedBy("//div[@data-test='message-success']//p");
    public static Target CLOSE_ALERT_BOX_BUTTON = Target.the("Close alert box button").locatedBy("//*[@id=\"__notifications-bottomLeft__\"]/div/div/div/p/span");


}
