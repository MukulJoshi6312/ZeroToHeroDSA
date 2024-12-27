package Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
//        int temp = num;
        for(int i=1;i<=num;i++){
            if (isPerfectNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int temp = num;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }

}
