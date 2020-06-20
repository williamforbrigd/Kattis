package Solutions;

import java.util.Scanner;

public class Sibice {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x <= Math.sqrt(w*w+h*h))
                System.out.println("DA");
            else {
                sc.nextLine();
                System.out.println("NE");
            }
        }
    }
}
