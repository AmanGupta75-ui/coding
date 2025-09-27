import java.util.Scanner;

public class imp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

     int a=10;
     int b=20;
        System.out.println("before swapping"+a+" "+b);


     a=a^b;
     b=a^b;
     a=a^b;
        System.out.println( "after swapping" +a+ " "+b);


        int temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping" +a+ " "+b);



    }


}
