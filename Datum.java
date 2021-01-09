package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Datum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");

        String[] weekDays = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        int day = Integer.parseInt(line[0]);

        for(int i=0; i < Integer.parseInt(line[1])-1; i++) {
            day += months[i];
        }
        System.out.println(weekDays[(day%7)-1]);
    }
}