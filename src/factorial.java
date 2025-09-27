import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();

        int factorial=1;
        while(number>0){
            factorial= factorial*number;
            number--;
        }

        System.out.println(" factorial is"+factorial);

    }
}
