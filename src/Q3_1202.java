package src;

import java.util.Scanner;

public class Q3_1202 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        char[] arr1 = new char[20];
        int len=0,count=0;
        a = in.nextLine();
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        System.out.println("The original string is "+a);
        System.out.println("The reverse string is "+b);
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i) != b.charAt(i)){
                count++;
                arr1[len++] = a.charAt(i);
                arr1[len++] = b.charAt(i);
            }
        }
        if(count>2){System.out.print("Not palindrome");}
        else{
            System.out.println("Can be a Palindrome by changing "+arr1[0]+" with "+arr1[1]+" or vice-versa.");
        }
    }
}
