package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer>scores= new ArrayList<>();//size:0
                                  // add five elements, size:5
                                  //remove two elements, size:3
        scores.add(10);// Autoboxing  size:1
        scores.add(20);//Autoboxing size:2
        scores.add(30);//size:30

        System.out.println(scores);

        Integer a1= scores.get(2);//none
        int a2= scores.get(2);//unboxing
        double a3= scores.get(2);//unboxing

        System.out.println(a1);

    }
}
