package TCS;

import java.util.Scanner;

public class Demo {
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
        int s = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum =0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
//                    System.out.print(arr[k]+" ");
                }
                if (sum == s){
                    count+=1;
                }
//                System.out.println();
            }
//            System.out.println();
        }
        System.out.println(count);
    }
}
