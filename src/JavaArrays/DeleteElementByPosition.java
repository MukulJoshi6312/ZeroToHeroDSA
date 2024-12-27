package JavaArrays;

import java.util.*;

public class DeleteElementByPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Position which you want to delete: ");
        int pos = sc.nextInt();

//        check for valid delete position

        if(pos <=0 || pos > n){
            System.out.println("Invalid Position: ");
        }else{
            for (int i = pos-1; i < n-1; i++) {
                arr[i] = arr[i+1];
            }
            n--;
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
