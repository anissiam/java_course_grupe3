package com.oop.java3.classes.poly.Living;

public class Main {
    static Living living;
    public static void main(String[] args) {
        Poly poly = new Poly();

        Living living = new Living();
        poly.poly(living);
       /* poly.sum("SSS");*/

        living = new Humen();
        poly.poly(living);

        /*living = new Fish();
        Living fish = new Fish();*/
        poly.poly(new Fish());

        Living bards = new Bards();
        poly.poly(bards);

       // poly.poly(new Living());

        /*Living human = new Humen();
        human.environment();

        Living bards = new Bards();
        bards.environment();

        Living fish = new Fish();
        fish.environment();*/



        /*Living living = new Living();
        living.environment();

        Humen humen = new Humen();
        humen.environment();

        Bards bards = new Bards();
        bards.environment();

        Fish fish = new Fish();
        fish.environment();*/

    }
}
