package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        //           0 1 2
        //System.out.println(arr1[100]);//arrays size fixed =>error

        int[] nums= new int[2];
        nums[0]=10;
        nums[1]=20;
        //num[2]=30;==>error because the arrays size is fixed to 2

        nums= new int[3];//reset, {0,0,0}

        System.out.println(nums[0]);
        System.out.println(nums[1]);
    }
}
