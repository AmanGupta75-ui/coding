import java.util.Scanner;
public class shiftoperator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        double a = 315, b = 4;

        double left= a*Math.pow(2,b);

        System.out.println(left);


        int  f=10;
        int g=3;
         int ans=f<<g;
        System.out.println(ans);
        int right=f>>g;
        System.out.println(right);


        int j=54;
        int l=23;
        int k=67;
        System.out.println(j & k);
        System.out.println( l>j && l>j);




    }
}
