package Loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
//        boolean isPrime = true;
//        System.out.println(Math.sqrt(num));
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
               return false;
            }
        }
        return true;
    }

}
