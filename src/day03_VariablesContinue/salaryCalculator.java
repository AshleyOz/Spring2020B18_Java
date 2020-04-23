package day03_VariablesContinue;

public class salaryCalculator {
    public static void main(String[] args) {
        //Data type variable name = Data ;
        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;

        // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks ;
                  //total salary before the tax
        //stateTax= salari *stateTaxRate
        double stateTax = salary * stateTaxRate ;
        //federalTax = salary * federalTax
        double federalTax = salary * federalTaxRate;
        //salaryAfterTax = salary - stateTax - federalTax
        double salaryAfterTax =salary - stateTax - federalTax;
        System.out.println("Your salary is: $" +salary); // + makes the concatenation
        System.out.println("State tax is : $" + stateTax); //concatenation
        System.out.println("Federal taxis: $" + federalTax);
        System.out.println("Total tax is: $" + (federalTax + stateTax)  );
        System.out.println("Salary After Tax is: $" + salaryAfterTax );


        /*Example;
        System.out.println("9" + 3); outcome=93 =concatenation
        System.out.println( 9 + 3); outcome = 12 =addition
        System.out.println(9 + "3"); outcome = 93  = concatenation
        */














    }
}
