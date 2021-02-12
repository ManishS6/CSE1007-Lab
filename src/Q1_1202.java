package src;

import java.util.Scanner;

public class Q1_1202 {
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder string = new StringBuilder(str);
        int len = (str.length()/2)*2;
        for (i = 0; i < len-1; i+=2) {
            string.setCharAt(i, str.charAt(i+1));
            string.setCharAt(i+1, str.charAt(i));
        }
        System.out.println("Answer is "+string);
    }
}
