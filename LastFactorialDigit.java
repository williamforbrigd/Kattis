package kattis;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while(--t >= 0 && t <= 10) {
            int sum = 1;
            int n = sc.nextInt();
            while(n > 0) {
                sum *= n;
                sum %= 10;
                n--;
            }
            System.out.println(sum);
        }
    }
}
