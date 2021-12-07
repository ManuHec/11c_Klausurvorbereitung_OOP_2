package com.cc.java;

public class Test {

    // Felder > Attribte, Eigenschaften
    // private --> Kapselung

    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
// Sichtbarkeit > access
// public --> alle dürfen sehen / schreiben
// private --> NUR die eigene Klasse / Objekte
// protected --> NRE die eigene Klasse/ Opjekte + Subklassen