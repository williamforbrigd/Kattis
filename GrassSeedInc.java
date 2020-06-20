package Solutions;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        int l = sc.nextInt();

        double sum = 0.0;
        while(--l >= 0) {
            double width = sc.nextDouble(), length = sc.nextDouble();
            sum += width*length;
        }
        System.out.println(c*sum);
    }
}
