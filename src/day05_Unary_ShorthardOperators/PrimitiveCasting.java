package day05_Unary_ShorthardOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int a= 10;
        long b= a; // implicit casting is done automatically
        //b =10L;

        //int c= b; error // b is still long data type

        int a1 =100;
        long b1 = (long) a1 ; //maunally doing the implicit casting

        //int c1 =b1

        //Explicit casting
        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)Inum;

        double Dnum= 5.5;

        float Fnum = (float)Dnum; //5.5

        System.out.println(Fnum + 1);

        float F1 = 60.5f;
        int I1 = (short) F1; // prefered
        System.out.println(I1);

        long largeNum= 99999999L;
        int intNum= (int) largeNum;
        System.out.println(intNum);
        //it gives a different num because 999999 is out of int range

        char ch1 ='a';

        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 =23456;

        double dbl1 = ch2; //23456.0
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1; //10.0
        short y1 = (short) z1;



    }
}
