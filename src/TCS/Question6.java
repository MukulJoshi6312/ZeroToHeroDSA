package TCS;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and check it's armstrong number or not: ");
        int number = sc.nextInt();
        boolean result = isArmstrong(number);
        System.out.println(result);
    }
    public static boolean isArmstrong(int number) {
        int temp = number;
        int digit = 0;
        while (temp != 0) {
             digit++;
             temp /= 10;
        }
        temp = number;
        int sum = 0;
        while (temp != 0) {
             int last = temp % 10;
            sum+= (int) Math.pow(last, digit);
            temp /= 10;
        }
       if (sum == number) {
           return true;
       }
       return false;

    }
}
