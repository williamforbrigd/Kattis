package Solutions;

import java.io.*;

public class Filip {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = reader.readLine().split(" ");
            solve(line);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void solve(String[] line) {
        if(Integer.parseInt(line[0]) != Integer.parseInt(line[1]) && !line[0].contains("0") && !line[1].contains("0")) {
            char[] line1 = line[0].toCharArray(), line2 = line[1].toCharArray();
            String first = "", second = "";
            for(int i = line1.length-1; i >= 0; i--) {
                first += line1[i];
            }
            for(int i = line2.length-1; i >= 0; i--) {
                second += line2[i];
            }
            int num1 = Integer.parseInt(first), num2 = Integer.parseInt(second);
            if(num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
        }
    }
}
