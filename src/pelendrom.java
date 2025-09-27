import java.util.Scanner;

public class pelendrom {

    public static void main ( String [] args){

        Scanner sc = new Scanner (System.in);

        int num=sc.nextInt();

        int n1=num%10;
        num=num/10;
        int n2=num%10;
        num=num/10;
        int n3=num%10;
        num=num/10;

        int sum= (n1+n2*10+ n3*100);
        int sum1=(n1*100+ n2*10+n3);
        System.out.println((sum==sum1)?"this is":"this is not");




    }

}
