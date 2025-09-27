import java.util.Scanner;
public class armstrongwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     /*
        int num=9474,num2;
        int org = num;
             int temp   =0;

     while(num!=0){
          num2=num%10;
         num=num/10;

         temp= temp+(num2*num2*num2  );

         System.out.println(temp);
        }
        System.out.println((temp==org)?"armstrong":"not A armstrong");

      */

        int  n=sc.nextInt();

        int num=n;
        double num2=0;
        while(n!=0){
            num2++;
            n=n/10;

        }
        double ans=0;
        n=num;
        while(n!=0) {
            double num3 = n % 10;
            ans = ans + Math.pow(num, num2);
            n=n/10;


        }
        System.out.println((n==ans)?"arm":"not a arm");


    }
}
