package com.company;

public class Mamals extends Animal {
    private TypeOfMamal typeOfMamal;
    private FoodOfMamal foodOfMamal;
    private String name;


    public TypeOfMamal getTypeOfMamal() {
        return typeOfMamal;
    }

    public FoodOfMamal getFoodOfMamal() {
        return foodOfMamal;
    }

    public Mamals(String name, TypeOfMamal typeOfMamal, FoodOfMamal foodOfMamal) {
        super();
        this.typeOfMamal = typeOfMamal;
        this.foodOfMamal = foodOfMamal;
        this.name = name;
    }

    @Override
    public String getInfo(Color color, int age, Location location) {
        return super.getInfo(color, age, location) +
                "\ntype of Animal " + name +
                "\nType of Mamal " + typeOfMamal +
                "\nFood of mamal " + foodOfMamal +
                "\nLocation of mamal " + location.getLocation() +
                "\n name of location " + location.getName();
    }

    final public String getInfo(int age, Location location, Color color) {
        return super.getInfo(color, age, location) +
                "\ntype of Animal" + name +
                "\nType of Mamal " + typeOfMamal +
                "\nFood of mamal " + foodOfMamal +
                "\nLocation of mamal" + location.getLocation() +
                "\n name of location" + location.getName();
    }

}


