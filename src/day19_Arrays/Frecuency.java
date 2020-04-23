package day19_Arrays;

public class Frecuency {
    public static void main(String[] args) {
        String str="AABCC"; //"A2B1C2"

        String nonDup="";//ABC

        for (int i=0;i <= str.length()-1;i++){

            if (!nonDup.contains("" +str.charAt(i))) { //if the character at index is not cont
                nonDup+= str.charAt(i);
            }

        }
        System.out.println(nonDup);

        //nonDup="ABC"; str= "AABC"; ==> "A2B1C2"

        int count= 0; //count the total number of occurance of each character from str
        for (int i=0; i<= str.length()-1;i++){
            if (str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);//2
    }
}
