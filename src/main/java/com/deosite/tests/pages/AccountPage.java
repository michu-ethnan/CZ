package com.deosite.tests.pages;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {

    public static Target LOGOUT_BUTTON = Target.the("Logout Button").locatedBy("//button[@data-test='logout']");
    public static Target MY_ACCOUNT_HEADER = Target.the("My account header").locatedBy("//div[@data-test='my-account-header']/div[1]/div[1]");
    public static Target ADD_NEW_ADDRESS_BUTTON = Target.the("Add new address button").locatedBy("//a[@data-test='add-address-link']");
    public static Target ADDRESS_BOOK_BUTTON = Target.the("Address book button").locatedBy("//button[@data-test='address-book']");
    public static Target MY_ORDERS_BUTTON = Target.the("My orders button").locatedBy("//button[@data-test='all-orders']");
    public static Target NAME_INPUT = Target.the("Name input").locatedBy("//input[@name='fields.firstName']");
    public static Target LAST_NAME_INPUT = Target.the("Last name input").locatedBy("//input[@name='fields.lastName']");
    public static Target STREET_INPUT = Target.the("Street input").locatedBy("//input[@name='fields.street']");
    public static Target CITY_INPUT = Target.the("City input").locatedBy("//input[@name='fields.city']");
    public static Target POSTAL_CODE_INPUT = Target.the("Postal code input").locatedBy("//input[@name='fields" +
            ".postalCode']");
    public static Target PHONE_INPUT = Target.the("Phone input").locatedBy("//input[@name='fields.phone']");
    public static Target MY_ACCOUNT_SUBHEADER = Target.the("My account subheader").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div[1]");
    public static Target SUBMIT_NEW_ADDRESS_BUTTON = Target.the("Submit new address button").locatedBy("//button[@data-test='save-address']");
    public static Target FIRST_TRASH_ICON = Target.the("First trash icon").locatedBy("(//a[@data-test='edit-address-book'])[3]//..//button");
    public static Target DIALOG_BOX_YES_BUTTON = Target.the("Yes button in a dialog box").locatedBy("//*[@id=\"__layers__\"]//button[1]");
    public static Target ORDER_LIST = Target.the("First order").locatedBy("//div[@data-test='order-card']");
    public static Target FIRST_ORDER = Target.the("First order").locatedBy("//div[@class='css-z910u3'][1]");
    public static Target ORDER_NUMBER = Target.the("Order image").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]");

    public static Target ORDER_IMAGE = Target.the("Order image").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]//div[12]/div/a/div/span");
    public static Target ADDRESS_LIST = Target.the("Address list").locatedBy("//a[@data-test='edit-address-book']");
    public static Target EMAIL_NAME = Target.the("Email name").locatedBy("//div[@data-test='my-account-header']/div[2]");
    public static Target EMAIL_ADDRESS = Target.the("Email address").locatedBy("//div[@data-test='my-account-header']/div[2]");
}
