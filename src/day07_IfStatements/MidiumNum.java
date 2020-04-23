package day07_IfStatements;
/*
4. write a program that accepts three numbers and return the midium number9assume that none of the numbers are equal)
 */
public class MidiumNum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        /*
        a:if (a < b && a > c) or (a > b && a < c )
        b: if ( b < c && b > a ) or ( b > c && b < a )
        c: if ( c < b && C > a) or ( c > b && c < a )
         */
        boolean aMedium= (a < b && a > c) || (a > b && a < c );
        //b < a < c or c < a < b ==> in math
        boolean bMedium= ( b < c && b > a ) || ( b > c && b < a );
        // c < b < a or a < b < c ==> in math
        boolean cMedium= ( c < b && c > a) ||  ( c > b && c < a );
        // a < c < B or b < c < a ==> in math
        if(aMedium){
            System.out.println(a+" is the medium number ");
        }
        if(bMedium){
            System.out.println(b+" is the medium number");
        }
        if(cMedium){
            System.out.println(c+" is the medium number");
        }

    }
}

