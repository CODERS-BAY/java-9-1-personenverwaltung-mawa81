package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public List<Person> personList = new ArrayList<>();

    public PersonManager() {

    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public void printAll() {
        for (Person person : personList) {
            System.out.println("\nfirst name: " + person.firstName + "\nsecond name: " + person.secondName);
        }
    }

}
