package Loops;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

//        revers the number
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (num == reverse) {
            System.out.println(num + " is a palindrome.");
        }else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
