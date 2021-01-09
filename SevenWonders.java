package Solutions;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        int t = 0, c=0, g=0, sum=0;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == 'T') t++;
            else if(arr[i] == 'C') c++;
            else if(arr[i] == 'G') g++;
        }
        int[] nums = {t,c,g};
        int smallest = 0;
        for(int i=0; i < nums.length; i++) {
            if(t > 0 && c > 0 && g > 0) {
                smallest = minArr2(nums);
            }
        }

        sum += Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2) + (7*smallest);
        System.out.println(sum);
        sc.close();
    }

    public static int minArr(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        if(arr == null) {
            return 0;
        } else {
            while(i < arr.length) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                i++;
            }
        }
        return min;
    }

    public static int minArr2(int[] arr) {
        if(arr==null) return 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}