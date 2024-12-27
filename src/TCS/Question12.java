package TCS;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxPro = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-2; i++) {
            int pro = 1;
            for (int j = i; j < 3+i; j++) {
                pro *= arr[j];
            }
            if (pro > maxPro) {
                maxPro = pro;
            }
        }
        System.out.println(maxPro);
    }
}
