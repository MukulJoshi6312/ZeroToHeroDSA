package TCS;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        System.out.println("Enter the number to generate the fibbnachi  series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f1 = 0, f2 = 1;
        int sum = f1+f2;
        System.out.print(f1+" "+f2+" ");
        for (int i = 2; i < n; i++) {
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
            sum += temp;
            System.out.print(temp+" ");
        }
        System.out.println("\n"+sum);

    }
}
