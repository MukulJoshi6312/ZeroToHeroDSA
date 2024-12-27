package TCS;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the name into the array: ");
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        int max = Integer.MIN_VALUE;
        String name = "";
        for(int  i =0;i<n;i++){
            if (arr[i] > max){
                max = arr[i];
                name = names[i];
            }
        }
        System.out.println(name);
    }
}
