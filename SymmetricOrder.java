package Solutions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SymmetricOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        while(n != 0) {
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = reader.readLine();
            }
               
            /*
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length; j++) {
                    if (names[i].length() > names[j].length() && i != j) {
                                                    
                    }
                }
            }
            */
            int x = 1;
            System.out.println("SET" + x);
            for(int i = 0; i < Math.ceil(n/2); i+=2) {
                System.out.println(names[i]);
                names[i] = "";
            }
            for(int i = (int) (n - Math.ceil(n / 2)); i > 0; i--) {
                System.out.println(names[i]);
                names[i] = "";
            }
            x++;
            n = Integer.parseInt(reader.readLine());
        }
    }
}
