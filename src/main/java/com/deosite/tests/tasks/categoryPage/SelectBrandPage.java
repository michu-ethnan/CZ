package com.deosite.tests.tasks.categoryPage;

import com.deosite.tests.pages.SearchPage;
import com.deosite.tests.tasks.brandPage.ClickBrand;
import com.deosite.tests.tasks.homePage.CurrentUrl;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.containsString;

public class SelectBrandPage implements Task {
    private final String brandName;

    public SelectBrandPage(String brandName){
        this.brandName = brandName;
    }
    @Override
    @Step("{0} selects brand")
    public <T extends Actor> void performAs(T actor){

                /*        COLUMN 1*/


        if (brandName.contains("Ambition")){
            actor.attemptsTo(
                    ClickBrand.byBrand(0)
            );
            actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("ambition")));

        }
        if (brandName.contains("Luminarc")){
            actor.attemptsTo(
                    ClickBrand.byBrand(1)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("luminarc")));
        }
        if (brandName.contains("Domotti")){
            actor.attemptsTo(
                    ClickBrand.byBrand(2)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("domotti")));
        }
        if (brandName.contains("Pasabahce")){
            actor.attemptsTo(
                    ClickBrand.byBrand(3)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("pasabahce")));
        }
        if (brandName.contains("Pyrex")){
            actor.attemptsTo(
                    ClickBrand.byBrand(4)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("pyrex")));
        }
        if (brandName.contains("Disney")){
            actor.attemptsTo(
                    ClickBrand.byBrand(5)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("disney")));
        }
        if (brandName.contains("Patio")){
            actor.attemptsTo(
                    ClickBrand.byBrand(6)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("patio")));
        }
        if (brandName.contains("Velkea")){
            actor.attemptsTo(
                    ClickBrand.byBrand(7)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("velkea")));
        }
        if (brandName.contains("Nardi")){
            actor.attemptsTo(
                    ClickBrand.byBrand(8)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("nardi")));}
        if (brandName.contains("Curver")){
            actor.attemptsTo(
                    ClickBrand.byBrand(9)
            );
             actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("curver")));
        }



                         /*  COLUMN 2   */




        if (brandName.contains("Keter")){
            actor.attemptsTo(
                    ClickBrand.byBrand(10)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("keter")));

        }

        if (brandName.contains("Myhome")){
            actor.attemptsTo(
                    ClickBrand.byBrand(11)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("myhome-x")));

        }
        if (brandName.contains("Jotta")){
            actor.attemptsTo(
                    ClickBrand.byBrand(12)
            );

        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("jotta")));
        }


        if (brandName.contains("Bestway")){
            actor.attemptsTo(
                    ClickBrand.byBrand(13)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("bestway")));

        }

        if (brandName.contains("BranQ")){
            actor.attemptsTo(
                    ClickBrand.byBrand(14)
            );

        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("branq")));
        }

        if (brandName.contains("Arcoroc")){
            actor.attemptsTo(
                    ClickBrand.byBrand(15)
            );

        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("arcoroc")));
        }

        if (brandName.contains("DisAmb")){
            actor.attemptsTo(
                    ClickBrand.byBrand(16)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("disney-ambition")));

        }

        if (brandName.contains("Arcopal")){
            actor.attemptsTo(
                    ClickBrand.byBrand(17)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("arcopal")));

        }
        if (brandName.contains("Ocuisine")){
            actor.attemptsTo(
                    ClickBrand.byBrand(18)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("ocuisine")));

        }

        if (brandName.contains("Eko-drew")){
            actor.attemptsTo(
                    ClickBrand.byBrand(19)
            );
        actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("ekodrew")));

        }


        /*        COLUMN 3*/





        if (brandName.contains("Nickelodeon")){
            actor.attemptsTo(
                    ClickBrand.byBrand(20)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("nickelodeon")));

        }


        if (brandName.contains("Fiskars")){
            actor.attemptsTo(
                    ClickBrand.byBrand(21)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("fiskars")));

        }

        if (brandName.contains("Kis")){
            actor.attemptsTo(
                    ClickBrand.byBrand(22)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("kis")));

        }

        if (brandName.contains("Plast_Team")){
            actor.attemptsTo(
                    ClickBrand.byBrand(23)
            ); actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("plast-team")));}

        if (brandName.contains("Rotho")){
            actor.attemptsTo(
                    ClickBrand.byBrand(24)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("rotho")));

        }

        if (brandName.contains("Orplast")){
            actor.attemptsTo(
                    ClickBrand.byBrand(25)
            );

         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("orplast")));
        }

        if (brandName.contains("Sanrio")){
            actor.attemptsTo(
                    ClickBrand.byBrand(26)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("sanrio")));

        }


        if (brandName.contains("Marvel")){
            actor.attemptsTo(
                    ClickBrand.byBrand(27)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("marvel")));

        }

        if (brandName.contains("Arranger")){
            actor.attemptsTo(
                    ClickBrand.byBrand(28)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("arranger")));

        }

        if (brandName.contains("Glasmark")){
            actor.attemptsTo(
                    ClickBrand.byBrand(29)
            );
         actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("glasmark")));

        }





        /*        COLUMN 4*/




        if (brandName.contains("Aquaphor")){
            actor.attemptsTo(
                    ClickBrand.byBrand(30)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("aquaphor")));
        }

        if (brandName.contains("Walther_Glas")){
            actor.attemptsTo(
                    ClickBrand.byBrand(31)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("walther-glas")));
        }

        if (brandName.contains("Vileda")){
            actor.attemptsTo(
                    ClickBrand.byBrand(32)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("vileda")));
        }

        if (brandName.contains("Borcam")){
            actor.attemptsTo(
                    ClickBrand.byBrand(33)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("borcam")));
        }

        if (brandName.contains("Churchill")){
            actor.attemptsTo(
                    ClickBrand.byBrand(34)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("churchill")));
        }

        if (brandName.contains("AmbJunior")){
            actor.attemptsTo(
                    ClickBrand.byBrand(35)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("ambition-junior")));
        }

        if (brandName.contains("Brabantia")){
            actor.attemptsTo(
                    ClickBrand.byBrand(36)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("brabantia")));
        }

        if (brandName.contains("Kettler")){
            actor.attemptsTo(
                    ClickBrand.byBrand(37)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("kettler")));
        }

        if (brandName.contains("Weber")){
            actor.attemptsTo(
                    ClickBrand.byBrand(38)
            );


          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("weber")));
        }

        if (brandName.contains("Emalia_Olkusz")){
            actor.attemptsTo(
                    ClickBrand.byBrand(39)
            );

          actor.attemptsTo(
                    WaitUntil.the(SearchPage.PRODUCTS_TITLE, isPresent())
            );
            theActorInTheSpotlight().should(seeThat(CurrentUrl.information(), containsString("emalia-olkusz")));
        }

    }
    public static SelectBrandPage byName(String brandName) {
        return Instrumented.instanceOf(SelectBrandPage.class).withProperties(brandName);
    }
}
