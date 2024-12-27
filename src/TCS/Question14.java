package TCS;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxItemIndex = -1;

//        first find the maximum value and store max value index in the maxItemIndex variable
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxItemIndex = i;
                if(arr[i] < min){
                    min = arr[i];
                }
//                here we got the index of max element value
            }
        }
//        now we again itterate over the loop 0 to maxItemIndex and find the minimum value
//        for (int i =0;i<=maxItemIndex;i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
        System.out.println("Result of max and min value = "+ "Max value = "+ max +" Min Value " + min+" Result "+(max-min));

    }
}

//7
//        [2, 3, 10, 6, 4, 8, 1]