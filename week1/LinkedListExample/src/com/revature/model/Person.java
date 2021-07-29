package com.revature.model;

import java.util.Objects;

public class Person extends Object{
    private String name;
    private Nose nose;

    public Person() {
    }

    public Person(String name, Nose nose) {
        this.name = name;
        this.nose = nose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nose getNose() {
        return nose;
    }

    public void setNose(Nose nose) {
        this.nose = nose;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nose=" + nose +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(nose, person.nose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nose);
    }
}
