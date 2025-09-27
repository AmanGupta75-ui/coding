import java.util.Scanner;

public class assignmentoperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //short hand operator

        int a=28;
        a +=44;
        System.out.println( "output of short hand :" +a);


        //typecasting

        byte b=36;
        byte c=53;
        byte d=(byte)(b+c);
        System.out.println(d);

        // normal method

        int e=34;
        e=e+24;
        System.out.println(e);

        //char input

        int f=56;
        char g='s';
        int h=f+g;
        System.out.println(h);


        //byte input


        byte j=24;
        j+=75;
        System.out.println(j);


    }
}