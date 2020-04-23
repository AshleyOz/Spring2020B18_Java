package day18_NestedLoop;

public class do_While_Practice {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.print(num + " ");
            num++;

            if (num % 2 != 0) {
                System.out.println(num + " ");
            }

            num++;

        } while (num == 100);

        System.out.println();
        System.out.println("===============================================");
        int i=1;
        do{
            i++;
            System.out.println(i);
        }while (i<=5);
        System.out.println("===========================");


        int y =1;
        do{
            if (y==3){
                continue;
            }
            System.out.println(y);
            y++;
        }while (y<=5);
    }
}
