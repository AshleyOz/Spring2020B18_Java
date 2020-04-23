package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str="Cybertek Scholl is the best";
        //          012345678
        String schoolName= str.substring(0,8);
        System.out.println(schoolName);
        String fullName="Kuzat Altay";
                     //     0123456789..
        String firstName= fullName.substring(0,6);
        String lastName= fullName.substring(7,10+1);

        System.out.println(firstName);
        System.out.println(lastName);

        //full name = first name last name
        //gmail: lastName_firstname@gmail.com



        String Murtaza= "Murtaza Nazerii";
        //               0123456789...

        String firstname= Murtaza.substring(0, 6+1);
        String lastname= Murtaza.substring(8, 14+1);
        System.out.println(firstName);
        System.out.println(lastName);
        String gmail= lastname.concat("_").concat(firstName).concat("gmail.com");
        //String gmail= lastName+"_"+ firstName+ "gmail.com";
        System.out.println(gmail);

        String s1= "I love Java Programming Language";
        String className=s1.substring(7);
        System.out.println(className);

        String s2= "I like C# Programming C# C#";
        s2 = s2.replace("C#", "Java");
        System.out.println(s2);

        String name ="COVID 18";
        name= name.replace("8","9");
        System.out.println(name);

        String r1= "I like C#, C# iS fUN, C# is cool";
        r1= r1.replace("C#","Java");

        System.out.println(r1);

        String r2= "Tomorrow is Monday, Tomorrow is Tuesday";
        r2= r2.replace("Tomorrow", "Today");
        System.out.println(r2);





    }
}
