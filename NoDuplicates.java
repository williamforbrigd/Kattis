package Solutions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NoDuplicates {
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
        if(line != null) {
            String ans = "";
            for(int i = 0; i < line.length; i++) {
                for(int j = 0; j < line.length; j++) {
                    if(line[i].equals(line[j]) && i != j) {
                        ans = "no";
                    }
                }
            }
            if(ans.equals("")) {
                System.out.println("yes");
            } else {
                System.out.println(ans);
            }
        }
    }
}

