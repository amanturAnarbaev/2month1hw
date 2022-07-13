package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Location location= new Location("Forest","Arslanbab");
        Mamals obJectA = new Mamals("Mamal",TypeOfMamal.WILD,FoodOfMamal.MEAT);
        Location location1=new Location("mountain","Everest");
        Wolf objectB =new Wolf("Wolf",TypeOfMamal.WILD,FoodOfMamal.MEAT,52,TypeOfLivingWith.GROUP);
        Location location2= new Location("Jungle","amazonka");
        Wolf objectC = new Wolf("Wolf",TypeOfMamal.WILD,FoodOfMamal.MEAT,12,TypeOfLivingWith.GROUP);

        System.out.println(obJectA.getInfo(Color.BLACK,5,location));
        System.out.println("-------------------------------------------------");
        System.out.println(objectB.getInfo(Color.WHITE,7,location1));
        System.out.println("-------------------------------------------------");
        System.out.println(objectC.getInfo(Color.PURPLE,9,location2));



    }
}
