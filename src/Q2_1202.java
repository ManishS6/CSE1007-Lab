package src;
import java.util.Scanner;
public class Q2_1202 {
    public static void main(String[] args) {
        int m,n;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        int[][] arr1 = new int[m+2][n+2];
        for (int i = 0; i < m+2; i++) {
            for (int j = 0; j < n+2; j++) { arr1[i][j] = 0; }
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) { arr1[i][j] = in.nextInt(); }
        }
        for (int i = 0; i < m+2; i++) {
            for (int j = 0; j < n+2; j++) {
                System.out.print((arr1[i][j])+"\t");
            }
            System.out.println();
        }
        System.out.println("printing the pure array now:");
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print((arr1[i][j])+"\t");
            }
            System.out.println();
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) { arr1[i][j] = Replacer(arr1, i, j); }
        }
        System.out.println("printing the answer array now:");
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) { System.out.print((arr1[i][j])+"\t"); }
            System.out.println();
        }
    }
    public static int Replacer(int[][] arr,int a,int b){
        int greater=0; int smaller=0;
        int num = arr[a][b];
        for (int i = a-1; i <= a+1; i++) {
            for (int j = b-1; j <= b+1; j++) {
                if(i==a && j==b){continue;}
                else if(arr[i][j]==0){continue;}
                else{
                    if(num<=arr[i][j])greater++;
                    else smaller++;
                }
            }
        }
        if(greater>smaller) return -1;
        else if(greater<smaller) return 1 ;
        else return 0;
    }
}
