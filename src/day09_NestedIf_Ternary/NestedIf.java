package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age =17;
        boolean USCitizen = true;
        if(USCitizen){
            if(age >17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("Grow up first, and then vote");
            }
        }else{
            System.out.println("Only the US citizens are eligible to vote");
        }
    }
}
