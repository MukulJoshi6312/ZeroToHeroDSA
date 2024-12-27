package TCS;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of prime numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                int sum = 0;
                int temp = i;
                while (temp != 0){
                    sum += temp % 10;
                    temp = temp / 10;
                }
                if (isPrime(sum)){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
