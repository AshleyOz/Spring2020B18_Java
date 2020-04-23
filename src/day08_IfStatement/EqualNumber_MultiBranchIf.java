package day08_IfStatement;

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {
        double n1 =400;
        double n2 =300;
        double n3 =500;

        boolean n1Equaln2 = n1==n2 && n1 != n3;
        boolean n1Equaln3 = n1==n3 && n1 != n2;
        boolean n2Equaln3 = n2==n3 && n2 != n1;
        boolean allEqual = n1 ==n2 && n1 ==n3;

        String result = " ";

        if(n1Equaln2){
            result = "n1 is equal to n2";
        }
        else if(n2Equaln3){
            result = "n2 is equal to n3";
        }
        else if (allEqual){
            result = "n1 is equal to n2 and n3";
        }else{
            result = " None of them are equal";

        }
    }
}
