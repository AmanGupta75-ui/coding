package methods;

import java.util.Scanner;

import static methods.methods1.summation;

public class methods4 {
     public static void main() {
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println(summation(a,b));
    }
    public static int summation(int a,int b){
         return a+b;
    }
}
