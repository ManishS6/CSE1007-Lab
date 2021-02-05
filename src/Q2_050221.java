// Question 2
// Create a program that declares four variables and assigns appropriate values to them. • your birthday month (1-12) • your birthday day (1-31) • the birthday month of another student sitting near you today (1-12) • the birthday day of that same student near you (1-31) Ask your neighbor for their name and for the proper numbers to store in the variables for his/her birthday. Then produce output in this format using your four variables: (methods) 
// My birthday is 9/19, and Suzy's is 6/14.

package src;

import java.util.Scanner;

public class Q2_050221 {
    public static void main(String[] args) {
        int myBirthdayMonth = 5;
        int myBirthDate = 29;
        Scanner in = new Scanner(System.in);
        
        String herName = in.nextLine();
        int herBirthdayMonth =  in.nextInt();
        int herBirthDate = in.nextInt();

        System.out.println("My birthday is "+myBirthdayMonth+"/"+myBirthDate+", and "+herName+"'s is "+herBirthdayMonth+"/"+herBirthDate+".");
    }
}
