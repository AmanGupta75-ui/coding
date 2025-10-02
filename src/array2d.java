import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int[][] arr= {
                 {1,2,3},
                 {4,5,6},
                 {7,8,9},
         };

         int[][] arr1=new int[3][2];

         for(int i=0; i<3;i++){
             for( int j=0;j<2;j++){
                 arr1[i][j]=sc.nextInt();
             }
         }
         for(int[]a:arr1){
             System.out.println(Arrays.toString(a));
         }
         for(int[]ar:arr){
             System.out.println(Arrays.toString(ar));
         }
    }
}
