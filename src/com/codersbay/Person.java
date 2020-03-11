package com.codersbay;

public class Person {
    public String firstName;
    public String secondName;
    public String birthdayDate;
    public String address;
    public String gender;

    public Person(String firstName, String secondName, String birthdayDate, String address, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
        this.address = address;
        this.gender = gender;
    }

    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
    }
}
