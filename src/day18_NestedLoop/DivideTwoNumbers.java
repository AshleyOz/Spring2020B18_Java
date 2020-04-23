package day18_NestedLoop;
/*
1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

 */
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;

        if(b==0){
            System.out.println("divisor cannot be zero");
            System.exit(0);
        }

        int count = 0;// count the execution of loop

        while( a >=b){
            a-=b;
            count++;
        }
        if (a==0){
            System.out.println("The result is " +count);
        }else{
            System.out.println("The result is " +count + "with a remainder of"+a);
        }
    }
}
