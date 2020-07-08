package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpeedLimit {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int sum = 0;
        int time = 0;

        do{
            do {
                String[] line = reader.readLine().split(" ");
                sum += Integer.parseInt(line[0]) * (Integer.parseInt(line[1]) - time);
                time = Integer.parseInt(line[1]);
            } while(--n > 0);
            System.out.println(sum + " miles");
            time = 0;
            sum = 0;
            n = Integer.parseInt(reader.readLine());
        } while(n != -1);


    }
}
