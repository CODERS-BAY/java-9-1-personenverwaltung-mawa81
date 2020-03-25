package com.codersbay;

public class Main {

    public static void main(String[] args) {

        PersonManager personManager = new PersonManager();

        personManager.addPerson("David", "Dorfer", 24);
        personManager.addPerson("Moritz", "Hauser", 33);
        personManager.addPerson("Anna", "Berger", 56);

        personManager.printNames();
        personManager.printAll();
        personManager.removePerson("David", "Dorfer", 24);

        personManager.printNames();

        personManager.printAll();
    }

}
