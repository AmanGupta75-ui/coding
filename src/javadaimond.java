import java.util.Scanner;
public class javadaimond {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
            // Left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Right spaces (optional)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }


            System.out.println();
        }
       for (int i = n; i >=0; i--) {

            // Left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
            }
       for (int i = 1; i <= n; i++) {
            // Left spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Right spaces (optional)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }




        }
    }


