package com.codersbay;

public class Main {

    public static void main(String[] args) {

        Person p01 = new Person("Mario", "Wagner", "03.02.1981", "Musterstraße 1, 1111 Musterdorf", "male");
        Person p02 = new Person("Moritz", "Hauser", "06.08.1993", "Musterstraße 2, 2222 Musterfurt", "male");

        PersonManager personManager01 = new PersonManager();

        personManager01.addPerson(p01);

        personManager01.printAll();
    }

}
