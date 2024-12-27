package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }




//        counting approach
//        int threeCount = 0,sixCount = 0,sevenCount = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 3){
//                threeCount++;
//            }else if (arr[i] == 6){
//                sixCount++;
//            }else {
//                sevenCount++;
//            }
//        }
//
//        int index = 0;
//        while(threeCount !=0){
//            arr[index++] = 3;
//            threeCount--;
//        }
//        while (sixCount !=0){
//            arr[index++] = 6;
//            sixCount--;
//        }
//        while (sevenCount !=0){
//            arr[index++] = 7;
//            sevenCount--;
//        }
//        System.out.println(Arrays.toString(arr));

        int l = 0, m = 0,r = n-1;
        while (m<=r){
            int temp =0;
            switch (arr[m]){
                case 3:
                    temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                    l++;
                    m++;
                    break;

                case 6:
                    m++;
                    break;

                case 7:
                    temp = arr[m];
                    arr[m] = arr[r];
                    arr[r] = temp;
                    r--;
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
