package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";
        String str2 = new String("Cat");//Java Heap

        System.out.println(str1 +" : "+str2);
        System.out.println(str1==str2); //two different object,false

        String str3 ="Cat";// String pool

        System.out.println(str1==str3); //true

        System.out.println(str1==str2);


    }
}
