package methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class methods7 {
     public static void main() {
         Scanner sc= new Scanner(System.in);

          int a=sc.nextInt();
          int b= sc.nextInt();

         System.out.println("value before swapping :");
         System.out.println(a);
         System.out.println(b);
         int[]arr={a,b};
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         swap(arr,0,1);
         System.out.println("value after  swapping :");
         System.out.println(a);
         System.out.println(b);

    }
    public static  int[] swap(int[] arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;

    }
}
