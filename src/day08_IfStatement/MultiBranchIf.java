package day08_IfStatement;

public class MultiBranchIf {
    public static void main(String[] args) {
        int a =100;

        boolean zero = a==0;
        boolean negative = a < 0;
        boolean possitive = a > 0;
/*
        if(zero){
            System.out.println("zero");
        }
        if(negative){
            System.out.println("negative");
        }
        if(possitive){
            System.out.println("possitive");



*/   if(a== 0){
            System.out.println("zero");
        } else if(a>0){
            System.out.println("Positive");
    }else{
            System.out.println("negative");
        }
    }
}
