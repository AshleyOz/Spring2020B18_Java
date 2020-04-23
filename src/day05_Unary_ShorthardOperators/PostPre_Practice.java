package day05_Unary_ShorthardOperators;

import java.sql.SQLOutput;

public class PostPre_Practice {

    public static void main(String[] args) {
        int a = 50; //50
        a = --a + a++ + a-- + a++;
        //    49+49   + 50  + 49=197
        System.out.println(a);
        System.out.println(++a); //198
        System.out.println(a++);//198
        System.out.println(a);

        int b =1; //0
        b = -b-- +b++  / -b-- *--b;
        //b = -1 +0 / - 1 *  -1
        // -1 + 0 * -1
        // -1 + 0 = -1
        System.out.println(b);

        System.out.println("gggg" + 3 +4);
        System.out.println("hhhh" +(3 + 4));


        double a1,b1,c1 = 10.5;
        System.out.println(b);

        long a2 = 3_000l;
        double b2= (float)a2;
        int c2=(short)b2;
        System.out.println(c2 % 1000);

        System.out.println((int)(10.0/3));

        int x=10;
        int y=x++;
        System.out.println(y++ +""+ x++ + "" + y);










    }
}
