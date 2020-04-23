package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String myclassmates[] = {"Muhtar", "Phu", "Natallia","Saim","Sevgin" };
        //                         0,       1,        2,       3,     4
        System.out.println(myclassmates[4]);

        String s1= myclassmates[2];
        System.out.println(s1);
        System.out.println("===========================");

        for (int i=0;i <=6; i++){
           String name= myclassmates[i];
            System.out.println(name);
            System.out.println("=================");

            String presidents[]={"George Washington (1789–1797)", "John Adams (1797–1801) ","Thomas Jefferson (1801–1809)","James Madison (1809–1817)","John Quincy Adams (1825–1829)","Andrew Jackson (1829–1837)","Martin Van Buren (1837–1841)"};


            for ( int p= 0; i<=8; i++){
                String name2 =  presidents[i];
                System.out.println(name2);
            }

        }

    }
}
