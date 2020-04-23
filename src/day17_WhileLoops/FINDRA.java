package day17_WhileLoops;
public class FINDRA {
    public static void main(String[] args) {
        for (int i = 1; i<= 30;i++){

            if (i % 3 ==0 && i % 5 ==0){// prints the numbers that are divisible by both 3 and 5
                System.out.println("FINRA");
            }else if (i % 3 ==0){// prints the numbers that are ONLY divisible by 3
                System.out.println("FIN");
            }else if (i % 5 == 0){ // prints the numbers that are ONLY divisible by 5
                System.out.println("RA");
            }else{// prints the numbers that are divisible by either 3 or 5
                System.out.println(i+" ");
            }
        }
    }
}
