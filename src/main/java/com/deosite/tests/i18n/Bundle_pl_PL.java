package com.deosite.tests.i18n;

import com.deosite.tests.model.account.NewAddressForm;
import com.deosite.tests.model.login.LoginForm;
import com.deosite.tests.model.login.DifferentLoginForm;
import com.deosite.tests.model.order.Personal;
import com.deosite.tests.model.order.Company;
import com.deosite.tests.model.order.WithoutEmailAddress;
import com.deosite.tests.model.register.RegisterForm;

import java.util.ListResourceBundle;

public class Bundle_pl_PL extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                // Labels
                {"capacity (l) label", "pojemność (l)"},
                {"capacity (ml) label", "pojemność (ml)"},

                // Products
                {"mug", "Becher"},
                {"configurable product", "kubek palette"},

                // Number of products in the cart
                {"greater", "Dein Warenkorb (2)"},
                {"smaller", "Dein Warenkorb (1)"},

                // Categories

                //Headers
                {"account header", "Konto"},
                {"Ogród header", "Garten "},
                {"Jadalnia header", "Esszimmer "},
                {"Kuchnia header", "Küche "},
                {"Łazienka i garderoba header", "Ordnung & Sauberkeit "},
                {"Dekoracje header", "Heimtextilien "},
                {"Świat dziecka header", "Kinderwelt "},
                {"Nowości header", "Neu "},
                {"Wyprzedaż header", "Sale "},
                {"Marki header", "Marken"},



                // Alerts
                {"added to cart", "Das Produkt wurde zum Einkaufswagen hinzugefügt"},
                {"address saved", "Gespeicherte Adresse"},
                {"address deleted", "Address deleted"},

                // Messages
                {"success order message", "Dziękujemy, Twoje zamówienie zostało złożone!"},
                {"additional success info", "Zamówienie jest kompletowane, o wysyłce poinformujemy drogą mailową."},
                {"the cart is empty message", "Keine Artikel im Warenkorb"},
                {"login button text", "Logowanie"},
                // Objects
                {"person", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "Deutschland",
                        "11-111",
                        "123456789"
                )},
                {"personFromNetherlands", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Test 1",
                        "Test",
                        "Niederlande",
                        "00-000",
                        "0000000000"
                )},
                {"personFromDänemark", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Test 1",
                        "Test",
                        "Dänemark",
                        "00-000",
                        "0000000000"
                )},
                {"company", new Company(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "Deutschland",
                        "11-111",
                        "123456789",
                        "Testowa sp. z o.o",
                        "1234567891"
                )},
                {"withoutEmailAddress", new WithoutEmailAddress(
                        "Test",
                        "Test-Test",
                        "Test 1",
                        "Test",
                        "Deutschland",
                        "00-000",
                        "0000000000"
                )},
                {"login", new LoginForm(
                        "tester-email-tester@yandex.com",
                        "Test12345!"
                )},
                {"login to order_1", new LoginForm(
                        "abisimeon22@yandex.com",
                        "Test12345!"
                )},
                {"login to order_2", new LoginForm(
                        "abisimeon222@yandex.com",
                        "Test12345!"
                )},
                {"login to order_3", new LoginForm(
                        "abisimeon223@yandex.com",
                        "Test12345!"
                )},
                {"login to see order", new LoginForm(
                        "tekasimeon00@gmail.com",
                        "Test12345!"
                )},
                {"differentEmail", new DifferentLoginForm(
                        "tester-tester-terster@yandex.com",
                        "Test12345!"
                )
                },
                {"newAddress", new NewAddressForm(
                        "Salomea",
                        "Kowalska",
                        "Testowa 1",
                        "Testowo",
                        "00-000",
                        "0000000000"
                )},
                {"register", new RegisterForm(
                        "Test12345!",
                        "Test",
                        "Test-Test"
                )}
        };
    }
}
