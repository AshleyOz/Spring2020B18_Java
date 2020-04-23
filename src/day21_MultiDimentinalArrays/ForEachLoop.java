package day21_MultiDimentinalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};

        for (int eachElement:nums){
            System.out.println(eachElement);
        }
        String []Students= {"Muhtar","Asiya","Murodil"};
        for (String eachstudent: Students){
            System.out.println(eachstudent);
        }
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        for (int each: arr1){
            if (each<5){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("==============================");
        String sentence="I like Java";//Jva like it
        String[] words= sentence.split(" ");//[i, like, java]

        for (String eachWord: words) {//0~2
            System.out.println(eachWord);
        }
    }
}
