package day07_IfStatements;

public class ValidTriangle {

    public static void main(String[] args) {

        double angle1 = 30.5;
        double angle2 = 50;
        double angle3 = 60;

        short sumofAngles = (short) (angle1 + angle2 +angle3);
        boolean validTraingle = sumofAngles ==180;

        if(validTraingle) {
            System.out.println("The shape is triangle");

        }
        if(sumofAngles !=180 ) {
            System.out.println("The shape is not a valid triangle");
        }
    }
}
