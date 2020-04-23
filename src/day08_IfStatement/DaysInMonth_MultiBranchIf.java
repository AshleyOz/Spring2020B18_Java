package day08_IfStatement;

public class DaysInMonth_MultiBranchIf {
    public static void main(String[] args) {
        byte months = 4;
        String result = " ";

        if (months == 1) {
            result = "January has 31 days";
        } else if (months == 2) {
            result = "February has 28 or 29 days";
        } else if (months == 3) {
            result = "March has 31 days";
        } else if (months == 4) {
            result = "April has 30 days";
        } else if (months == 5) {
            result = "May has 31 days";
        } else if (months == 6) {
            result = "June has 30 days";
        } else if (months == 7) {
            result = "July has 31 days";
        } else if (months == 8) {
            result = " Agust has 30 days";
        } else if (months == 9) {
            result = " September has 31 days";
        } else if (months == 10) {
            result = " October has 30 days";
        } else if (months == 11) {
            result = "November has 31 days";
        } else if (months == 12) {
            result = "December has 31 days";
        }else{
            result= "invalid entry";

        }


        System.out.println(result);

    }
}
