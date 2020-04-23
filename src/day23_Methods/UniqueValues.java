package day23_Methods;
public class UniqueValues {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A"};//"B"
        //  0   1   2
        //"A"
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("B")) {
                count2++;
            }
        }
        if (count2 == 1) {
            System.out.println("B");
        }


        System.out.println("=======================================");
        //solution2
        for (String each2 : arr) {//3:A,
            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {//the character is unique
                System.out.println(each2);
            }
        }
    }
}
