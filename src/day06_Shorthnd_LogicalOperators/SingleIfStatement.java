package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;
        if(coldWeather) {
            //true .if the condition is true it will execute. otherwise it never gets executed.
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");

            boolean coronaDetected = true;
            if(coronaDetected){
                System.out.println("Buy more toilet papers");
                System.out.println("Buy more water");
                System.out.println("Stay home");
                System.out.println("Do more java coding");
                System.out.println("==============================================================");

                int a = 100;
                boolean evenNumber = a % 2 ==0; // if a number can be devided by 2 without the remainder
                //boolean oddNumber = a % 2 ! =0;// if the number can not be devided by 2 evenly

                if ( evenNumber){
                    System.out.println(a+"is even number");

                }




            }

        }
    }
}
