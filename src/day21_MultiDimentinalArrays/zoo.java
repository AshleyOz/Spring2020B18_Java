package day21_MultiDimentinalArrays;

public class zoo {
    public static void main(String[] args) {
        String[] wildanimals={"Tiger","Lion","Tiger","Crocodile"};
        String[] birds={"Eagle","Ducks","Peacock","Chicken"};

        String [][]zoo= {wildanimals,birds};
        //                 0,          1
        String kfc = zoo[1][3];//Chicken
        System.out.println(kfc);

        System.out.println("===========================");
        for (String  eacBirds: zoo[1]){//4times
            if (eacBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eacBirds);
            System.out.println("=============================================");

            for (String each: zoo[0]) { // 5
                System.out.println(each);
            }
        }
    }
}
