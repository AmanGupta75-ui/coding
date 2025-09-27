 import java.util.Scanner;
// (condition) ? "   "(if true) : "    "(if false);

      public class even_odd {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "even" : "odd");


    }
}

