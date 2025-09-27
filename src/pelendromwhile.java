import java.util.Scanner;
public class pelendromwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number=132;
        int num =number;
        int rev=0,num2;

        while(number!=0){
             num2=number%10;
             number=number/10;
             rev=rev*10+num2;


            System.out.println(rev);



        }

        System.out.println((num==rev)?"pallendrome": "not a pallendrome");
    }
}
