package com.deosite.tests.pages;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {

    public static Target PRODUCTS_TITLE = Target.the("First product title").locatedBy("//div[@data-test='product-box']/a/div/p");
    public static Target QUICK_SEARCH_PRODUCTS_TITLE = Target.the("First product title").locatedBy("//a[@class='css-1sfqpc5']");


    public static Target  QUICK_SEARCH_LIST = Target.the("quick search list").locatedBy("//a[@class=\"css-14ky5vr\"]");
    public static Target  FIRST_QUICK_SEARCH_PRODUCT = Target.the("quick search list").locatedBy("(//a[@class=\"css-14ky5vr\"])[1]");
    public static Target  QUICK_SEARCH = Target.the("quick search list").locatedBy("//*[@id=\"__layers__\"]/div/div/div/div/div/div[2]/a");



}