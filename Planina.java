package kattis;

import java.util.Scanner;

public class Planina {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = (int) ((Math.pow(2,x)+1) * (Math.pow(2,x)+1));
        System.out.println(res);
    }
}
