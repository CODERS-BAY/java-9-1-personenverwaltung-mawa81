package com.codersbay;

public class Person {
    public String firstName;
    public String secondName;
    public Integer age;
    public String address;
    public String gender;

    public Person(String firstName, String secondName, Integer age, String address, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public Person(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = "Unknown";
        this.gender = "Unknown";
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = null;
        this.address = "Unknown";
        this.gender = "Unknown";
    }

    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = null;
        this.address = "Unknown";
        this.gender = "Unknown";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;
        if (age != null ? !age.equals(person.age) : person.age != null)
            return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        return gender != null ? gender.equals(person.gender) : person.gender == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
