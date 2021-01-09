package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SymmetricOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int x = 1;
        int n = Integer.parseInt(reader.readLine());
        while(true && n != 0) {
            if(n==0) break;
            System.out.println("SET " + x);
            String[] names = new String[n/2];
            for(int i = names.length-1; i >=0; i--) {
                System.out.println(reader.readLine());
                names[i] = reader.readLine();
            }
            if(n%2 == 1) {
                System.out.println(reader.readLine());
            }
            for(String name : names) {
                System.out.println(name);
            }
            x++;
            n = Integer.parseInt(reader.readLine());
        }
    }
}


/**
 * The solutions works but gets a runtime error. Bad solution.
 */
/*
public class SymmetricOrder2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(reader.readLine());
            int x = 1;
            while(n != 0) {
                String[] names = new String[n];
                for (int i = 0; i < n; i++) {
                    names[i] = reader.readLine();
                }
                System.out.println("SET" + x);

                if(n%2 == 0) {
                    for(int i = 0; i < 2*(n/2); i+=2) {
                        if(names[i] != "")
                            System.out.println(names[i]);
                        names[i] = "";
                    }
                    for(int i = n-1; i >=1; i-=2) {
                        if(names[i] != "")
                            System.out.println(names[i]);
                        names[i] = "";
                    }
                } else {
                    for(int i = 0; i < 2*((n/2)+1); i+=2) {
                        if(names[i] != "")
                            System.out.println(names[i]);
                        names[i] = "";
                    }
                    for(int i = n-2; i >=1; i-=2) {
                        if(names[i] != "")
                            System.out.println(names[i]);
                        names[i] = "";
                    }
                }
                x++;
                n = Integer.parseInt(reader.readLine());
            }
        }
        
    }
}
*/
