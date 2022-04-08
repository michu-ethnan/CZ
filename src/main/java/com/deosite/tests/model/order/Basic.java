package com.deosite.tests.model.order;

public class Basic implements Order {

    private final String email;
    private final String name;
    private final String surname;
    private final String street;
    private final String city;
    private final String country;
    private final String postCode;
    private final String number;

    public Basic(
            String email,
            String name,
            String surname,
            String street,
            String city,
            String country,
            String postCode,
            String number
    ) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getNumber() {
        return number;
    }
}
