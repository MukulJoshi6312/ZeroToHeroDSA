package Loops;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Factor of: "+num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(", "+i);
            }
        }
    }
}
