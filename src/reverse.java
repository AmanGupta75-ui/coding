import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {


        int num=51625815;
        int rev=0;

        while(num!=0){



            rev=rev*10+num%10;
            num=num/10;








        }
        System.out.println("the reverse number is:"+rev);
    }
}
