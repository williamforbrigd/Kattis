package kattis;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int total = 60*h + m;

        if(total < 45) {
            total = 60*24+m-45;
        } else {
            total = (60*h + m)-45;
        }


        if(total%60 == 0) {
            System.out.println(total + " " + "00");
        } else {
            int hours = total / 60;
            int minutes = total % 60;
            System.out.println(hours + " " + minutes);
        }
    }
}
