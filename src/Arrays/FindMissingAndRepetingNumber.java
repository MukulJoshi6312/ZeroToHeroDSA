package Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMissingAndRepetingNumber {

//    approch 1

//    public static int[] findMissingAndRepte(int arr[]){
//        Arrays.sort(arr);
//        int duplicate = -1;
//        for(int i =1;i<arr.length;i++){
//            if (arr[i] == arr[i-1]){
//                duplicate = arr[i];
//                break;
//            }
//        }
//        return new int[]{duplicate, duplicate + 1};
//    }

//    approch 2 brute force using frequency array is the index frequency is 2 means it's duplicate if the frequency is 0 means missing number make a frequency array n+1 size
//     public static int[] findMissingAndRepte(int arr[]){
//         int[] freq = new int[arr.length+1];
//         for(int i =0;i<arr.length;i++){
//             int index = arr[i];
//             freq[index]++;
//         }
//         int missing =0,duplicate =0;
//         for(int i =1;i<freq.length;i++){
//             if(freq[i] == 2){
//                 duplicate = i;
//             }
//             if(freq[i]==0){
//                 missing = i;
//             }
//         }
//         return  new int[]{duplicate,missing};
//     }
//     time complexity O(2N)
//    space complexity O(N)

//    approch 3 optimal approch using the xor operator
public static int[] findMissingAndRepte(int arr[]) {

    int n = arr[0];
    for(int i =1;i<arr.length;i++){
        n = n^arr[i];
    }
    System.out.println(n);

    return  new int[]{0,2};
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter the element into the array :");
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int[] res = findMissingAndRepte(arr);
        System.out.println(res[0]+" "+res[1]);

    }
}
