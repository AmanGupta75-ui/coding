import java.util.Scanner;

public class choppingmethod {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=5474;

        int a=5;
        int b=4;
        int c=7;

        System.out.println(a+b*10+c*100+b*1000);

        int ones =n % 10;
        n = n / 10;
        int tens = n % 10;
        n = n / 10;

        int hundread =n %10;
        n = n / 10;
        int  thausand = n% 10;
        n = n / 10;

        System.out.println( ones+" "+tens+" " +hundread+ " "+ thausand);


    }
}