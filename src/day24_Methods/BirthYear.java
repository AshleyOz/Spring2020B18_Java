package day24_Methods;

public class BirthYear {
    public static void Age(int birthyear) {//2000
        int currentYear = 2020;

        int age = currentYear - birthyear;
        if (age > 0 && birthyear > 1900) {
            System.out.println(age);
        } else {
            System.out.println("You are not born yet");
        }
    }

    public static void main(String[] args) {
        Age(2000);
    }


    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printCybertek() {
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek() {
    printHello();//Hello
        printCybertek();//Cybertek


    }
}
