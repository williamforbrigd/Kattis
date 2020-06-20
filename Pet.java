package Solutions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Pet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sums = new int[5];
        for(int i = 0; i < 5; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                sums[i] += Integer.parseInt(line[j]);
            }
        }
        int max = 0;
        int index = 0;
        for(int i = 0; i < sums.length; i++) {
            if(Math.max(max, sums[i]) == sums[i]) {
                max = sums[i];
                index = i;
            }
        }
        System.out.println(index+1 + " " + max);
    }
}
