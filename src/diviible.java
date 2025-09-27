import java .util.Scanner;

public class diviible {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);

        int num=sc.nextInt();

        int n1= num%10;
        num = num/10;

        System.out.println((n1==0||n1==5)? "this is divisible":"this is not divisible");


        System.out.println((n1%5==0)? "It is divisible by 5 ":" It is not divisible");
    }

}
