package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tri {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");

        int first = Integer.parseInt(line[0]), second  = Integer.parseInt(line[1]), third = Integer.parseInt(line[2]);

        String println = "";
        
        
        if(first+second == third) {
            println += first + "+" + second + "=" + third;
        } else if(first-second == third) {
            println += first + "-" + second + "=" + third;
        } else if(first*second == third) {
            println += first + "*" + second + "=" + third;
        } else if(first/second == third && first%second==0){
            println += first + "/" + second + "=" + third;
        } else if(first == second+third) {
            println += first + "=" + second+"+"+third;
        } else if(first == second-third) {
            println += first + "=" + second+"-"+third;
        } else if(first == second*third) {
            println += first + "=" + second+"*"+third;
        } else if(first == second/third && second%third == 0) {
            println += first + "=" + second+"/"+third;
        }

        System.out.println(println);
    }
}