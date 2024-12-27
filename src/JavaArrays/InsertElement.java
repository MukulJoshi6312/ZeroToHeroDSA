package JavaArrays;

import java.util.Arrays;
import java.util.Scanner;

//Number of elements: 5
//Elements: 10 20 30 40 50
//Element to be added: 25
//Position where to insert: 3
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element to be added: ");
        int element = sc.nextInt();
        System.out.println("Position where to insert: ");
        int pos = sc.nextInt();

//
        int[] newArr = new int[n+1];
        for (int i = 0; i < pos-1; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos-1] = element;
        for (int i = pos; i < n+1; i++) {
            newArr[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
