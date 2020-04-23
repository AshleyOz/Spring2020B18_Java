package day23_Methods;


//3.create a function that can reverse any string
//"Muhtar" ==> rathuM,  "Cybertek"==> ketrebyC
public class methods_with_paramaters2 {
    public static void main(String[] args) {
        String names = "Ashley";
        Reversestring(names);
    }


    public static void Reversestring(String str){
        for (int i= str.length()-1;i >=0 ; i--){
            System.out.print(str.charAt(i));

        }
    }
}
