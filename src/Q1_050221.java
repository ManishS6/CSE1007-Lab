// Question 1
// Write some nested FOR loops to produce the following output:
// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999

package src;

public class Q1_050221 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<3;i++){
            for(j=0;j<10;j++){
                for(k=0;k<3;k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
