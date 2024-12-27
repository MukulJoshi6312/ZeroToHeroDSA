package TCS;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp=number;

        System.out.print(number+", ");
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            }
            else {
                number = number * 3 +1;
            }
            System.out.print(number+", ");
        }
        System.out.println();
        int step = 0;
        number = temp;
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            }else  {
                number = number * 3 +1;
            }
            step++;
        }
        System.out.println("\nStep to reach the 1 : "+step);

        number = temp;
        int max = temp;
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            }else {
                number = number * 3 +1;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.println("\nThe max element in the colltez series : "+max);



    }
}
