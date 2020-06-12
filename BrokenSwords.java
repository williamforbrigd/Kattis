package kattis;

import java.util.Scanner;

public class BrokenSwords {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int tb = 0, lr = 0;
        for(int i = 0; i < n; i++) {
            String input = sc.nextLine();
            int t = Integer.parseInt(input.substring(0,1));
            int b = Integer.parseInt(input.substring(1,2));
            int l = Integer.parseInt(input.substring(2,3));
            int r = Integer.parseInt(input.substring(3,4));
            if(t == 0)
                tb++;
            if(b == 0)
                tb++;
            if(l == 0)
                lr++;
            if(r == 0)
                lr++;
        }
        int count = 0;
        while(tb >= 2 && lr >= 2) {
            tb-=2;
            lr-=2;
            count++;
        }
        System.out.println(count + " " + tb + " " + lr);
    }
}
