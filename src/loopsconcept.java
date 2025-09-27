import java.util.Scanner;
public class loopsconcept {
    public static void main(String [] args){

       int n=53738,count =0;
       while(n!=0)
       {

            n=n/10;
            count++;


       }
        System.out.println(" total no. of digit:"+count);
    }
}
