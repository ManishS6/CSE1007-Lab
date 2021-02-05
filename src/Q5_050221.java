// Question 5
// 5. A given number (x) falls in one of the following categories (give x a value from
// the code, don't read from user):
// ○ 0 to 9
// ○ 10 to 19
// ○ 20 to 29
// ○ None of the categories
// For example, if x = 5, program should print "0 to 10", and if x = 44 it should print
// "None".

package src;

import java.util.Random;

public class Q5_050221 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        if(x<10){
            System.out.println("0 to 10");
        }
        else if(x<20 && x>10){
            System.out.println("10 to 20");
        }
        else if(x<30 && x>20){
            System.out.println("20 to 30");
        } else{
            System.out.println("None");    
        }
    }   
}
