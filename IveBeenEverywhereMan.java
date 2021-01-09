import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IveBeenEverywhereMan  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(reader.readLine());
        for(int j=0; j < t; j++) {
            int n = Integer.parseInt(reader.readLine());
            String[] cities = new String[n];
            for(int i=0; i < n; i++) {
                cities[i] = reader.readLine();
            }
            System.out.println(findDistinct(cities));
        }
    }

    private static int findDistinct(String[] t) {
        int count = 1;
        for(int i=1; i < t.length; i++) {
            int j=0;
            for(j=0; j < i; j++) {
                if(t[i].equals(t[j])) {
                    break;
                }
            }
            if(i==j) {
                count++;
            }
        }
        return count;
    }
}
