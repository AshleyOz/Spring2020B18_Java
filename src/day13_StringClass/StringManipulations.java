package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str ="Cybertek";
        //           01234567

        char ch1=str.charAt(5);//'t'
        System.out.println(ch1=='A');
        //                 't'=='A' false
        System.out.println(ch1=='T');
        //                 't'==T false (java is very case sensitive)

        int totalLength=  str.length();
        System.out.println(totalLength);

        System.out.println(totalLength> 250);//false

        String str2="Today is great day,Java is Fun";
         //           012345...
        int maxIndexNum=str2.length()-1;
        System.out.println(maxIndexNum);

        String s1= "Cybertek";
        s1= s1.concat("School");//"Cybertek School" can be done like ==> System.out.println(s1.concat(" School")
        System.out.println(s1);

        String s2="Java";
        System.out.println( s2.concat("is programming language"));//will print ==>Java is a programing language
        System.out.println(s2);//will print==> Java
        s2=s2.concat("is a programming language");//will print==> Java is a programing language




        String name1= "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2= "cybertek school";
        name2=name2.toUpperCase();
        System.out.println(name2);

        String A1= "      Today is a great day              ";
        A1= A1.trim();
        System.out.println(A1);

    }
}
