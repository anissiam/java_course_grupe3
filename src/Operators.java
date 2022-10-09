public class Operators {
    /*
    Operators and Casting
     */
    public static void main(String[] args) {


        /*int x = 10;
        int y = 50;
        int result = x + y;
        System.out.println(result);
        System.out.println(x+y);
        System.out.println(10+50);*/

        /*double no1 = 50;
        double no2 = 20;
        double no3 = 10;

        double ava =( no1 + no2 + no3 )/3;

        System.out.println(ava);*/

        /*int no1 = 50;
        int no2 = 20;
        int no3 = 10;

        double ava =( no1 + no2 + no3 )/3;

        System.out.println(ava);*/
       /* byte v = 127;
        byte xx = (byte) (v + 2);
        System.out.println(xx);*/


        /*double zz = 100.0;
        System.out.println(zz / 10);*/


        double cc = 100 + 50 + 10 + 30 + 40;
        System.out.println(cc);

        System.out.println("Mod 10%2 is " + (10 % 2) + (10 +50) );

        System.out.println("10"  + "20");
        System.out.println("10"  + "20" + 30);


        int v = 1;
        //v = v + 1;
        v += 1;
        System.out.println(v);
        ++v;
        System.out.println(v);

        //
        float zz = 10.5f;
        System.out.println(zz);

        float zz1 = (float) 10.5;
        System.out.println(zz1);

        char z = 'F';
        System.out.println((byte)z);
        System.out.println((char) 70);

        System.out.println((byte)'A');


        double myDouble = 9.78; // 64 bit
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9

        int x = 7;
        int y = 2;
        System.out.println((double) (x/y));
        System.out.println((double) x/y);

        System.out.println(x / y);

        System.out.println(3.3f+5.6d);

        System.out.println((int)3.5);

       /* int xx = 3;
        int yy = 5;
        int zzz = xx * ++yy;
        System.out.println(zzz);*/

        int xx = 3;
        int yy = 5;
        int zzz = xx * yy++;
        System.out.println(zzz);


    }
}
