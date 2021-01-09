package Solutions;

import java.util.Scanner;

public class Bijele {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int[] pieces = {1,1,2,2,2,8};
        int[] input = new int[6];

        for(int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < input.length; i++) {
            System.out.println(pieces[i]-input[i]);
        }
        sc.close();
    }
}
