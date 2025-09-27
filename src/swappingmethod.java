import java.util.Scanner;

public class swappingmethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=10;
        int b=20;
        System.out.println("before swap"+a +" " +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println( "after swap" +a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;



        a=a^b;
        b=a^b;
        a=a^b;






    }
}
