package TCS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the  shoes in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        for(String shoe : arr){
            int size = Integer.parseInt(shoe.substring(0,shoe.length()-1));
            char side = shoe.charAt(shoe.length()-1);
            map.putIfAbsent(size, new int[2]);

            if(side == 'L'){
                map.get(size)[0]++;
            }else if(side == 'R'){
                map.get(size)[1]++;
            }
        }

        int pairs = 0;
//        for(int[] value: map.values()){
//            pairs += Math.min(value[0],value[1]);
//        }
        for(Map.Entry<Integer,int[]> entry : map.entrySet()){
            pairs += Math.min(entry.getValue()[0],entry.getValue()[1]);
        }
        System.out.println(pairs);
    }
}

//size = 6
//shoes = ["6L", "6R", "7L", "6R", "7R", "6R"]
