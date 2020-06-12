package kattis;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double bpm = 0;
        double diff = 0;
        while(--n >= 0) {
            int b = sc.nextInt();
            double p = sc.nextDouble();

            bpm = 60 *(b/p);
            diff = 60/p;
            System.out.println((bpm-diff) + " " + (bpm) + " " + (bpm+diff));
        }
    }
}
