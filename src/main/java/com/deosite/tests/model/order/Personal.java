package com.deosite.tests.model.order;

public class Personal extends Basic implements Order {

    public Personal(
            String email,
            String name,
            String surname,
            String street,
            String city,
            String country,
            String postCode,
            String number
    ) {
        super(email, name, surname, street, city, country, postCode, number);
    }
}
