package TCS;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#'){
                count1++;
            }else{
                count2++;
            }
        }
        int result1 = count1 - count2;
        if(result1 > 0){
            System.out.println(result1+" X character needed");
        }else if(result1 < 0){
            System.out.println(-result1+" # character needed");
        }else{
            System.out.println("String is already valid");
        }
    }
}

