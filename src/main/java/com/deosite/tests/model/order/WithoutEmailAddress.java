package com.deosite.tests.model.order;

public class WithoutEmailAddress implements OrderWithoutEmailAddress {

    private final String name;
    private final String surname;
    private final String street;
    private final String city;
    private final String country;
    private final String postCode;
    private final String number;

    public WithoutEmailAddress(
            String name,
            String surname,
            String street,
            String city,
            String country,
            String postCode,
            String number
    ) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.number = number;
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
