package src;

import java.util.Scanner;

public class Q4_1202 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the Number of Rows and Columns");
        m = in.nextInt();
        n = in.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][10];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 10; j++) {
                arr2[i][j]=0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr1[i][j];
                String s = Integer.toString(temp);
                String a = Character.toString(s.charAt(0));
                if(temp<10){
                    arr2[i][0] = temp;
                }
                else {
                    switch(a){
                        case "1": arr2[i][1] = Integer.parseInt(s);break;
                        case "2": arr2[i][2] = Integer.parseInt(s);break;
                        case "3": arr2[i][3] = Integer.parseInt(s);break;
                        case "4": arr2[i][4] = Integer.parseInt(s);break;
                        case "5": arr2[i][5] = Integer.parseInt(s);break;
                        case "6": arr2[i][6] = Integer.parseInt(s);break;
                        case "7": arr2[i][7] = Integer.parseInt(s);break;
                        case "8": arr2[i][8] = Integer.parseInt(s);break;
                        case "9": arr2[i][9] = Integer.parseInt(s);break;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
