package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of sub array: ");
        int k = sc.nextInt();

        List<Integer> maxElements = new ArrayList<>();
        for (int i = 0; i <= n-k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j< i+k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            maxElements.add(max);
        }
        System.out.println("Max elements: " + maxElements.toString());

    }
}
