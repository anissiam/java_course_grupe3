package com.oop.java3.classes.inhr;

public class Main {
    public static void main(String[] args) {

      /*  Person person = new Person();
        person.name = "ALI";
        System.out.println(person.name);
*/
        Ahmed ahmed = new Ahmed("Ahmed", "Green", 20);
        System.out.println(ahmed.name);
        ahmed.name = "Ali";
        ahmed.printAhmed();
        ahmed.printPeron();

        Sum sum = new Sum();
        sum.add();

        Conct conct = new Conct();
        conct.add();

        B b = new B();
        b.print();


        C c = new C();
        c.print();
        /*B b = new B();
        b.printA();
        b.printB();

        C c = new C();
        c.printA();
        c.printC();
*/

        /*final double x = 3.14;
        System.out.println(x);
        //x = 50; // final

        final double xx;
        xx = 3.14;
        xx = 50;*/

    }
}
