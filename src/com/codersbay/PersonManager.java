package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    public static List<Person> PERSON_LIST;

    public PersonManager() {
        PersonManager.PERSON_LIST = new ArrayList<>();
    }

    public void addPerson(String firstname, String lastname) {
        Person person = new Person(firstname, lastname);
        PERSON_LIST.add(person);
    }

    public void addPerson(String firstname, String lastname, Integer age) {
        Person person = new Person(firstname, lastname, age);
        PERSON_LIST.add(person);
    }

    public void removePerson(String firstname, String lastname) {
        Person person = new Person(firstname, lastname);

        PERSON_LIST.remove(person);
    }

    public void removePerson(String firstname, String lastname, Integer age) {
        Person person = new Person(firstname, lastname, age);

        PERSON_LIST.remove(person);
    }

    public void printNames() {
        for (Person person : PERSON_LIST) {
            System.out.println("\nfirst name: " + person.firstName + "\nsecond name: " + person.secondName);
        }
    }

    public void printAll() {
        for (Person person : PERSON_LIST) {

            System.out.println(person.toString());
        }

    }

}
