package Solutions;

import java.util.Scanner;

public class DiceCup {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        if(n == m) {
            System.out.println(n+1);
        } else if(n > m) {
            for(int i = m; i <= n; i++) {
                System.out.println(i+1);
            }
        } else {
            for(int i = n; i <= m; i++) {
                System.out.println(i+1);
            }
        }
    }
}
