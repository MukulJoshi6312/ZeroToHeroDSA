package TCS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int sum = 0;

        for(Map.Entry<Integer,Integer> mapEntry : map.entrySet()){

            if(mapEntry.getValue() == 1){
                sum += mapEntry.getKey();
            }

        }
        System.out.println(sum);
    }
}
