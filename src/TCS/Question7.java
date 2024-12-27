package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 ==0 && arr[i] % 5 == 0) {
                list.add("ThreeFive");
            }else if (arr[i] % 3 == 0) {
                list.add("Three");
            }else if (arr[i] % 5 == 0) {
                list.add("Five");
            }else{
                list.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(list);
    }
}
