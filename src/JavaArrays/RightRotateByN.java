package JavaArrays;

import java.util.Arrays;

public class RightRotateByN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int size = arr.length;
        int n = 3;
        rotateRight(arr, 0, size - n-1);
        rotateRight(arr, size - n, size - 1);
        rotateRight(arr, 0, size- 1);
        System.out.println(Arrays.toString(arr));

    }

    static void rotateRight(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
