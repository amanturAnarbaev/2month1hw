package com.company;

public class Animal {
    private Color color;
    private int age;
    private Location location;


    public Animal() {
    }


    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Location getLocation() {
        return location;
    }

    public Animal(Color color, int age, Location location) {
        this.color = color;
        this.age = age;
        this.location = location;

    }




    public String getInfo(Color color, int age, Location location) {
        return "Color of aniamal  "+ color+
        "\nage  "+ age;
    }

}