package methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class methods6 {
    public static void main() {
         Scanner sc=  new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();

        System.out.println("value before changing:");
        System.out.println(a);
        System.out.println(b);
        swap(a,b);
        System.out.println("value after changing");
        System.out.println(a);
        System.out.println(b);

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("value");
        System.out.println(a);
        System.out.println(b);
    }
}
