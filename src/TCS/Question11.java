package TCS;

import java.util.HashMap;
import java.util.Map;

public class Question11 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int threshold = nums.length/3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >= threshold){
                System.out.println(entry.getKey());
            }
        }
    }
}
