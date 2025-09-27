import java.util.Scanner;

public class divisible {
    public static void main( String[] args){

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();


        int   n1=num%10;
              num= num/10;

              int n2=num%10;
              num=num/10;

              int n3= num%10;
              num=num/10;

              int num4 = (n1+n2+ n3);

        System.out.println((num4 %3 ==0 )?" It is divisible :": "It is not divisible");


    }

}
