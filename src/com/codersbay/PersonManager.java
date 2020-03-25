package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    public static List<Person> personList;

    public PersonManager() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String firstname, String lastname) {
        Person person = new Person(firstname, lastname);
        personList.add(person);
    }

    public void addPerson(String firstname, String lastname, Integer age) {
        Person person = new Person(firstname, lastname, age);
        personList.add(person);
    }

    public void removePerson(String firstname, String lastname) {
        Person person = new Person(firstname, lastname);

        personList.remove(person);
    }

    public void removePerson(String firstname, String lastname, Integer age) {
        Person person = new Person(firstname, lastname, age);

        personList.remove(person);
    }

    public void printNames() {
        for (Person person : personList) {
            System.out.println("\nfirst name: " + person.firstName + "\nsecond name: " + person.secondName);
        }
    }

    public void printAll() {
        for (Person person : personList) {

            System.out.println(person.toString());
        }

    }

}
