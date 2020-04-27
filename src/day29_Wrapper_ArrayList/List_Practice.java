package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shoppinglist=new ArrayList<>();
        shoppinglist.add("Milk");//size:1
        shoppinglist.add("Coffee");//size:2
        shoppinglist.add("bread");//size:3
        shoppinglist.add("toilet paper");//size:4

        System.out.println(shoppinglist);

        for (int i=0;i <4 ;i++){//i:0,1,2,3 // for lopp method
            //for (int i=0;i< shoppinglist.size();i++); ==>new method
            System.out.println(shoppinglist.get(i));
/*
            System.out.println(shoppinglist.get(0));
            System.out.println(shoppinglist.get(1));
            System.out.println(shoppinglist.get(2));
            System.out.println(shoppinglist.get(3));
 */
            System.out.println("==========================");
            for (String each:shoppinglist){//for each loop method
                System.out.println(each);
            }
            //size method===> size():
            int size=shoppinglist.size()-1;
            System.out.println(size);
        }
    }
}
