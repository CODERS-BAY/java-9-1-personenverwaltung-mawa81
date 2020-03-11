package com.codersbay;

public class Main {

    public static void main(String[] args) {

        Person p01 = new Person("David", "Dorfer", "11.11.1981", "Musterstraße 1, 1111 Musterdorf", "male");
        Person p02 = new Person("Moritz", "Hauser", "06.08.1993", "Musterstraße 2, 2222 Musterfurt", "male");
        Person p03 = new Person("Anna", "Berger", "30.10.1986", "Musterstraße 3, 3333 Musterberg", "female");

        PersonManager personManager01 = new PersonManager();

        personManager01.addPerson(p01);
        personManager01.addPerson(p02);
        personManager01.addPerson(p03);

        personManager01.printName();

        personManager01.removePerson(p02);

        personManager01.printName();

        personManager01.printAll();
    }

}
