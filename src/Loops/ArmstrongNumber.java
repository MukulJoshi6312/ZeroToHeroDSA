package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int digit =0;
        int temp = num;
        while(temp != 0){
            digit++;
            temp = temp/10;
        }
//        System.out.println(digit);
        temp = num;
        int ans = 0;
        while(temp != 0){
            int lastDigit = temp%10;
            ans = (int) (ans  + Math.pow(lastDigit,3));
            temp = temp/10;
        }
//        System.out.println(ans);
        if (ans == num){
            System.out.println(num+" is an armstrong number.");
        }else {
            System.out.println(num+" is not an armstrong number.");
        }
    }

}
