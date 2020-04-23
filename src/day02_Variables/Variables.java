package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /*
        declare variables:
        DataTypes variableName = Data;
         */
        byte l = 4;
        byte w = 2;
        byte area= 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        //byte num = 2.5; byte,short, int,long they only accept whole numbers
        // byte num1 = 130; exceeds the range of byte
        //short num2 = 3.5;

        short num3= 1000;
        // short num4=40000; exceeds the range of short
        System.out.println(num3); //1000

        System.out.println(12345); //by default complier takes it as int primitive

        int n1 = 20000;
        int n2 =1000000000;
        System.out.println(n2);

        //long n3 = 999999999; //compiler by default takes it as int
        long n4 = 999999999l; // forcefully telling the complier that is long data number
        System.out.println(n4);
        //int num = 7l; larger one cannot be assigned to smaller one
        //double > float > long > int > short > byte
        short s1 = 10;
        // byte b1 = s1; // short is larger than byte
        int i1 = s1;
        // byte b2 = il; larger can not be assigned to smaller one

        System.out.println(3.5);
        double d1 = 3.5;

        //float f1 =4.5; // double primitive is larger than float primitive, can not assigned

        float f2 = 5.5f;
        System.out.println(f2);

        System.out.println("==========================================================");

        float pi = 3.1f;

        double p = 3.14f;

        int a1 = 3000;

        double d2 = a1; // 3000.0
        System.out.println(d2);

        long l2 = 40;
        float f3 = l2;


    }
}
