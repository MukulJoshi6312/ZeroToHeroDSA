package TCS;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print the sum of the subarray with the maximum sum.");

//        This approach has O(N^3) time complexity we can optimize this code using kedans algorithm
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < N; i++) {
//            for (int j = i; j < N; j++) {
//                int sum = 0;
//                for (int k = i; k < j; k++) {
//                    sum += arr[k];
//                }
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//        System.out.println(maxSum);


//        optimal solution which have O(N) time complexity

        int sum = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum > maxSoFar) {
                maxSoFar = sum;
            }
            if (0 > sum) {
                sum = 0;
            }
        }
        System.out.println(maxSoFar);

    }
}
