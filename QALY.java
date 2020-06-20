package Solutions;

import java.util.Scanner;

public class QALY {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double k = 0;

        for(int i = 0; i < x; i++) {
            double y = sc.nextDouble(), z = sc.nextDouble();
            k += y*z;
        }

        System.out.println(k);
    }
}
