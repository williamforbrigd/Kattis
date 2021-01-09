package Solutions;

import java.util.Scanner;

public class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        int current = 0, count = 0;

        while(--x >= 0) {
            String[] line = sc.nextLine().split(" ");
            int num = Integer.parseInt(line[1]);
            String word = line[0];
            if(word.equals("enter")) {
                if((num+current) <= l) {
                    current += num;
                } else {
                    count++;
                }
            } else if(word.equals("leave") && (current-num) <= current) {
                current -= num;
            }
        }
        System.out.println(count);
    }
}
