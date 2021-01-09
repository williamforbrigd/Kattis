package Solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BaconEggsSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            ArrayList<String> keys = new ArrayList<>();

            if(n == 0)
                break;

            for(int i = 0; i < n; i++) {
                String name = sc.next();
                String[] ingredients = sc.nextLine().substring(1).split(" ");

                for(int j = 0; j < ingredients.length; j++) {
                    if(!map.containsKey(ingredients[j])) {
                        ArrayList<String> names = new ArrayList<>();
                        names.add(name);
                        map.put(ingredients[j], names);
                        keys.add(ingredients[j]);
                    } else {
                        ArrayList<String> names = map.get(ingredients[j]);
                        names.add(name);
                        map.put(ingredients[j], names);
                    }
                }
            }
            Collections.sort(keys);

            for(int i = 0; i < keys.size(); i++) {
                System.out.print(keys.get(i));

                ArrayList<String> names = map.get(keys.get(i));

                Collections.sort(names);

                for(int j = 0; j < names.size(); j++) {
                    System.out.print(" " + names.get(j));
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
