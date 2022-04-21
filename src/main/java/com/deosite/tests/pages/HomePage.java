package com.deosite.tests.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target DAJAR_LOGO = Target.the("Dajar logo").locatedBy("(//a[@title='Dajar'])[1]");
    public static Target SECOND_BANNER = Target.the("Second main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[4]");
    public static Target THIRD_BANNER = Target.the("Second main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[6]");
    public static Target FOURTH_BANNER = Target.the("Second main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[9]/div/div[1]");
    public static Target FIFTH_BANNER = Target.the("Second main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[11]/div/div[1]/a");

    public static Target MAIN_BANNER = Target.the("Main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[2]/div");
    public static Target OKAZJE = Target.the("Main banner").locatedBy("//a[@class='css-118el78']");
    public static Target NEW_PRODUCTS = Target.the("Main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[7]/div/div[2]");
    public static Target HOMEPAGE_INSPIRATIONS = Target.the("Main banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[8]/div");


    public static Target POPULAR_PRODUCTS_LIST = Target.the("Inspirations banner").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[3]/div/div[2]");
    public static Target RIGHT_ARROW_POPULAR_PRODUCTS = Target.the("Dajar logo").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/div[3]/div");
    public static Target RIGHT_ARROW_NEW_PRODUCTS = Target.the("Dajar logo").locatedBy("(//*[@id=\"__app__\"]/div[2]//div[3]/div/button)[2]");
    public static Target RIGHT_ARROW_RECOMMENDED_PRODUCTS = Target.the("Dajar logo").locatedBy("(//*[@id=\"__app__\"]/div[2]//div[3]/div/button)[3]");
    public static Target LEFT_ARROW_POPULAR_PRODUCTS = Target.the("Dajar logo").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/button");
    public static Target LEFT_ARROW_NEW_PRODUCTS = Target.the("Dajar logo").locatedBy("(//button[@class=\"css-1c552or\"])[3]");
    public static Target LEFT_ARROW_RECOMMENDED_PRODUCTS = Target.the("Dajar logo").locatedBy("(//button[@class=\"css-1c552or\"])[5]");
    public static Target RECOMMENDED_CATEGORIES = Target.the("Recommended categories").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[10]/div/div[2]");
    public static Target INSTAGRAM = Target.the("Instagram").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[12]/div/div[2]");
    public static Target NEWS_LETTER = Target.the("Instagram").locatedBy("//*[@id=\"__app__\"]/div[2]/div[3]/div/div[14]/div/div[2]/div/div/div/div/div/a/div[1]");
    public static Target FOOTER = Target.the("Footer").locatedBy("//*[@id=\"footer\"]/div");
    public static Target FOOTER_ELEMENTS = Target.the("Footer").locatedBy("//a[@class='css-1pf7icx']");
    public static Target SELECT_LANGUAGE = Target.the("Footer").locatedBy("//*[@id=\"footer\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div");
    public static Target SELECT_LANGUAGE_LIST = Target.the("Footer").locatedBy("//*[@id=\"__layers__\"]//div[@option]");








}
