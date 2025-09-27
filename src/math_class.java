import java.util.Scanner;
public class math_class {
    public static void main(String[] args) {
        Scanner  sc=  new Scanner(System.in);

         double n=2434.3333;
        System.out.println(Math.round(n));

        double a=352.657;
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.PI);
        System.out.println(Math.random());
        int b=-5;
        int c=-42;
        System.out.println(Math.abs(c-b));

         int p=sc.nextInt();

        System.out.println(Math.sqrt(p));


    }
}
