package JavaArrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1  = {1, 4, 6, 9, 15};
        int[] arr2 = {2, 5, 8, 10};

        int[] mergeArr = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int mergeIndex  = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                mergeArr[mergeIndex++] = arr1[index1++];
            }else{
                mergeArr[mergeIndex++] = arr2[index2++];
            }
        }
        while (index1 < arr1.length) {
            mergeArr[mergeIndex++] = arr1[index1++];
        }
        while (index2 < arr2.length) {
            mergeArr[mergeIndex++] = arr2[index2++];
        }

        System.out.println(Arrays.toString(mergeArr));
    }
}
