package day05_Unary_ShorthardOperators;

public class PostPre {
    public static void main(String[] args) {
        //pre: changes the value immediately
        int a= 100;
        System.out.println(++a); //101
        System.out.println(a); //101

        int b =-100;
        System.out.println( --b ); //99
        System.out.println(b); // 99
        // Post: first passes  the current value, then eventually changez the variable value
        int A = 100;
        System.out.println(A++);// at line 18, A' values is still 100
        System.out.println(A); //101

        int B = 100;
        System.out.println(B--);// 100
        System.out.println(B); //99

        //post & pre examples
        int z = 10;
        int x = ++z; // at line 24, x is increased by 1
        System.out.println(x);
        System.out.println(z);

        int s = 10;
        int f = s++;// 10, after line 29, the value of s will be increased by 1
        System.out.println(f); //10'
        System.out.println(s);//11

        double t1 = 3.5;
        double t2 = t1 --; //3.5, after line 41 t1 will be decreased by1

        System.out.println(t1);
        System.out.println(t2);


    }
}
