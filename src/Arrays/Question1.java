package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public  static  void printFrequency(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Duplicate found");
                return;
            }
        }
        System.out.println("No duplicate found");
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printFrequency(nums);
    }
}
