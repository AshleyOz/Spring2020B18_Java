package day22_Arrays_Loops;

public class nestedLoops_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
        };
        //1.print all the even number same line
        //2.count add numbers

        int count = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);



        }
    }

