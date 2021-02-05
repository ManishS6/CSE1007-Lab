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
