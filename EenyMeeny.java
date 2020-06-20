package Solutions;

import java.util.Scanner;

import java.util.ArrayList;
public class EenyMeeny {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        boolean b = true;

        String rhyme = sc.nextLine();
        String[] split = rhyme.split(" ");

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name);
        }

        int index = (split.length-1)%n;
        while(--n >= 0) {
            if(b) {
                team1.add(names.get(index));
                names.remove(names.get(index));
                index--;
            } else {
                team2.add(names.get(index));
                names.remove(names.get(index));
            }
            b = !b;
        }

        System.out.println(team1.size());
        team1.forEach(s -> System.out.println(s));

        System.out.println(team2.size());
        team2.forEach(s -> System.out.println(s));
    }
}
