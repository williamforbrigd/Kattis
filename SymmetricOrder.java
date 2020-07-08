package Solutions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SymmetricOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        if (n != 0) {
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                names[i] = line;
            }

            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length; j++) {
                    if (names[i].length() > names[j].length() && i != j) {

                    }
                }
            }
        }
    }
}
