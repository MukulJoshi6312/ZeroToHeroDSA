package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of the k : ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (prefixSum.containsKey(sum-k)) {
                count += prefixSum.get(sum-k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
//
//Problem Description
//Given an array of integer nums and an integer k, return the total number of subarrays whose sum equals k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//
//        Input Format
//The first line contains an integer N, representing the length of the array.
//The second line contains N space-separated integers.
//The third line contains an integer k.
//        Output Format
//Print the total number of subarrays whose sum equals k.
//
//Constraints
// 1 ≤ arr.size() ≤ 10⁴
//        -10³ ≤ arr[i] ≤ 10³
//        -10⁷ ≤ k ≤ 10⁷
//Example
//Sample Input:
//        7
//        [0, 1, 2, 3, 4, 5, 6]
//        9
//Sample Output:
//        2
//Explanation:
//There are 2 subarrays whose sum is 9 ie [2, 3, 4] and [4, 5].
//
