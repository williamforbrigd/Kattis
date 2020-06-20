package Solutions;

import java.util.Scanner;

public class Bela {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String[] split = first.split(" ");

        int n = 4*Integer.parseInt(split[0]), sum = 0;

        while(--n >= 0) {
            String[] line = sc.nextLine().split("");
            switch(line[0]) {
                case "A": sum += 11; break;
                case "K": sum += 4; break;
                case "Q": sum += 3; break;
                case "J": sum += 2; break;
                case "T": sum += 10; break;
            }
            if(line[1].equals(split[1])) {
                if(line[0].equals("J")) sum += 18;
                if(line[0].equals("9")) sum += 14;
            }
        }
        System.out.println(sum);
    }
}
