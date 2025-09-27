import java.util.Scanner;

public class patternwithspace {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            int n=sc.nextInt();
            int star1=4, star2=1;


            for( int i=1;i<=n; i++  ){

                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1; j++){
                    System.out.print("*");

                }
                for(int j=1; j<=n-i; j++){
                    System.out.print( " ");
                }
                System.out.println();

            }


        }
    }


