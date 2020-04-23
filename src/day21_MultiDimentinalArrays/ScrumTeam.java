package day21_MultiDimentinalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String [] DevTeam ={"Zeynep","Haider","Jpovid"};
        String [] TestersTeam= {"Rahman","Aishan","Osman","Ali"};

        String [][] ScrumTeam ={DevTeam,TestersTeam};
        //                        0,      1
        System.out.println(ScrumTeam[0][3]);
        ScrumTeam[0][3]="Jean";

        String info=ScrumTeam [1][2];

        System.out.println(info);
        System.out.println("===============================");

        for (String eachEmployee : ScrumTeam[2]){
            System.out.println(eachEmployee);
        }
        System.out.println("=================================");
        System.out.println(ScrumTeam[2][1]);

        String[] TestersTeam2= {"ilham","Zarina","Aizhan","Asiman"};
    }
}
