package com.company;

final public class Wolf extends Mamals{
    private int speed;
    private TypeOfLivingWith typeOfLivingWith;
    private String name;


    public Wolf( String name,TypeOfMamal typeOfMamal, FoodOfMamal foodOfMamal) {
        super( name,typeOfMamal, foodOfMamal);
    }

    public int getSpeed() {
        return speed;
    }

    public TypeOfLivingWith getTypeOfLivingWith() {
        return typeOfLivingWith;
    }

    public Wolf( String name,TypeOfMamal typeOfMamal, FoodOfMamal foodOfMamal, int speed, TypeOfLivingWith typeOfLivingWith) {
        super( name,typeOfMamal, foodOfMamal);
        this.speed = speed;
        this.typeOfLivingWith = typeOfLivingWith;
        this.name=name;
    }

    @Override
    public String getInfo(Color color, int age, Location location) {
        return super.getInfo(color, age, location)+
                "\ntype of Animal "+name+
                "\nspeed of wolf "+speed+" km/h"+
                "\nHow wolf is live "+typeOfLivingWith;
    }
}
