package kattis;

import java.util.Scanner;

public class Pot {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int res = 0;

        for(int i = 0; i < n; i++) {
            String num = sc.nextLine();
            String number = num.substring(0, num.length()-1);
            String potens = num.substring(num.length()-1);
            int x = Integer.parseInt(number);
            int y = Integer.parseInt(potens);

            res += Math.pow(x,y);
        }
        System.out.println(res);
    }
}
