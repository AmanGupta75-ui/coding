import java.util.Scanner;
// (condition) ? "   "(if true) : "    "(if false);

public class ternary_operator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=56;
        int b=46;
      //  System.out.println((a!=b) ? "they are equal":"they are not equal" );

      //  String name =sc.nextLine();
       // String name2= sc.nextLine();

       // System.out.println((name==name2) ? "true":" false" );

        int num= sc.nextInt();


        System.out.println((num%2==0)? "even":"odd" );




    }
}