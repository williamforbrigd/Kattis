package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenWonders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split("");

        int t = 0, c = 0, g = 0;
        char[] cards = new char[line.length];

        for(int i = 0; i < line.length; i++) {
            cards[i] = line[i].charAt(i);
            /*
            if(line[i].equals("T")) t++;
            else if(line[i].equals("C")) c++;
            else if(line[i].equals("G")) g++;

             */
        }
        for(int i = 0; i < cards.length; i++) {
            if(cards[i] == 'T') t++;
            else if(cards[i] == 'C') c++;
            else if(cards[i] == 'G') g++;
        }
        //if(cards.)

        /*
        int sum = 0;
        if(t > 0 && g > 0 && c > 0)
            sum =(int) (Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2) + 7);
        else
            sum =(int) (Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2));

         */


    }
}
