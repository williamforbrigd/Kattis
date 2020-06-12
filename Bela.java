package kattis;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");
        String dominant = firstLine[1];
        int sum = 0;

        int n = 4*Integer.parseInt(firstLine[0]);
        while(n-- > 0) {
            String[] line = sc.nextLine().split("");
            switch(line[0]) {
                case "A": sum+=11; break;
                case "K": sum+=4; break;
                case "Q": sum+=3; break;
                case "J": sum+=2; break;
                case "T": sum+=10; break;
            }
            if(line[1].equals(dominant)) {
                switch(line[0]) {
                    case "J": sum+=18; break;
                    case "9": sum+=14; break;
                }
            }
        }
        System.out.println(sum);
    }
}
